package DataProvidorFactory_JAN26;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProviders {
	
	Properties pro;
	
	public ConfigDataProviders() {
		try {
			pro=new Properties();
			pro.load(new FileInputStream(new File(System.getProperty("user.dir")+"/Configfile/config.properties")));
		}catch (IOException e) {
			System.out.println("Unable to load Properties file "+e.getMessage());
			
		}
	}
	public String getBrowser()
	{
		return pro.getProperty("browser");
	}
	public String getStagingURL()
	{
		return pro.getProperty("stagingURL");
	}
	public String getValueFromProperties(String key)
	{
		return pro.getProperty(key);
	}

}
