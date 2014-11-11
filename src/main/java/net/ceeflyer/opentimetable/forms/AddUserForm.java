package net.ceeflyer.opentimetable.forms;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.lang.StringUtils;

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
	
	public boolean isPasswordVerify(){
		return StringUtils.isNotEmpty(pass) && pass.equals(passVerify);
	}
	
	public void encodePass() throws NoSuchAlgorithmException{
		if(pass != null){
			MessageDigest.getInstance("MD5");
		}
	}

	public int getPrivilege(){
		return privilege;
	}

	public void setPrivilege(int privilege){
		this.privilege = privilege;
	}
}
