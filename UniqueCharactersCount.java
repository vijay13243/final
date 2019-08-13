package practice.utilityclasses;
	import java.util.Scanner;
	public class UniqueCharactersCount {
		 public static int getUniqueCharacterCount(String a)
	 {
	     String b= a.toLowerCase(); 
	 	int count=0;
	 	int[] c = new int[a.length()];
	 	for(int i=0;i<a.length();i++)
	 	{
	 		c[i]=0;
	 	}
	 	char[] arr=b.toCharArray();
	 	for(int i=0;i<a.length();i++)
	 	{
	 		for(int j=0;j<a.length();j++)
	 		{
	 		    if(Character.isWhitespace(arr[i]))
	 		    {
	 		        c[i]+=1;
	 		        continue;
	 		    }
	 			if(arr[i]==arr[j])
	 			{
	 				if(i!=j)
	 				{
	 				c[i]+=1;
	 				c[j]+=1;
	 				}
	 			}
	 		}
	 	}
	 	for(int i=0;i<a.length();i++)
	 	{
	 	    //System.out.println(c[i]);
	 		if(c[i]==0)
	 		{
	 			count+=1;
	 		}
	 	}
	 	if(count!=0)
		 	return count;
		 else
		 	return -1; 
	 }
		public static void main(String[] args) {
			//CODE START
			Scanner sc = new Scanner(System.in);
			int val = getUniqueCharacterCount(sc.nextLine());
			if(val!=-1)
			{
				System.out.println(val+" unique character/s");
			}
			else
			{
				System.out.println("No unique character/s");
			}
			//CODE END
		}
	    //CODE HERE
	}
/*
 * Problem Statement: Count Unique Characters In the class named
 * UniqueCharactersCount, create the following public static method:
 * 
 * getUniqueCharacterCount(String) : int Count the number of unique characters
 * in the input string and return the count. return -1 in case of no unique
 * characters space should not be considered in the count character comparison
 * should be case insensitive Do the following in the main method of
 * UniqueCharactersCount
 * 
 * Accept a String from the console If the String contains 'n' unique
 * characters, print n unique character/s If the String contains no unique
 * characters, print No unique character/s Example Sample Input: good
 * 
 * Expected Output: 2 unique character/s Sample Input: pepper spray
 * 
 * Expected Output: 3 unique character/s Sample Input: Mama
 * 
 * Expected Output: No unique character/s
 */
