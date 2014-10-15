package net.ceeflyer.opentimetable.obj;

import java.util.Set;

public class Station extends AbstractObject{
	public enum Type{
		train,
		bus,
		port,
		airport,
		other;
	}

	public String name;
	public double place;
	public int provinceId;
	public Set<Type> type;

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public double getPlace(){
		return place;
	}

	public void setPlace(double place){
		this.place = place;
	}

	public int getProvinceId(){
		return provinceId;
	}

	public void setProvinceId(int provinceId){
		this.provinceId = provinceId;
	}

	public Set<Type> getType(){
		return type;
	}

	public void setType(Set<Type> type){
		this.type = type;
	}
}
