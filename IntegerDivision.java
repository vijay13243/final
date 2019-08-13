package exceptions;
import java.util.*;
public class IntegerDivision {



		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			int i;
			int[] a=new int[2];
			try{
			for(i=0;i<args.length;i++){
				a[i]=Integer.parseInt(args[i]);
			}
			if(args.length<2){
				throw new ArrayIndexOutOfBoundsException("error");
			}
			int c;
			c=a[0]/a[1];
			System.out.println("Quotient="+c);
			}
			catch(ArithmeticException ex)
			{
				System.out.println("Attempted to divide by zero");
			}
			catch (NumberFormatException  exception){
				System.out.println("A non-integer input was given");
			}
			catch(ArrayIndexOutOfBoundsException ex){
				System.out.println("2 inputs were not supplied");
			}
		}
		
	}

/*
 * Problem Statement Write a program to accept inputs from the command line and
 * print messages based on the inputs.
 * 
 * If there are two integer inputs, the program should divide the first input by
 * second one and print the quotient (For example, "Quotient=3") If there are
 * less than 2 inputs, print the message "2 inputs were not supplied". If there
 * are two integers and the second one is zero, print he message
 * "Attempted to divide by zero". If there are two inputs and atleast one of
 * them is not an integer, then print the message
 * "A non-integer input was given". Instructions Ensure your code compiles
 * without any errors/warning/deprecations Follow best practices while coding
 * Avoid too many & unnecessary usage of white spaces (newline, spaces, tabs,
 * ...), except to make the code readable Use appropriate comments at
 * appropriate places in your exercise, to explain the logic, rational,
 * solutions, so that evaluator can know them Try to retain the original code
 * given in the exercise, to avoid any issues in compiling & running your
 * programs Always test the program thoroughly, before saving/submitting
 * exercises/project For any issues with your exercise, contact your coach
 * Warnings Take care of whitespace/trailing whitespace Trim the output and
 * avoid special characters Avoid printing unnecessary values other than
 * expected/asked output Hints/Tips Use try block with multiple catch blocks
 * Example Sample Input 1: ASDF PQRS Expected Output: A non-integer input was
 * given
 * 
 * Sample Input 2: 123 0 Expected Output: Attempted to divide by zero
 * 
 * Sample Input 3: 123 0 Expected Output: Attempted to divide by zero
 * 
 * Sample Input 4:
 * 
 * Expected Output: 2 inputs were not supplied
 * 
 * Sample Input 5: 22 7 Expected Output: Quotient=3
 */



