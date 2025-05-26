package test.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class readPropertyfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		Properties pp=new Properties();
		
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\test\\src\\test\\java\\ataf\\APPDetails.properties");
	
		pp.load(file);
		
		file.close();
		pp.getProperty("APP");
		String name=pp.getProperty("username");
		System.out.println(pp.getProperty("Username"));
		
		
		//capture Allkeys
		Set<String> keys=pp.stringPropertyNames();
		for(String key :keys)
		{
			System.out.println(key);
		}
	}

}
