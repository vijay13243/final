package exceptions;

import java.util.Scanner;

class Employeee {
	int empNo;
	String empName;
	int balanceLeave;

	public Employeee(int empNo, String empName, int balanceLeave) {
		this.empNo = empNo;
		this.empName = empName;
		this.balanceLeave = balanceLeave;
	}

	public int getEmpNo() {
		return empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public int getBalanceLeave() {
		return balanceLeave;
	}

	int getLeave(int a) throws InvalidLeave, InsufficientLeave {
		try {
			if (this.balanceLeave < 0)
				throw new InvalidLeave("Negative Leave balance");
			else if (a > this.balanceLeave)
				throw new InsufficientLeave("Insufficient Leave");
			else if (a < 0)
				throw new InvalidLeave("Invalid Entry");
			else
				this.balanceLeave = this.balanceLeave - a;

		} catch (InvalidLeave ex1) {
			if (this.balanceLeave < 0)
				System.out.println("Negative Leave balance");
			else
				System.out.println("Invalid Entry");
			throw ex1;
		} catch (InsufficientLeave ex2) {
			System.out.println("Insufficient Leave");
			throw ex2;
		}

		return this.balanceLeave;

	}

}

class InsufficientLeave extends Exception {

	private static final long serialVersionUID = 1L;

	// STUDENT CODE BEGINS HERE

	// STUDENT CODE ENDs HERE

	public InsufficientLeave(String message) {
		super(message);
	}
}

class InvalidLeave extends Exception {
	private static final long serialVersionUID = 1000000L;

	// STUDENT CODE BEGINS HERE

	// STUDENT CODE ENDs HERE

	public InvalidLeave(String message) {
		super(message);
	}

}

public class User_Exception {

	public static void main(String[] args) {

		// STUDENT CODE BEGINS HERE
		Scanner sc = new Scanner(System.in);
		int e1;
		String e2;
		int e3;
		int a;
		e1 = sc.nextInt();
		e2 = sc.next();
		e3 = sc.nextInt();
		a = sc.nextInt();
		Employeee o1 = new Employeee(e1, e2, e3);
		try {
			int r = o1.getLeave(a);
			System.out.println(r);

		} catch (Exception e) {

		}

		/*
		 * 
		 * Write a Java Application as given below
		 * 
		 * Create a User Defined checked Exception class InsufficentLeave and its
		 * constructor accepts a string as the exception message. Create a User Defined
		 * checked Exception class InvalidLeave and its constructor accepts a string as
		 * the exception message Create an Employee class
		 * 
		 * I) With data members given below:
		 * 
		 * 1. empNo:int 2. empName:String 3. balanceLeave:int (cannot be a negative
		 * value) II) Create the constructor method with parameters and include getter
		 * methods.
		 * 
		 * III) Create the method:
		 * 
		 * getLeave(int):int This method passes applied leave as parameter and returns
		 * the updated balance leave. If the balance leave entered is negative, program
		 * should throw InvalidLeaveException with the message "Negative Leave balance"
		 * If the applied leave is more than the balance leave, program should throw
		 * InsufficentLeave Exception with the message "Insufficient Leave". If the
		 * applied leave is negative, program should throw InvalidLeaveException with
		 * the message "Invalid Entry". All the exceptions should be propagated to the
		 * caller method. Complete the main method of UserException class
		 * 
		 * which accepts the values for inputs empNo, empName , balance leave (cannot be
		 * a negative value) and applied leave(cannot be a negative value) from the
		 * console It has to handle all exceptions propagated and print appropriate user
		 * defined exception messages. Following requirements should be taken care in
		 * the program.
		 * 
		 * Input should be taken through Console Program should print the output as
		 * described in the Example Section below. Example Sample Input: 100 Meera 17 7
		 * Expected Output: 10 Sample Input: 100 Meera 10 12 Expected Output:
		 * Insufficient Leave Sample Input: 100 Meera 10 -10 Expected Output: Invalid
		 * entry Sample Input: 100 Meera -5 10 Expected Output: Negative Leave balance
		 */

		// STUDENT CODE ENDs HERE

	}
}
