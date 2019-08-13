package collections;
import java.util.ArrayList;
import java.util.List;


public class SumOfListElements {

		public List<Integer> getSumOfListElements(List<Integer> first,
				List<Integer> second) {

			// CODE START
			List<Integer> third=new ArrayList<Integer>();
			if(first==null){
				if(second==null){
					return third;
				}
				return second;
			}
			if(second==null){
				return first;
			}
			if(first.size()>second.size()){
				for(int i=0;i<second.size();i++){
					third.add(first.get(i)+second.get(i));
				}
				for(int i=second.size();i<first.size();i++){
					third.add(first.get(i));
				}
			}
			else{
				for(int i=0;i<first.size();i++){
					third.add(first.get(i)+second.get(i));
				}
				for(int i=first.size();i<second.size();i++){
					third.add(second.get(i));

				}
			}
			return third;
			// CODE END
	    
		}
		public static void main(String[] args) {
			List<Integer> first = null;
			List<Integer> second = null;

			String input1 = "", input2 = "";
			if (args.length == 1) {
				first = new ArrayList<Integer>();
				input1 = args[0];
			} else if (args.length == 2) {
				first = new ArrayList<Integer>();
				second = new ArrayList<Integer>();
				input1 = args[0];
				input2 = args[1];
			}

			try {
				String[] ar1 = input1.split(",");
				String[] ar2 = input2.split(",");

				if (!input1.trim().equals("")) {
					for (String s : ar1) {
						first.add(new Integer(s.trim()));
					}
				}
				if (!input2.trim().equals("")) {
					for (String s : ar2) {
						second.add(new Integer(s.trim()));
					}
				}

				SumOfListElements obj = new SumOfListElements();
				System.out.println(obj.getSumOfListElements(first, second));
			} catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println("Invalid input/s.");
			}
		}
	}

/*
 * Problem Statement - Sum of List Elements Complete the method
 * getSumOfListElements(..) that accepts two lists of type List<Integer> as
 * arguments.
 * 
 * The sizes of both Lists may differ. Assuming that the sizes of both lists are
 * 's1' and 's2', the function should create a new list of size equals to
 * largest of s1 and s2. An element in the returned list is the sum of elements
 * in input lists at the same index. For example, if L1 and L2 are input lists,
 * and L3 is the returned list, then L3.get(n) must be equal to the sum of
 * L1.get(n) and L2.get(n). If L1 is larger than L2 then the last (s1-s2)
 * elements in the returned list should be same as the corresponding elements in
 * the list L1
 * 
 * If any of the list is null, it should be considered as empty list
 * 
 * The main method contains the code which does the following
 * 
 * Input is taken through command line argument. Lists are created and passed to
 * the getSumOfListElements method The returned list is printed Example Sample
 * Command Line Input: "10, 20, 30, 40, 50" "12, 23, 34" Sample Output: [22, 43,
 * 64, 40, 50]
 */

