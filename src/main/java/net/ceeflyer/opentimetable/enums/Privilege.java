package net.ceeflyer.opentimetable.enums;

public enum Privilege{
	Master(3),
	Staff(2),
	Editor(1),
	Guest(0),
	;
	
	private int number;
	
	private Privilege(int number){
		this.number = number;
	}
	
	public int getNumber(){
		return number;
	}
	
	public static Privilege byNumber(int number){
		for(Privilege elem: values()){
			if(elem.number == number) return elem;
		}
		
		return Guest;
	}
}
