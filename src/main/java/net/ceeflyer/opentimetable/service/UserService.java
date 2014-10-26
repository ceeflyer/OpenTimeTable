package net.ceeflyer.opentimetable.service;

import net.ceeflyer.opentimetable.accessor.UserAccessor;
import net.ceeflyer.opentimetable.enums.Privilege;
import net.ceeflyer.opentimetable.obj.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{
	@Autowired private UserAccessor userAccessor;
	
	public User getUser(String user, String pass){
		return userAccessor.select(user, pass);
	}
	
	public boolean addUser(String user, String pass, Privilege priv){
		if(userAccessor.exists(user) > 0) return false;
		User userObj = new User(user, pass, priv);

		userAccessor.add(userObj);
		
		return true;
	}
	
	public boolean updateUser(String user, String pass, Privilege priv){
		if(userAccessor.exists(user) == 0) return false;
		User userObj = new User(user, pass, priv);
		
		userAccessor.update(userObj);

		return true;
	}
	
	public boolean deleteUser(String user, String pass){
		User userObj = userAccessor.select(user, pass);
		if(userObj == null) return false;
		userAccessor.delete(user);
		return true;
	}
}
