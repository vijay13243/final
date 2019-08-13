package practice.utilityclasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class DAYOFDATE {
		public static String  getDayOfDate(String a) throws ParseException
		{
			SimpleDateFormat form1 = new SimpleDateFormat("dd/MM/yyyy");
			SimpleDateFormat form2 = new SimpleDateFormat("EEEEEE");
			Date d = form1.parse(a);
			String s = form2.format(d.getTime());
			return s;
		}
		public static void main(String[] args) throws ParseException {
		    	Scanner sc = new Scanner(System.in);
			System.out.println(getDayOfDate(sc.nextLine()));
			
		}
		
		
	    
	}

/*
 * In the class DayOfDate create the following public static method:
 * 
 * getDayOfDate(String): String The input String to the method should be date in
 * dd/mm/yyyy format Method should return the day for the input date Assume that
 * input dates are valid as per format Do the following in the main method of
 * DayOfDate
 * 
 * Accept date string from the console Display the day for that date Example
 * Sample Input: 14/1/2019
 * 
 * Expected Output: Monday Sample Input: 12/2/2019
 * 
 * Expected Output: Tuesday Hints/Tips Use SimpleDateFormatter
 */
