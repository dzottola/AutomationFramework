package com.base.helpers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfigProperty {
	
	protected InputStream input = null;
	protected Properties prop = null;
	
	
	public ReadConfigProperty() {
		try {
			input = ReadConfigProperty.class.getResourceAsStream("resources/config.properties");
			prop = new Properties();
			prop.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getUrl(){
		if (prop.getProperty("url") == null)
			return "";
		return prop.getProperty("url");
	}
	
	public String getBrowser(){
		if (prop.getProperty("browser") == null)
			return "";
		return prop.getProperty("browser");
	}
	
	public String getUsername(){
		if (prop.getProperty("username") == null)
			return "";
		return prop.getProperty("username");
	}
	
	public String getPassword(){
		if (prop.getProperty("password") == null)
			return "";
		return prop.getProperty("password");
	}

	
	
	
	
	
	
	
	
}
