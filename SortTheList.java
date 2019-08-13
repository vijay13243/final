package collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTheList {

		
		public List<String> sort(String input) {
			
			List<String> list1 = new ArrayList<String>();
		if(input==null||input.isEmpty()||input=="")
				return list1;
				
			list1.addAll(Arrays.asList(input.trim().split(" +")));
			Collections.sort(list1, new Comparator<String>(){
			
					@Override
					public int compare(String s1,String s2)
					{
						int x= s1.length()-s2.length();
						if(x==0)
						{
							return s1.compareTo(s2);
						}
						return x;
					}
				});
			return list1;

			
		}

		public void printSorted(String input) {
			System.out.println(sort(input));
		}

		public static void main(String[] args) {
			String input = "";
			
			for (int i = 0; i < args.length; i++) {
				input += args[i] + " ";
			}
			input = input.trim();
			
			if(input.equalsIgnoreCase("null")){
				input = null;
			}
			SortTheList obj ;
			obj = new SortTheList();
			obj.printSorted(input);
		}
	}




/*
 * Problem Statement Write a function that accepts a String sentence as argument
 * and returns a List<String> containing the words from the String input. The
 * List should be sorted based on the length. The word with the least length
 * should be on the top. In case if two words have the same length, then they
 * are arranged alphabatically in ascending order.
 * 
 * Example Input: "java programming language" Output: [java, language,
 * programming]
 * 
 * Input: null Output: []
 */
