package net.ceeflyer.opentimetable.obj;

public class StationOrder extends AbstractObject{
	public int distance;
	public int lineId;
	public int order;
	public int stationId;

	public int getDistance(){
		return distance;
	}

	public void setDistance(int distance){
		this.distance = distance;
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

	public int getStationId(){
		return stationId;
	}

	public void setStationId(int stationId){
		this.stationId = stationId;
	}
}
