package net.ceeflyer.opentimetable;

import net.ceeflyer.opentimetable.obj.User;
import net.ceeflyer.opentimetable.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller public class HomeController{
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired private UserService userService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET) public String home(){
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST) public String login(String name, String pass, Model model){
//		User userObj = userService.getUser(name, pass);
//		if(userObj == null){
//			model.addAttribute("error", "Login failed.");
//			return "login";
//		}
//		
//		model.addAttribute("user", "Login failed.");
		
		return "home";
	}
}
