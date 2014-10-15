package net.ceeflyer.opentimetable.obj;

public class Company extends AbstractObject{
	public String name;
	public int countryid;
	
	public int getCountryid(){
		return countryid;
	}
	
	public void setCountryid(int countryid){
		this.countryid = countryid;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}
