package net.ceeflyer.opentimetable.obj;

public class VehicleCode extends AbstractObject{
	private String code;
	private int isMainCode;
	private String nickname;
	private int vehicleId;

	public String getCode(){
		return code;
	}

	public void setCode(String code){
		this.code = code;
	}

	public int getIsMainCode(){
		return isMainCode;
	}

	public void setIsMainCode(int isMainCode){
		this.isMainCode = isMainCode;
	}

	public String getNickname(){
		return nickname;
	}

	public void setNickname(String nickname){
		this.nickname = nickname;
	}

	public int getVehicleId(){
		return vehicleId;
	}

	public void setVehicleId(int vehicleId){
		this.vehicleId = vehicleId;
	}
}
