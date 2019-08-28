package cn.smbms.text;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.smbms.pojo.Bill;
import cn.smbms.service.Bill.BillService;

public class BillText {
	public static void main(String[] args) {
		Logger logger=Logger.getLogger(BillText.class);
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		BillService pService=(BillService)ctx.getBean("BillService");
		List<Bill> list=new ArrayList<Bill>();
		Bill bill=new Bill();
		bill.setProviderName("水");
		bill.setProviderId(13);
		bill.setIsPayment(2);
		list=pService.findBillsWithConditions(bill);
	    for (Bill bill2 : list) {
			logger.debug("信息"+bill2.getProductName());
		}
		
	}
}
