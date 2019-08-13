package exceptions;
class Sequence {
	public static int  sequences(String input1) throws NumberFormatException,ArrayIndexOutOfBoundsException
    {
		int len=0;
		int[] intarray= null;
      
        String sequence[] = input1.split(",");
         intarray = new int[sequence.length];
        for (int i=0;i<sequence.length;i++)
        {
        	intarray[i] = Integer.parseInt(sequence[i]);
        
        	 }
        
        len = intarray.length;
     
       while (len !=1){
        for(int j=0;j<len-1;j++)
        {
           intarray[j]=intarray[j+1]-intarray[j];
          
           }
    len--;
        
        }
             
      return (intarray[0]);
        
    }

}

public class MultipleCatch {
public static void main(String[] args) {
		
		try
		{
			
		System.out.println(Sequence.sequences(args[0]));
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Input String not provided  ");
		}catch (NumberFormatException e)
       {
    	   System.out.println("Input String cannot be parsed");
       }
		
		

	}
}
 
/*
 * 
 * Write a Java program
 * 
 * Create class Sequence which has a static method declared as below
 * 
 * sequences(String):int
 * 
 * The sequences method of Sequence class has a static method which does the
 * following:
 * 
 * a. Convert the input string to an integer array where its elements are
 * integers in the string.
 * 
 * b. Perform the following operations on the array elements:
 * 
 * I. Subtract first with second element and replace first element with result,
 * second with third element and so on.. till array reaches its end. (intarr[0]
 * =intarr[1] - intarr[0], intarr[1]=intarr[2]-intarr[1] .........intarr[n-1]=
 * inta[n]-inta[n-1])
 * 
 * II Repeat the iterations as shown below: Initial input string is
 * "1,5,9,2,3,5,6" Input Integer array is 1 5 9 2 3 5 6 Elements in array : 7
 * No. of Iterations : 6
 * 
 * Result of iterations: (intarray[0] = intarr[1] - intarr[0]...)
 * 
 * Initial array : 1 5 9 2 3 5 6 after iteration 1: 4 4 -7 1 2 1 after iteration
 * 2: 0 -11 8 1 -1 after iteration 3: -11 19 -7 -2 after iteration 4: 30 -26 5
 * after iteration 5: -56 31 after iteration 6: 87 d. which returns computed
 * output.
 * 
 * The main() method of Multiplecatch class accepts an input string as command
 * line argument args[0].The input accepted consists of integers separated by
 * comma. The sequences() method of Sequence class is called within main() and
 * appropriate output is printed.
 * 
 * Following requirements should be taken care in the program.
 * 
 * Input String should be taken as Command Line argument.
 * 
 * ArrayIndexOutOfBoundsException has to handled if input string is missing
 * 
 * NumberFormatException has to handled during parsing of integers.
 * 
 * sequences() method propagates the exceptions and main() handles multiple
 * exceptions
 * 
 * Program should print the output as described in the Example Section below
 * 
 * Example Sample Input 1: 1,5,9,2,3,5,6 Expected Output: 87 Hints/Tips Use
 * split() to convert string to an integer array
 */
