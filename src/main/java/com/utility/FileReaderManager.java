package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

public class FileReaderManager {
	private static FileInputStream fileInputStream;
	private static Properties property;
	public static void setUpProperty() {
		File file = new File
				("C:\\Users\\navee\\eclipse-workspace_1\\mavenproject\\src\\main\\resources\\TestData.properties");
				try {
				fileInputStream = new FileInputStream(file);
				property = new Properties(); property.load(fileInputStream);
				} catch (FileNotFoundException e) {
				Assert.fail("ERROR: OCCURS DURING THE FILE REAING CHECK FILE INPUT STREAM");
				} catch (IOException e) {
				Assert.fail("ERROR OCCURS DURING THE INPUT AND OUTPUT CHECK PROPERTY");
				}
	}
				public String getDataProperty(String key) 
				{ 
					
			    setUpProperty();
				String value = property.getProperty(key); 
				return value;
	}
}
