package exceptions;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Customexception {

	public static void main(String[] args){
	Scanner in= new Scanner(System.in);
	    int s1=in.nextInt();
	    String s2=in.next();
	    String s3=in.next();		
	try{
	   Customer ob =new Customer(s1,s2,s3);
	   String b= ob.doRegister();
	   System.out.print(b);
	}
	    catch(ParseException e){
	    }
	    catch(LateRegistrationException e1){
	    }
	    catch(InvalidRegistrationException e2){
	    }
	}
	}


 class Customer {
private final static String startDate="2019/01/01";
private final static String lastDate="2019/02/28";
   int custId;
   String custName;
   String registerDate;
   public Customer(int custId, String custName, String registerDate) {
        this.custId = custId;
        this.custName = custName;
        this.registerDate = registerDate;
    }
    public int getCustId() {
        return custId;
    }
    public String getCustName() {
        return custName;
    }
    public String getRegisterDate() {
        return registerDate;
    }
    String doRegister() throws ParseException, LateRegistrationException, InvalidRegistrationException
    {
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy/MM/dd");
        formatter1.setLenient(false);
    try { 
     
              Date javaDate1 = formatter1.parse(this.registerDate);
              Date javaDate2 = formatter1.parse(startDate);
              Date javaDate3 = formatter1.parse(lastDate);
              if(javaDate1.getTime()>javaDate3.getTime())
                  throw new LateRegistrationException("Registration failed");
              else if(javaDate1.getTime()<javaDate2.getTime())
                  throw new InvalidRegistrationException("Invalid Date of Registration");
              else
                  return "Registered successfully";
        }
    catch (ParseException e) 
    { 
        System.out.println( e.getMessage());
        throw e;
    }
    catch(LateRegistrationException e1)
    {
        System.out.println("Registration failed");
        throw e1;
    }
     catch(InvalidRegistrationException e2)
    {
        System.out.println("Invalid Date of Registration");
        throw e2;
    }
}
}
 
class InvalidRegistrationException extends Exception {
	 private static final long serialVersionUID = 1L;
	 public InvalidRegistrationException(String message) {
	         super(message);
	     }
	 }
class LateRegistrationException extends Exception {
private static final long serialVersionUID = 1L;
public LateRegistrationException(String message) {
        super(message);
    }
}

/*
 * Write a Java Application as per the below requirements:
 * 
 * Create a User Defined checked Exception class LateRegistrationException and
 * its constructor accepts a string as exception message.
 * 
 * Create a User Defined checked Exception class InvalidRegistrationException
 * and its constructor accepts a string as exception message.
 * 
 * Consider the Customer class
 * 
 * I) With members given below:
 * 
 * 1. Two final static Strings are intialized within the class. They are: 1.
 * startDate which represents the satrt of registration. 2. lastDate which
 * represents the last date of registration.
 * 
 * 2. The value of these final static variables are hard coded with Date format
 * : yyyy/MM/dd. II) Create data members and methods as given below in the
 * Customer class
 * 
 * 1. custId : int 2. custName: String 3. registerDate: String (Accept
 * registerDate as String with date format : yyyy/MM/dd) 4. constructor method
 * with parameters 5. Include getter methods 6. doRegister():String III)
 * Complete the doRegister() method as following
 * 
 * 1. If registerDate value entered is invalid appropriate exception should be
 * thrown like Unparseable date:"2017/14/32" 2. If registerDate comes after
 * lastDate then the program has should throw LateRegistrationException with the
 * message as "Registration failed". 3. If registerDate comes before beforeDate
 * then the program should throw InvalidregistrationException with the message
 * as "Invalid Date of  Registration". 4. if registerDate is same as the
 * lastDate or beforeDate the program should ensure that the registration is
 * held successful. 5. if registerDate is between beforeDate and lastDate the
 * program should register successfully 6. Propagate the exceptions thrown to
 * the caller method. 4) Complete the main method in DateParse class
 * 
 * 1.which accepts inputs custId, custName, registerDate from console 2.It
 * should handle all the propagated exceptions of doRegister() and print
 * appropriate exception messages. Following requirements should be taken care
 * in the program.
 * 
 * Input should be taken through Console Program should print the output as
 * described in the Example Section below. Example Sample Input: 100 Meera
 * 2019/03/05 Expected Output: Registration failed Sample Input: 100 Meera
 * 2019/02/28 Expected Output: Registered successfully Sample Input: 100 Meera
 * 2019/01/12 Expected Output: Registered successfully Sample Input: 100 Meera
 * 2019/01/01 Expected Output: Registered successfully Sample Input: 100 Meera
 * 2019-01-22 Expected Output: Unparseable date:"2019-01-22" Sample Input: 100
 * "Meera" 2019/14/32 Expected Output: Unparseable date:"2017/14/32" Hints/Tips
 * Use parse() method to parse String inputs registerDate,lastDate,beforeDate to
 * Date object Use setLenient() to validate the date of Registration
 * Instructions Do not change the provided class/method names unless instructed
 * Ensure your code compiles without any errors/warning/deprecations Follow best
 * practices while coding Avoid too many & unnecessary usage of white spaces
 * (newline, spaces, tabs, ...), except to make the code readable Use
 * appropriate comments at appropriate places in your exercise, to explain the
 * logic, rational, solutions, so that evaluator can know them Try to retain the
 * original code given in the exercise, to avoid any issues in compiling &
 * running your programs Always test the program thoroughly, before
 * saving/submitting exercises/project For any issues with your exercise,
 * contact your coach
 */


