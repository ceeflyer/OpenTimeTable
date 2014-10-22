package net.ceeflyer.opentimetable.obj;

import net.ceeflyer.opentimetable.enums.Privilege;

public class User extends AbstractObject{
	public String userID;
	public String pass;
	public int privilege;
	private Privilege privObj;
	
	public User(){
	}
	
	public User(String userID, String pass, Privilege priv){
		this.userID = userID;
		this.pass = pass;
		this.privObj = priv;
		this.privilege = priv.getNumber();
	}

	public User(String userID, String pass, int priv){
		this.userID = userID;
		this.pass = pass;
		this.privilege = priv;
		this.privObj = Privilege.byNumber(priv);
	}

	public String getUserID(){
		return userID;
	}

	public void setUserID(String userID){
		this.userID = userID;
	}
	
	public String getPass(){
		return pass;
	}
	
	public void setPass(String pass){
		this.pass = pass;
	}
	
	public Privilege getPrivObj(){
		return privObj;
	}
	
	public void setPrivObj(Privilege privObj){
		this.privObj = privObj;
	}
}
