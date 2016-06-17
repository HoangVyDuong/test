package com.java;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@TableGenerator(name = "user" )
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long UserID;
	
	
	@Column( name = "UserName")
	private String UserName;
	
	@Column (name = "Used")
	private boolean Used;
	
	

		
	

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public boolean isUsed() {
		return Used;
	}

	public void setUsed(boolean used) {
		Used = used;
	}

	public User(Long userID, String userName, boolean used) {

		UserID = userID;
		UserName = userName;
		Used = used;
	}

	public User() {
		super();
	}
	
	
	
}
