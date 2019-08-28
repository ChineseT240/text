package cn.smbms.text;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.smbms.dao.provider.ProviderMapper;
import cn.smbms.pojo.Provider;
import cn.smbms.service.provider.ProviderService;
import cn.smbms.service.user.UserService;

public class ProviderText {

	public static void main(String[] args) {
		Logger logger=Logger.getLogger(ProviderText.class);
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		ProviderService pService=(ProviderService)ctx.getBean("ProviderService");
		List<Provider> list=new ArrayList<Provider>();
		list=pService.findProvidersWithConditions("北");
		for (Provider provider : list) {
			logger.debug("信息"+provider.getProName());
		}
		
	}
	
	
}
