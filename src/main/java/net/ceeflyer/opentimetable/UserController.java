package net.ceeflyer.opentimetable;

import net.ceeflyer.opentimetable.forms.AddUserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class UserController{
	public String addUserForm(){
		return "user/add";
	}
	
	public String addUser(AddUserForm addUserForm, Model model){
		
	}
}
