package practice.utilityclasses;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LuckyRegistrationNumber {
	
		public static int  checkRegistrationNumber(String a)
		{
			if(a==null)
			{
				return -1;
			}
			Pattern p = Pattern.compile("(KA|DL)((0)[1-9]|(1)(0))([A-Z]{1,2})([1-9][0-9][0-9][0-9])");
			Matcher m = p.matcher(a);
			if(m.find())
			{
				if(a.length()==9)
				{
					int w = Character.getNumericValue(a.charAt(5));
					int x = Character.getNumericValue(a.charAt(6));
					int y = Character.getNumericValue(a.charAt(7));
					int z = Character.getNumericValue(a.charAt(8));
					
					int val =w+x+y+z;
					if(val>9)
					{
						String s = Integer.toString(val);
						int u = Character.getNumericValue(s.charAt(0));
						int v = Character.getNumericValue(s.charAt(1));
						int val1=u+v;
						if(val1==6)
						{
							return 1;
						}
						else
						{
							return 0;
						}
					}
					if(val==6)
					{
						return 1;
					}
					else
					{
						return 0;
					}
				}
				else
				{
					int w = Character.getNumericValue(a.charAt(6));
					int x = Character.getNumericValue(a.charAt(7));
					int y = Character.getNumericValue(a.charAt(8));
					int z = Character.getNumericValue(a.charAt(9));
					
					int val =w+x+y+z;
					if(val>9)
					{
						String s = Integer.toString(val);
						int u = Character.getNumericValue(s.charAt(0));
						int v = Character.getNumericValue(s.charAt(1));
						int val1=u+v;
						if(val1==6)
						{
							return 1;
						}
						else
						{
							return 0;
						}
					}
					if(val==6)
					{
						return 1;
					}
					else
					{
						return 0;
					}
					
				}
				
			}
			else
			{
				return -1;
			}
		}
		public static void main(String[] args) {
		    //CODE START
		Scanner sc = new Scanner(System.in);
		int val = checkRegistrationNumber(sc.nextLine());
		if(val==1)
		{
			System.out.println("Lucky registration number");
		}
		else if(val==0)
		{
			System.out.println("Valid registration number");
		}
		else
		{
			System.out.println("Invalid registration number");	
		}
			//CODE END
		}

	    //CODE HERE

	}
/*
 * In the class named LuckyRegistrationNumber create the following public static
 * method:
 * 
 * checkRegistrationNumber(String):int The input parameter is a vehicle
 * registration number and the output is -1, 0 or 1 based on below given rules.
 * If the Vehicle registration number is valid as per the below format the
 * method should return 0, else -1 PPXXQQYYYY PP - Should be either KA or DL XX
 * - Number from 01 to 10 QQ - 1 or 2 alphabets from A-Z(uppercase) YYYY -
 * Number from 1000 to 9999 Ex: KA01MG2323, DL10G5454 Method should return 1, if
 * the registration number is valid, and last 4 digits add up to a lucky number.
 * When last 4 digits are repeatedly added(see below) and the sum is 6, it is a
 * lucky number
 * 
 * KA01MG8484
 * 
 * 8+4+8+4 = 24 -> 2 + 4 = 6 (Lucky number)
 * 
 * If the input string is empty or null, the method should return -1.
 * 
 * Do the following in the main method of LuckyRegistrationNumber
 * 
 * Accept Registration number from the console If the Registration number is
 * invalid, display Invalid registration number If the Registration number is
 * valid but not lucky, display Valid registration number If the Registration
 * number is valid and lucky, display Lucky registration number Example Sample
 * Input: KA01MG2130
 * 
 * Expected Output: Lucky registration number Sample Input: KA09GG1234
 * 
 * Expected Output: Valid registration number Sample Input: DL10G4839
 * 
 * Expected Output: Lucky registration number Sample Input: KA01GM0839
 * 
 * Expected Output: Invalid registration number
 */