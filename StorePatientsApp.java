package collections;
import java.util.*;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;


/**
 *
 * @author Er. Dilpreet Kaur
 */
//CODE CHANGES REQUIRED IN THIS CLASS AS PER REQUIREMENT
 class Patient implements Comparable {

	private int registratonNumber;
	private String name;
	private char gender;

	public Patient() {}

	public Patient(int registratonNumber, String name, char gender) {
		super();
		this.registratonNumber = registratonNumber;
		this.name = name;
		this.gender = gender;
	}

	public int getRegistratonNumber() {
		return registratonNumber;
	}

	public void setRegistratonNumber(int registratonNumber) {
		this.registratonNumber = registratonNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

    

	public void setGender(char gender) {
		this.gender = gender;
	}

    @Override
    public String toString() {
       String g=null;
		if(gender=='M'){
			g="Male";
		}
		if(gender=='F'){
			g="Female";
		}
		return registratonNumber+" - "+name+" - "+g;
    }

        
    @Override
    public int compareTo(Object o) {
        Patient p = (Patient)o;
        if(registratonNumber>p.registratonNumber){
			return 1;
		}
		else if(registratonNumber<p.registratonNumber){
			return -1;
		}
		return 0;
    }

  
    
        
}

 class PatientService {
	
	/**
	 *
	 * @author Er. Dilpreet Kaur
	 */

		
		private Set<Patient> patientsRepository;
		
		 public PatientService(){
		    this.patientsRepository=new TreeSet<Patient>();
		}
		public Set<Patient> getPatients() {
		    
			return patientsRepository;
		}

		//CODE START
	    
		public Boolean addPatient(int x, String y, char z){
		    try{
		        int len=patientsRepository.size();
		    patientsRepository.add(new Patient(x,y,z));
		    if(len==patientsRepository.size()){
		        throw new Exception();
		    }
		    return true;
		    }
		    catch(Exception e){
		        return false;
		    }
		}

	    public Patient searchPatient(int rn){
	        for(Patient p:patientsRepository){
	            if(p.getRegistratonNumber()==rn){
	                return p;
	            }
	        }
	        return null;
	    }
	}

	
/**
*
* @author Er. Dilpreet Kaur
*/

public class StorePatientsApp  extends PatientService {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//CODE START
               StorePatientsApp p=new StorePatientsApp();
		for(int i=0;i<3;i++){
		    int x=scan.nextInt();
		    String y=scan.next();
		    char z=scan.next().charAt(0);
		    p.addPatient(x,y,z);
		}
		Patient pat=p.searchPatient(scan.nextInt());
		if(pat==null){
		    System.out.println("Patient not found");
		}
		else{
		    System.out.println(pat);
		}
		//CODE END
	}

}

/*
 * Problem Statement: Store Patients Complete the application as per the below
 * design to add and search patient. The application consists of 3 classes :
 * Patient, PatientService and StorePatientApp. Complete the given classes as
 * below.
 * 
 * class Patient This pre-written class contains the instance variables:
 * registratonNumber, name and gender, Getters/Setters, Constructors. This class
 * may need some changes based on the requirement.
 * 
 * class PatientService
 * 
 * Contains an instance variable patientsRepository of type Set<Doctor>.
 * Initialize the patientsRepository to a empty Set in a no argument
 * Constructor. The Set should be an ordered Set. Create the below methods in
 * this class, for adding and searching patients from the patientsRepository
 * 
 * addPatient(int, String, char ) : boolean
 * 
 * This method takes patient details as input parameters and adds the paient to
 * the repository. It returns true on successful patient addition in repository
 * else returns false. Patient is considered duplicate, if all the details of
 * the patient are same as an existing patient in patientsRepository. Duplicate
 * patients should not be added to repository searchPatient(int
 * registratonNumber): Patient
 * 
 * This method takes registration number as input parameter and returns a
 * patient object if found in repository Method returns null, If patient is not
 * found class StorePatientApp
 * 
 * Do the following in the main method
 * 
 * Accept input from console Accept details of exactly 3 patients , followed by
 * the registration number of the patient to search Display Patient details if
 * found in the repository else display "Patient not found" Sample Input and
 * output formats are provided in example section Example Sample Input: 101 John
 * M 102 Kate F 103 Dave M 103
 * 
 * Expected Output: 103 - Dave - Male Sample Input: 555 John M 666 Kate F 777
 * Dave M 888
 * 
 * Expected Output: Patient not found
 */
