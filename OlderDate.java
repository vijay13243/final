package practice.utilityclasses;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class OlderDate {

		public static String  findOlderDate(String a, String b) throws ParseException{
			
			String res;
			SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
			SimpleDateFormat format2 = new SimpleDateFormat("dd-MM-yyyy");
			Date d1 = format1.parse(a);
			Date d2 = format1.parse(b);
			
			if(d1.getTime()<d2.getTime())
			{
				res= format2.format(d1.getTime());
			} 
			else if(d1.getTime()>d2.getTime())
			{
				res= format2.format(d2.getTime());
			}
			else{
				res="equal";
			}
			return res;
		}	 
		public static void main(String[] args) throws ParseException {
		    //CODE START
			
			Scanner sc = new Scanner(System.in);
			String res = findOlderDate(sc.next(),sc.next());
			if(res.equals("equal"))
				System.out.println("Dates are same");
			else
				System.out.println(res);
			//CODE END
		}

		//CODE HERE

	}
/*
 * In the class OlderDate create the following public static method:
 * 
 * findOlderDate(String, String): String The input parameters to the method are
 * two valid dates in format dd/mm/yyyy. The method should return the older of
 * two dates in format dd-mm-yyyy If both dates are same return equal Do the
 * following in the main method of OlderDate class
 * 
 * Accept two dates as String from the console Display the older date as output
 * if both the input dates are same display Dates are same Example Sample Input:
 * 01/01/2018 01/02/2019
 * 
 * Expected Output: 01-01-2018 Sample Input: 10/01/2019 01/01/2019
 * 
 * Expected Output: 01-01-2019 Sample Input: 10/01/2019 10/01/2019
 * 
 * Expected Output: Dates are same Hints/Tips use SimpleDateFormat class
 */


