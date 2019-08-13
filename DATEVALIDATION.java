
package exceptions;
import java.util.Scanner;
public class DATEVALIDATION {
    public static void main(String[] args) {
	
	   // STUDENT CODE BEGINS HERE
Scanner sc= new Scanner(System.in);
		//System.out.println("enter date");
		String date = sc.nextLine();
		if(Utility.checkDate(date)==1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");

       // STUDENT CODE ENDs HERE
	
    }
}
 class Utility {
	// STUDENT CODE BEGINS HERE
static int checkDate(String date) {
		
		String[] s= date.split("[-./]+");
		int d[]= new int[3];
		for(int i=0; i<3;i++) {
			String a[] = s;
			//System.out.println(a[i]);
			try{d[i] = Integer.parseInt(a[i]);}
			catch(Exception e) {
				return -1;
			}
			
		}
		if(d[2]>2000) {
			if(d[1]>=1 && d[1]<=12 ) {
				if(d[1]==2) {
					if(d[0]<=28) {
						return 1;
					}
					else {
						return -1;
					}
				}
				else if(d[1]==1||d[1]==3||d[1]==5||d[1]==7||d[1]==8||d[1]==10||d[1]==12) {
							if(d[0]<=31) {
								return 1;
							}
							else {
								return -1;
						}
					 }		
				else if(d[1]==4||d[1]==6||d[1]==9||d[1]==11) {
							if(d[0]<=30) {
								return 1;
							}
							else {
								return -1;
							}
				
			}	
				else {
					return -1;
				}
			}
			else {
				return -1;
			}
		}
		else {
				return -1;
				}
	}	


     // STUDENT CODE ENDs HERE

}
/*
 * Write a Program to find whether the given string is a valid Date or not.
 * 
 * Create a class Utility with the following static method
 * 
 * int checkDate(String)
 * 
 * The method input parameter(String) should be parsed and checked if it matches
 * the formats given below
 * 
 * dd/MM/yyyy dd-MM-yyyy dd.MM.yyyy
 * 
 * 1. If the input is a valid date as per any of the above formats the method
 * should return 1 2. If the input is a invalid date the method should return -1
 * 3. If any other input pattern which does not match with above formats the
 * method should return -1 Complete the main method in class DateValidation as
 * below
 * 
 * Program should take console input and call checkDate method of Utility class
 * 
 * if the method returns 1 print "Valid" if the method returns -1 print
 * "Invalid" Input and Output sample formats are given below in Example section
 * 
 * Following requirements should be taken care in the program.
 * 
 * Input should be taken through Console
 * 
 * Program should print the output as described in the Example Section below
 * 
 * Example Sample Input 1: 12.12.2019 Expected Output: Valid Sample Input 2:
 * 32.11.2019 Expected Output: Invalid Sample Input 3: 12.14.2019 Expected
 * Output: Invalid Sample Input 4: 12-14-2019 Expected Output: Invalid Sample
 * Input 5: 32/11/2019 Expected Output: Invalid Sample Input 5: 30-02-2019
 * Expected Output: Invalid
 */

