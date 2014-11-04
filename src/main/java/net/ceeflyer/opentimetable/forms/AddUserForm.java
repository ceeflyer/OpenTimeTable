package net.ceeflyer.opentimetable.forms;

public class AddUserForm implements Form{
	private String userId;
	private String nickname;
	private String pass;
	private String passVerify;
	private int privilege;

	public String getUserId(){
		return userId;
	}

	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getNickname(){
		return nickname;
	}

	public void setNickname(String nickname){
		this.nickname = nickname;
	}

	public String getPass(){
		return pass;
	}

	public void setPass(String pass){
		this.pass = pass;
	}

	public String getPassVerify(){
		return passVerify;
	}

	public void setPassVerify(String passVerify){
		this.passVerify = passVerify;
	}

	public int getPrivilege(){
		return privilege;
	}

	public void setPrivilege(int privilege){
		this.privilege = privilege;
	}
}
