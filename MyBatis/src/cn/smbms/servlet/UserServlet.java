package cn.smbms.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.smbms.pojo.User;
import cn.smbms.service.user.UserService;
import cn.smbms.text.UserText;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("进入Servlet>>>>>>>>>>>");
		Logger logger=Logger.getLogger(UserText.class);
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService uService=(UserService)ctx.getBean("UserService");
		/*User user=new User();
		user.setUserName("赵");
		user.setUserRole(3);
		List<User> userList=new ArrayList<User>();
		userList=uService.findUsersWithConditions(user);
		logger.debug("userList"+userList);
		for (User user2 : userList) {
			logger.debug("信息"+user2.getUserName());
		}*/
		//测试添加
				User user = new User();
				user.setUserCode("test002");
				user.setUserName("测试用户002");
				user.setUserPassword("123456");
				/*Date time = (Date) new SimpleDateFormat("yyyy-MM-dd").parse("1900-01-01");

				user.setBirthday(time);*/
				user.setAddress("地地址");
				user.setGender(1);
				user.setPhone("13888888888");
				user.setUserRole(1);
				user.setCreatedBy(1);
				user.setCreationDate(new Date(0));
				
				boolean fig = uService.addNewUser(user);
				logger.debug("result:" + fig);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
