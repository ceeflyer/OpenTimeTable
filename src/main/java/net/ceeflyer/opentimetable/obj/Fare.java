package net.ceeflyer.opentimetable.obj;

public class Fare extends AbstractObject{
	public int fareGroupId;
	public int relationId;
	public int currencyId;
	public int fare;

	public int getFareGroupId(){
		return fareGroupId;
	}

	public void setFareGroupId(int fareGroupId){
		this.fareGroupId = fareGroupId;
	}

	public int getRelationId(){
		return relationId;
	}

	public void setRelationId(int relationId){
		this.relationId = relationId;
	}

	public int getCurrencyId(){
		return currencyId;
	}

	public void setCurrencyId(int currencyId){
		this.currencyId = currencyId;
	}

	public int getFare(){
		return fare;
	}

	public void setFare(int fare){
		this.fare = fare;
	}
}
