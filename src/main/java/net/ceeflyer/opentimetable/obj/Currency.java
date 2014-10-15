package net.ceeflyer.opentimetable.obj;

public class Currency extends AbstractObject{
	public String name;
	public String symbol;
	public int rate;

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getSymbol(){
		return symbol;
	}

	public void setSymbol(String symbol){
		this.symbol = symbol;
	}

	public int getRate(){
		return rate;
	}

	public void setRate(int rate){
		this.rate = rate;
	}
}
