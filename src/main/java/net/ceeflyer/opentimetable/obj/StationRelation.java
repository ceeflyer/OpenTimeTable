package net.ceeflyer.opentimetable.obj;

public class StationRelation extends AbstractObject{
	public int distance;
	public int lineId;
	public int stationIdFrom;
	public int stationIdTo;

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

	public int getStationIdFrom(){
		return stationIdFrom;
	}

	public void setStationIdFrom(int stationIdFrom){
		this.stationIdFrom = stationIdFrom;
	}

	public int getStationIdTo(){
		return stationIdTo;
	}

	public void setStationIdTo(int stationIdTo){
		this.stationIdTo = stationIdTo;
	}
}
