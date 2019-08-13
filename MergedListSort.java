package collections;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	import java.util.Scanner;

	public class MergedListSort {
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			try{
			ArrayList<Integer> al1=new ArrayList<Integer>(5); 
			ArrayList<Integer> al2=new ArrayList<Integer>(5);
			
			for(int i=0;i<10;i++)
			{
				int x=scan.nextInt();
				if(i<5)
					al1.add(x);
				else
					al2.add(x);
			}
			System.out.println(MergedListSort.mergeAndSort(al1,al2));
			}
			catch(IllegalArgumentException e){
				throw new IllegalArgumentException();
			}
		}

		public static List<Integer> mergeAndSort(List<Integer> al1, List<Integer> al2) 
		{
			if(al1==null || al2==null || al1.size()!=5 || al2.size()!=5)

				throw new IllegalArgumentException();
				
			List<Integer> ml=new ArrayList<Integer>(al1);
			ml.addAll(al2);

			Collections.sort(ml);
		
			List<Integer> l=new ArrayList<Integer>();
			l.add(ml.get(2));
			l.add(ml.get(6));
			l.add(ml.get(8));
			return l;
		}
		
	}

	
/*
 * Create a static method named mergeAndSort in the class MergedListSort as
 * given below
 * 
 * Method should read two integer List's, containing 5 elements each, as input
 * Merge the two List's and sort the merged List in ascending order Fetch the
 * elements at 2nd, 6th and 8th index into a new List and return the List.(index
 * starts from 0) Method should throw IllegalArgumentException, if the input
 * List does not contain exactly 5 elements or if the input list is null Note:
 * The input lists should not be modified in the method
 * 
 * Complete the main method as given below
 * 
 * Input should be accepted using console Accept 10 integers and create two
 * List's each containing 5 integers Display the returned List Refer sample
 * output for formatting specifications.
 * 
 * Example Sample Input: 3 1 17 11 19 5 2 7 6 20
 * 
 * Sample Output: [3, 11, 19] Sample Input: 1 2 3 4 5 6 7 8 9 10
 * 
 * Sample Output: [3, 7, 9]
 */