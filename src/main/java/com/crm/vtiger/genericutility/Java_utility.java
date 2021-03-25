package com.crm.vtiger.genericutility;

import java.util.Date;
/**
 * 
 * @ Abhishek
 */
import java.util.Random;

public class Java_utility {
	
	/**
	 * 
	 *  used to generate the random data with in 1000 limit
	 * @return
	 */
	public int RandomNum()
	{
		Random r=new Random();
		int randInt = r.nextInt(1000);
		return randInt;
	}
	
	public String getCurrentSystemDate()
	{
		/**
		 * 
		 * used to get the current system Data
		 */
		
		Date date=new Date();
		String currentdate = date.toString();
		return currentdate;
	}

}
