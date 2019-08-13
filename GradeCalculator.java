package collections;
	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Map;
	import java.util.Scanner;
	import java.util.TreeMap;
	/**
	 *
	 * @author Er. Dilpreet Kaur
	 */

	public class GradeCalculator {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			//CODE START
	                Map<Integer, Integer> scores = new HashMap <Integer,Integer> ();
	               
	                Map<Integer, String> result =null;
	              
	                 try
	                 {
	                      
	                     int n = sc.nextInt();
	                     
	                     for(int i=0;i<n;i++)
	                     {
	                         scores.put(sc.nextInt(), sc.nextInt());
	                     }
	                     
	                     result=GradeCalculator.calculateGrade(scores);
	                     
	                    for(Map.Entry m:result.entrySet())  
	                   {  
	                      System.out.println(m.getKey()+" "+m.getValue());      
	                   }  
	                     
	                     
	                     
	                 }catch(Exception e)
	                 {
	                     System.out.println(result);
	                 }
	                
			//CODE END
		}
	public static Map<Integer, String> calculateGrade(Map<Integer, Integer> scores)
	{
	    Map<Integer, String> res =null;
	    try
	    {
	    	if(scores==null||scores.isEmpty())
	          {
	              return null;
	          }
	      res = new TreeMap<Integer, String>();
	      for(Map.Entry m:scores.entrySet()){  
	          Object a=m.getValue();
	          int b = (int)a;
	          Object c=m.getKey();
	          Integer d=(Integer)c;
	          
	          
	          if(b>100)
	          {
	            
	          }
	          else if(b>=80)
	          {
	             res.put(d, "A"); 
	          }
	          else if(b>=60)
	          {
	             res.put(d, "B"); 
	          }
	          else if(b>=45)
	          {
	             res.put(d, "C"); 
	          }
	          else 
	          {
	             res.put(d, "D");
	          }
	         
	         
	          
	      }  
	        
	        
	    }catch(Exception e)
	    {
	        //res=new HashMap<Integer, String> ();
	        return res;
	    }
	    
	   return res;
	}
		//CODE METHOD HERE

		
		
	}

/*
 * Write a java program for assigning grades to students based on their marks.
 * The student details need to be accepted from the User. The details would
 * include roll no, marks in the given order. The datatype for roll no and marks
 * is integer. These details need to be stored in a HashMap with roll no as key
 * and marks as value.
 * 
 * Grade Assignment Rules:
 * 
 * 1. If marks is greater than or equal to 80, grade is "A" 2. If marks is less
 * then 80 and greater than or equal to 60, grade is "B". 3. If marks is less
 * then 60 and greater than or equal to 45, grade is "C" else "D". 4. If marks
 * is greater than 100, student record should be ignored Create a static method
 * as given below in class GradeCalculator for finding and storing the grade
 * 
 * public static Map<Integer, String> calculateGrade(Map<Integer, Integer>
 * scores)
 * 
 * - Method should take Map (HashMap object) as input and return a Map. - The
 * map returned should have roll no as key and grade as value. The entries in
 * the map should be sorted based on roll number
 * 
 * Note: If the input map is null or empty, method should return null* Do the
 * following in the main method
 * 
 * Accept inputs from the console The first input is integer(n) denoting the
 * number of students, followed by roll number and marks of 'n' students The
 * student details should be stored in a HashMap and passed to the method The
 * output should be displayed as per the format given in example section Example
 * Sample Input: 2 1010 80 100 40
 * 
 * Expected Output: 100 D 1010 A Sample Input: 3 1010 80 231 90 101 101
 * 
 * Expected Output: 231 A 1010 A
 */