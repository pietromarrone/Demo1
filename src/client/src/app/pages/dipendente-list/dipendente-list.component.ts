/* 
* Generated by
* 
*      _____ _          __  __      _     _
*     / ____| |        / _|/ _|    | |   | |
*    | (___ | | ____ _| |_| |_ ___ | | __| | ___ _ __
*     \___ \| |/ / _` |  _|  _/ _ \| |/ _` |/ _ \ '__|
*     ____) |   < (_| | | | || (_) | | (_| |  __/ |
*    |_____/|_|\_\__,_|_| |_| \___/|_|\__,_|\___|_|
*
* The code generator that works in many programming languages
*
*			https://www.skaffolder.com
*
*
* You can generate the code from the command-line
*       https://npmjs.com/package/skaffolder-cli
*
*       npm install -g skaffodler-cli
*
*   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
*
* To remove this comment please upgrade your plan here: 
*      https://app.skaffolder.com/#!/upgrade
*
* Or get up to 70% discount sharing your unique link:
*       https://app.skaffolder.com/#!/register?friend=5ad3007390b40a2b2d5f45fc
*
* You will get 10% discount for each one of your friends
* 
*/
import { Component } from '@angular/core';
import { OnInit } from '@angular/core';
// Import Services
import { DipendenteService } from '../../services/dipendente.service';
// Import Models
import { Dipendente } from '../../domain/demo1_db/dipendente';

// START - USED SERVICES
/**
* DipendenteService.delete
*	@description CRUD ACTION delete
*	@param ObjectId id Id
*
* DipendenteService.list
*	@description CRUD ACTION list
*
*/
// END - USED SERVICES

/**
 * This component shows a list of Dipendente
 * @class DipendenteListComponent
 */
@Component({
    selector: 'app-dipendente-list',
    templateUrl: './dipendente-list.component.html',
    styleUrls: ['./dipendente-list.component.css']
})
export class DipendenteListComponent implements OnInit {
    list: Dipendente[];
    search: any = {};
    idSelected: string;
    constructor(
        private dipendenteService: DipendenteService,
    ) { }

    /**
     * Init
     */
    ngOnInit(): void {
        this.dipendenteService.list().subscribe(list => this.list = list);
    }

    /**
     * Select Dipendente to remove
     *
     * @param {string} id Id of the Dipendente to remove
     */
    selectId(id: string) {
        this.idSelected = id;
    }

    /**
     * Remove selected Dipendente
     */
    deleteItem() {
        this.dipendenteService.remove(this.idSelected).subscribe(data => this.list = this.list.filter(el => el._id !== this.idSelected));
    }

}
