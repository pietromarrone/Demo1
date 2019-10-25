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
package com.demo1.db.demo1_db.entity.base;

/**
 * 
 * 
  _____                      _              _ _ _     _   _     _        __ _ _      
 |  __ \                    | |            | (_) |   | | | |   (_)      / _(_) |     
 | |  | | ___    _ __   ___ | |_    ___  __| |_| |_  | |_| |__  _ ___  | |_ _| | ___ 
 | |  | |/ _ \  | '_ \ / _ \| __|  / _ \/ _` | | __| | __| '_ \| / __| |  _| | |/ _ \
 | |__| | (_) | | | | | (_) | |_  |  __/ (_| | | |_  | |_| | | | \__ \ | | | | |  __/
 |_____/ \___/  |_| |_|\___/ \__|  \___|\__,_|_|\__|  \__|_| |_|_|___/ |_| |_|_|\___|
 
                                                                                   
 * DO NOT EDIT THIS FILE!! 
 *
 *  FOR CUSTOMIZE UserBase PLEASE EDIT ../User.java
 * 
 *  -- THIS FILE WILL BE OVERWRITTEN ON THE NEXT SKAFFOLDER CODE GENERATION --
 * 
 */
 

/**
 * This is the model of User object
 * 
 */
 
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

import org.mongodb.morphia.annotations.Id;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.demo1.utils.ObjectIdListSerializer;


//IMPORT RELATIONS
import com.demo1.db.demo1_db.entity.User;

@Entity("User")
public class UserBase {
	
	@Id
	@JsonSerialize(using = ToStringSerializer.class)
	private ObjectId _id;
	
	// Attributes
    private String token;
    private ArrayList<String> roles;
    private String mail;
    private String name;
    private String password;
    private String surname;
    private String username;
	
	
	
	
	

    // GETTER AND SETTER
    
	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId id) {
		this._id = id;
	}


	
	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}
    
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
    
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
    
	public ArrayList<String> getRoles() {
		return roles;
	}


	public void setRoles(ArrayList<String> roles) {
		this.roles = roles;
	}
	
	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}
    
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}
    

	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	public boolean hasRole(String role) {
		return roles.indexOf(role) != -1;
	}
	
    
    
    
    
}