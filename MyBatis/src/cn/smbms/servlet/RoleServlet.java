package cn.smbms.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.smbms.pojo.Role;
import cn.smbms.service.role.RoleService;
import cn.smbms.service.user.UserService;

/**
 * Servlet implementation class RoleServlet
 */
public class RoleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ApplicationContext cxt=new ClassPathXmlApplicationContext("applicationContext.xml");
		RoleService rService=(RoleService)cxt.getBean("RoleService");
		UserService uService=(UserService)cxt.getBean("UserService");
		Role role=new Role();
		role.setId(4);
		role.setRoleName("员工");
		//简答第一小题
	//	int num=rService.RoleUpdate(role);
		if (uService.SelectId(role.getId())!=null) {
			uService.DeleteuserRole(role.getId());
			int num=rService.Delect(role.getId());
			System.out.println("影响行数:"+num);
		}else{
			System.out.println("没有该id");
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
