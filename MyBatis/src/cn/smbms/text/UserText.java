package cn.smbms.text;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.smbms.pojo.User;
import cn.smbms.service.user.UserService;

public class UserText {

	public static void main(String[] args) {
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
				user.setUserCode("test001");
				user.setUserName("测试用户001");
				user.setUserPassword("123456");
			//	Date time = (Date) new SimpleDateFormat("yyyy-MM-dd").parse("1900-01-01");

			//	user.setBirthday(time);
				user.setAddress("地地址");
				user.setGender(1);
				user.setPhone("13888888888");
				user.setUserRole(1);
				user.setCreatedBy(1);
				user.setCreationDate(new Date(0));
				/*
				boolean fig = uService.addNewUser(user);
				logger.debug("result:" + fig);*/
				System.out.println("修改");
				int num=uService.Update(user);
				System.out.println("num    "+num);
						
						
				
	}
}
