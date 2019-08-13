package exceptions;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;




public class EmployeeManager {
	public static void main(String[] args) {
		
		// Nothing here
		
	}
}

 class Employee {
	// STUDENT CODE BEGINS HERE
int id;
String name;
double salary;
public Employee()
{
	
}

public Employee(int id, String name, double salary) {
	super();
	this.id = id;
    if(name.length()<3)
        throw new IllegalArgumentException();
    else
        this.name=name;
    
	this.salary = salary;
}

public int getId() {
	return id;
}
public String getName() {

	return name;
}
public double getSalary() {
	return salary;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) 
{
    if(name.length()<3)
        throw new IllegalArgumentException();
    else
        this.name=name;
    
}
public void setSalary(double salary) {
	this.salary = salary;
}


	// STUDENT CODE ENDS HERE
}

 class Manager extends Employee {
     // STUDENT CODE BEGINS HERE
     String currentProject = null;
    String projectStartDate = null;
    
     

     // STUDENT CODE ENDS HERE

     public Manager() {
     }
      
     public Manager( int id, String name, double salary, String currentProject, String projectStartDate) {
         super(id, name, salary);
         Pattern p = Pattern.compile("[A-Z]\\d{3}");
         Matcher m = p.matcher(currentProject);
           if((m.find())&&(currentProject.length()==4))
               this.currentProject=currentProject;
           else
               throw new IllegalArgumentException();
          this.projectStartDate = projectStartDate;
     }

     public String getCurrentProject() {
         return currentProject;
     }

     public void setCurrentProject(String currentProject) {
         Pattern p = Pattern.compile("[A-Z]\\d{3}");
         Matcher m = p.matcher(currentProject);
           if((m.find())&&(currentProject.length()==4))
               this.currentProject=currentProject;
           else
               throw new IllegalArgumentException();
     }

     public Date getProjectStartDate() {

         
               Date javaDate1 = Utilities.stringToDate(this.projectStartDate);
               return javaDate1;

     }
     
     

     public void setProjectStartDate(String projectStartDate) {
         this.projectStartDate = projectStartDate;
     }
     
 }
 
   class Utilities {

 	// STUDENT CODE BEGINS HERE
 	
 static Date stringToDate( String date)
 {
      
     try {
               SimpleDateFormat sf1 = new SimpleDateFormat("dd-MM-yyyy");
               sf1.setLenient(false);
               Date d = sf1.parse(date);
               return d;
         }
     catch (ParseException e) 
     { 
         return null;
         
     }
 }
   }
   
     
   
/*
 * Create a class called "Employee" with the following fields:
 * 
 * id: int name: String salary: double Provide default and overloaded
 * constructors. Add setters/getters too. The constructor and Setter should
 * throw IllegalArgumentException if the name of the employee is less than 3
 * characters
 * 
 * Create a subclass called "Manager" with the following fields:
 * 
 * currentProject: String projectStartDate: Date Provide default and overloaded
 * constructors along with getters and setters. The overloaded constructor takes
 * id, name, salary, currentProject and projectStartDate as parameters. The data
 * type of the parameter projectStartDate should be String. Also, the setter for
 * the same should also accept String. The constructor and Setter should throw
 * IllegalArgumentException if the currentProject is not in below format
 * 
 * Project should be of 4 characters : First Character should uppercase
 * alphabet, and the remaining 3 characters should be digits ex. P101 Create a
 * class Utilities having a static method as shown below to convert a String in
 * to a Date.
 * 
 * stringToDate(String date) : Date . The input date should be in format
 * dd-mm-yyyy Example of Invalid dates : 01/01/2000, 32/14/2000 This assignment
 * does not contain any black box test cases
 * 
 * Hints/Tips The Utilities method should return null, if the date is incorrect
 * and should be used wherever conversion of string to date is required in any
 * class.
 * 
 * Instructions
 */
     
 
