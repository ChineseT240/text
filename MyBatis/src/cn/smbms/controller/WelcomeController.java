package cn.smbms.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class WelcomeController {

	private Logger logger=Logger.getLogger(WelcomeController.class);
	
	@RequestMapping(value="/welcome")
	public String welcome(@RequestParam(value="userName",required=false) String userName){
		
		logger.info("welcome>>>>>>>"+userName);
		return "welcome";
	}
}
