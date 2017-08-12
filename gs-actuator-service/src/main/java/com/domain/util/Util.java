package com.domain.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.UUID;

public class Util {
	// /project-root/src/main/resources/config.properties
	private final static String pathToProperties = "src/main/resources/";
	private final static String propertiesFileName = "config.properties";
	
	private static Properties properties = null;
	
	private static void openProperties() {
		InputStream input = null;
		try {

			input = new FileInputStream(pathToProperties + propertiesFileName);

			// load a properties file
			properties = new Properties();
			properties.load(input);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static String getProperty(String property) {
		if(properties == null) {
			openProperties();
		}
		return properties.getProperty(property);
	}
	
	
	public static String getRandomString(Integer length) {
		length = length < 30 ? length : 30; 
		String s = UUID.randomUUID()
				.toString()
				.replace("-","");
		return s.substring(0, length);
	}
}
