package practice.utilityclasses;
import java.util.Comparator;
import java.util.Scanner;


public class MAXDIGITINASTRING {
	    //CODE HERE
	    public static int getMaxDigit(String a)
	    {
	    	if(a==null)
	    	{ 
	    		return -1;
	    	}
	    	int max=0;
	    	int count=0;
	    	for(char ch:a.toCharArray())
	    	{
	    		if(Character.isDigit(ch))
	    		{
	    			int z=Character.getNumericValue(ch);
	    			count=count+1;
	    			if(z>max)
	    			{
	    				max=z;
	    			}
	    		}
	    	}
	    	if (count==0)
	    	{
	    		return -1;
	    	}
	    	return max;
	    }

		public static void main(String[] args) {
	        //CODE START
	        Scanner sc=new Scanner(System.in);
	        int val=getMaxDigit(sc.nextLine());
	        if(val==0)
	        {
	        	System.out.println("Max digit:"+val);
	        }
	        else if(val==-1)
	        {
	        	System.out.println("No digits in string");
	        }
	        else{
	        	System.out.println("Max digit:"+val);
	        }
	        
	        //CODE END
		}
	}
/*
 * In the given class MaxDigitInString, create the following public static
 * method
 * 
 * getMaxDigit(String):int The input String to the method should be scanned for
 * digits and the maximum digit should be returned. Input String can contain
 * alphanumeric character, spaces and special characters If the input string is
 * empty/null or does not contain any digits, -1 should be returned. Do the
 * following in the main method of MaxDigitInString class
 * 
 * Accept a String from the console Display the maximum digit using the
 * getMaxDigit method as shown in example section Display No digits in string,
 * if the String has no digits or is empty Example Sample Input: p5q6r7
 * 
 * Expected Output: Max digit : 7 Sample Input: pqr
 * 
 * Expected Output: No digits in string Sample Input: p1 q2 r3
 * 
 * Expected Output: 3
 */
