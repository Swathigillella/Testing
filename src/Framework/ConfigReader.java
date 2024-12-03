package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader{
	private static Properties properties;
	static{
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\swathi\\eclipse-workspace\\Selenium New Workspace\\JavaPrograms\\src\\Framework\\config.PROPERTIES");
			properties=new Properties();
			properties.load(fis);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static String getProperty(String key) {
		return properties.getProperty(key);
		
	}
	
}
