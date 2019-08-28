package cn.smbms.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/*import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;*/

@Controller
public class IndexController{

	private Logger logger=Logger.getLogger(IndexController.class);
	//@RequestMapping表示方法与那个请求URL来对应(此处:"/index")
	@RequestMapping("/index")
	public ModelAndView index(String userName){
		ModelAndView mView=new ModelAndView();
		mView.setViewName("index");
		return mView;
	}
}
