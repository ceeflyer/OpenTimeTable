package net.ceeflyer.opentimetable.obj;

public class LineFare extends AbstractObject{
	public int lineId;
	public int fareId;
	
	public int getFareId(){
		return fareId;
	}
	
	public void setFareId(int fareId){
		this.fareId = fareId;
	}
	
	public int getLineId(){
		return lineId;
	}
	
	public void setLineId(int lineId){
		this.lineId = lineId;
	}
}
