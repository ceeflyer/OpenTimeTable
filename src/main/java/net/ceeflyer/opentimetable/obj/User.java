package net.ceeflyer.opentimetable.obj;

import net.ceeflyer.opentimetable.enums.Privilege;

public class User{
	public String userID;
	public String encPass;
	public int privilege;
	private Privilege privObj;

	public String getUserID(){
		return userID;
	}

	public void setUserID(String userID){
		this.userID = userID;
	}

	public String getEncPass(){
		return encPass;
	}

	public void setEncPass(String encPass){
		this.encPass = encPass;
	}
	
	public Privilege getPrivObj(){
		return privObj;
	}
	
	public void setPrivObj(Privilege privObj){
		this.privObj = privObj;
	}
}
