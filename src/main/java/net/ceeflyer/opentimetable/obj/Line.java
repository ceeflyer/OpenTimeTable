package net.ceeflyer.opentimetable.obj;

public class Line extends AbstractObject{
	public String name;
	public String nickname;
	public int companyId;
	
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getNickname(){
		return nickname;
	}
	
	public void setNickname(String nickname){
		this.nickname = nickname;
	}
	
	public int getCompanyId(){
		return companyId;
	}
	
	public void setCompanyId(int companyId){
		this.companyId = companyId;
	}
}
