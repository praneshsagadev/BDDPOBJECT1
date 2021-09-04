package initializer;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropertyIntializer {
	
public	static Properties prop;
	
	public static void initialize() throws IOException {
		
		File file = new File("D:\\SELENIUM WORKSPACE\\BDDCucumberPageObject1\\src\\test\\resources\\File\\property.properties");
		
		FileInputStream fis  = new FileInputStream(file);
		
	 prop = new Properties();
		
		prop.load(fis);
	}

}
