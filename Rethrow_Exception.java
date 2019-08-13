package exceptions;
import java.util.Scanner;
public class Rethrow_Exception {

	  
	    public static void main(String[] args) {
	     Scanner in=new Scanner(System.in);
	     String s=in.nextLine();
	     RethrowClass ob=new RethrowClass();
	     try{
	     ob.doRethrow(s);
	     }
	     catch(Exception e){
	         System.out.println(e.getMessage());
	     }
	    }
	}



 class FirstException extends Exception{
	
	private static final long serialVersionUID = 1111L;
	public FirstException(String message){
	super(message);
	}
		
}
 class RethrowClass {
		
		public  void doRethrow(String exceptionName) throws FirstException,SecondException,Exception
		{
		    try{
	        if(exceptionName.equals("First") || exceptionName.equals("first")){
	            throw new FirstException("Message from First Exception");
	        }
	        else if(exceptionName.equals("Second")||exceptionName.equals("second")){
	            throw new SecondException("Message from Second Exception");
	        }
	        else{
	             throw new Exception("Exception occurred");   
	        }
		    }
		    catch(FirstException  | SecondException e ){
		        System.out.print("The FirstException or SeconException is logged");
		        throw e;
		    }
		    catch(Exception e){
		        throw e;
		    }
		}

	}
 
 class SecondException  extends Exception{
		private static final long serialVersionUID = 111111L;
	     public SecondException(String message){
	        super(message); 
	     }	

	}

/*
 * Write a Java Application as per the below requirements:
 * 
 * Create two Custom checked Exception classes FirstException and
 * SecondException and their contructors accepts a string as exception message.
 * 
 * Create a class RethrowClass which has member method
 * 
 * doRethrow(String exceptionName):void
 * 
 * Complete the above method with following requirement:
 * 
 * 1. If exceptionName value is "First", the program should throw FirstException
 * object with message raised as "Message from First Exception" 2. If the
 * exceptionName value is "Second", the program should throw SecondException
 * object with message raised as "Message from Second Exception" 3. Any other
 * value given to exceptionName, program should throw Exception object with
 * message raised as "Exception occurred" 4. The exceptions should be handled
 * within the method. Use multi catch handlers for FirstException and
 * SecondException, which displays the message
 * "The FirstException or SecondException is logged" 5. The exception handlers
 * have to propagate the exceptions by rethrowing it to the caller method. 4)
 * Complete the main method in RethrowException class which handles all Custom
 * defined exception and print appropriate exception messages.
 * 
 * Following requirements should be taken care in the program.
 * 
 * Input should be taken through Console Program should print the output as
 * described in the Example Section below. Example Sample Input: First Expected
 * Output: The FirstException or SecondException is logged Message from First
 * Exception Sample Input: Second Expected Output: The FirstException or
 * SecondException is logged Message from Second Exception Sample Input: XXX
 * Expected Output: Exception occurred Sample Input: second Expected Output: The
 * FirstException or SecondException is logged Message from Second Exception
 * Sample Input: third Expected Output: Exception occurred
 */