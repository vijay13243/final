/*Problem Statement - Sum And Average Of Inputs
Write a program that reads from command line arguments and prints the result. The first argument should be an integer representing the number of inputs to process. For example, if args[0] is 5 then the total number of command line arguments should be 6. The program should read the number of arguments specified by the first argument and calculate the sum & average of all numbers in the inputs. Following should be taken care of in the program:

If no command line arguments were supplied, print "NO INPUT"
If the first argument is not an int, print "FIRST ARGUMENT SHOULD BE A POSITIVE INTEGER"
If the first argument is less than 1, print "FIRST ARGUMENT SHOULD BE > 0"
If the first argument is "n" and the total number of arguments is not "n+1", then print "INSUFFICIENT INPUTS"
If sufficient inputs are given in the specified format, then the result should be as given in example:
Example
Sample Input:
3 3 def 9
Expected Output
THE SUM IS 12.0
THE AVERAGE IS 6.0
NUMERICAL INPUTS 2
NON NUMERICAL INPUTS 1
Sample Input:
3 8 asd 9
Expected Output:
THE SUM IS 17.0
THE AVERAGE IS 8.5
NUMERICAL INPUTS 2
NON NUMERICAL INPUTS 1
Sample Input:
-3 8 asd 9
Expected Output:
FIRST ARGUMENT SHOULD BE > 0
Sample Input:
asd 8 asf 9
Expected Output:
FIRST ARGUMENT SHOULD BE A POSITIVE INTEGER
Sample Input:

Expected Output:
NO INPUT
Sample Input:
3 8 asf 
Expected Output
INSUFFICIENT INPUTS*/
package exceptions;
import java.util.*;
import java.lang.*; 
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class SumandAVERGAGEOFINpUTS {

		public static void main(String[] args) {
	           Scanner in=new Scanner(System.in);
	           int i;
	           double sum=0,avg;
	           int d=0,c=0;
	           if(args.length==0){
	          	   	System.out.println("NO INPUT");
	           }
	            else if(Pattern.matches("[a-zA-Z]+", args[0])){
	           	System.out.println("FIRST ARGUMENT SHOULD BE A POSITIVE INTEGER");
	            }
	            else if(Integer.parseInt(args[0])<1){
	             	System.out.println("FIRST ARGUMENT SHOULD BE > 0");
	           }
	            else if(Integer.parseInt(args[0])+1!=args.length){
	            	System.out.println("INSUFFICIENT INPUTS");
	           }
	           else {
	           	  for(i=1;i<args.length;i++){
	           	  	if(args[i].length()==1){
	           	  		c++;
	           	  		sum+=Double.parseDouble(args[i]);
	           	  	}
	           	  	else
	           	  	{
	           	  		d++;
	           	  	}
	           	  	}
	           	  avg=sum/c;
	           	  System.out.println("THE SUM IS "+sum);
	           	  System.out.println("THE AVERAGE IS "+avg);
	           	  System.out.println("NUMERICAL INPUTS "+c);
	           	  System.out.println("NON NUMERICAL INPUTS "+d);
	           }}
		}

	


