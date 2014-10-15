package net.ceeflyer.opentimetable.obj;

public class Vehicle extends AbstractObject{
	private int continuousId;
	private int endOrder;
	private int lineId;
	private String name;
	private int nextId;
	private int startOrder;

	public int getContinuousId(){
		return continuousId;
	}

	public void setContinuousId(int continuousId){
		this.continuousId = continuousId;
	}

	public int getEndOrder(){
		return endOrder;
	}

	public void setEndOrder(int endOrder){
		this.endOrder = endOrder;
	}

	public int getLineId(){
		return lineId;
	}

	public void setLineId(int lineId){
		this.lineId = lineId;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getNextId(){
		return nextId;
	}

	public void setNextId(int nextId){
		this.nextId = nextId;
	}

	public int getStartOrder(){
		return startOrder;
	}

	public void setStartOrder(int startOrder){
		this.startOrder = startOrder;
	}
}
