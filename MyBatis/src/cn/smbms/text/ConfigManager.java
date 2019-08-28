package cn.smbms.text;

import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {
    //类加载时,自行进行初始化操作
	private static ConfigManager configManager;
	
	private static Properties properties;
	
	//私有构造器----读取数据库配置文件
	private ConfigManager(){
		String configFile="database.properties";
		properties=new Properties();
		InputStream is=ConfigManager.class.getClassLoader().getResourceAsStream(configFile);
		
		try {
			properties.load(is);
			is.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}
	//饿汉模式
	public static ConfigManager getInstance(){
		return configManager;
	}
	public String getValue(String key){
		return properties.getProperty(key);
		
	}
}
