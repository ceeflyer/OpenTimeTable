package net.ceeflyer.opentimetable.obj;

public class LoggedSession{
	private String userId;
	private String nickname;
	private String sessionId;
	
	public LoggedSession(){
	}
	
	public String getNickname(){
		return nickname;
	}
	
	public void setNickname(String nickname){
		this.nickname = nickname;
	}
	
	public String getSessionId(){
		return sessionId;
	}
	
	public void setSessionId(String sessionId){
		this.sessionId = sessionId;
	}
	
	public String getUserId(){
		return userId;
	}
	
	public void setUserId(String userId){
		this.userId = userId;
	}
}
