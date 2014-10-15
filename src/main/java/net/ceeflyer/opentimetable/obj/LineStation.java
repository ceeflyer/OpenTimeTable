package net.ceeflyer.opentimetable.obj;

public class LineStation extends AbstractObject{
	public int stationId;
	public int lineId;
	public int order;

	public int getStationId(){
		return stationId;
	}

	public void setStationId(int stationId){
		this.stationId = stationId;
	}

	public int getLineId(){
		return lineId;
	}

	public void setLineId(int lineId){
		this.lineId = lineId;
	}

	public int getOrder(){
		return order;
	}

	public void setOrder(int order){
		this.order = order;
	}
}
