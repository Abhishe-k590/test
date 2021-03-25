package com.crm.vtiger.genericutility;

import java.io.FileInputStream;
/**
 * 
 * 
 * @author abhishek
 */
import java.util.Properties;

public class Fileutilities 
{
	/**
	 * Used to read data from property file
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	
	public String readdatafromprofile( String key) throws Throwable 
	{
		Properties prop=new Properties( );
		FileInputStream fis=new FileInputStream(PathConstants.propertiespath);
				prop.load(fis);
		return prop.getProperty(key);
		
	}

	
	}
	


