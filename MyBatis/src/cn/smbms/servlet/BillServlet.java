package cn.smbms.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mybatis.spring.mapper.ClassPathMapperScanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.smbms.pojo.Bill;
import cn.smbms.service.Bill.BillService;
import cn.smbms.service.user.UserService;

/**
 * Servlet implementation class BillServlet
 */
public class BillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("进入Servlet>>>>>>");
		ApplicationContext cxt=new ClassPathXmlApplicationContext("applicationContext.xml");
		BillService bService=(BillService)cxt.getBean("BillService");
		//删除
		/*int num=bService.DelectId(20);
		System.out.println("num"+num);*/
		
		Bill bill=new Bill();
		bill.setProviderId(13);
		bill.setId(1);
		bill.setBillCode("jj");
	/*	int num=bService.Updata(bill);
		*/
		int num=bService.Add(bill);
		System.out.println("num"+num);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
