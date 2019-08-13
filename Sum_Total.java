package practice.utilityclasses;
import java.util.Scanner;
import java.lang.Math;


public class Sum_Total {

		public static int calculateTotal(String a)
		{
			int res=0;
			if(a.length()!=0)
			{
			String[] arr = a.split(",");
			
			float sum=0;
			for (String c:arr)
			{
				String[] arr1=c.split(":");
				sum=sum+(Float.parseFloat(arr1[0])*Float.parseFloat(arr1[1]));
				res = Math.round(sum);
			}
			}
			return res;
		}
		public static void main(String[] args) {
			//CODE START
			Scanner sc =new Scanner(System.in);
			System.out.println(calculateTotal(sc.nextLine()));
			//CODE END
		}
	}
/*
 * In the class SumTotal, create the following static method
 * 
 * calculateTotal(String):int The input String to the method contains the
 * quantity and price of multiple items in the below format
 * 
 * 2:10.5,2:20.25,3:30.5
 * 
 * Details for multiple items are separated by comma Quantity and price of each
 * item is separated by colon. Price can be integer or floating point Input can
 * contain detail for only one item also Method should calculate the total sum
 * by multiplying quantity and price for each item and adding it to total. The
 * final total should be rounded to the nearest integer and returned
 * 
 * If input String is empty, return 0 Do the following in the main method
 * 
 * Accept a String with item details from the console Calculate the sum total
 * and display it Example Sample Input: 2:10.5,2:20.25,3:30.5
 * 
 * Expected Output: 153 Sample Input: 1:10,3:15.25,3:5.5
 * 
 * Expected Output: 72
 */


