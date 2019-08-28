package cn.smbms.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import cn.smbms.pojo.Role;
import cn.smbms.service.role.RoleService;

@Controller
@RequestMapping("/user")
public class userCodeController {

	private Logger logger=Logger.getLogger(userCodeController.class);
	
	@Autowired
	private RoleService roleService;
	@RequestMapping("/success")
	public String Show(@RequestParam(value="userCode",required=false)String userCode,Model model){
     
		Role role= roleService.SelectRole(userCode);
		logger.info("userCode>>>>>>>>>"+userCode);
		if (role!=null) {
			model.addAttribute("userCode",userCode);
		}else{
			model.addAttribute("userCode","没有查到此数据!");
		}	
		return "success";
		
	}
}
