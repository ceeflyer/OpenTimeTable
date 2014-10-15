package net.ceeflyer.opentimetable.obj;

public abstract class AbstractObject implements Comparable<AbstractObject>{
	public int id;

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	@Override public int compareTo(AbstractObject o){
		return this.id > o.id? 1: this.id < o.id? -1: 0;
	}
}
