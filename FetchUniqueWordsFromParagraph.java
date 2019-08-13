package collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.Set;
import java.util.Arrays;
import java.util.Collections;

public class FetchUniqueWordsFromParagraph {

		public List<String> fetchUniqueWords(String paragraph, int mode) {
			
			// STUDENT CODE BEGINS HERE
			
			List<String> str = new ArrayList<String>();
			if(mode<1 || mode>2 || paragraph==null || paragraph=="")
				return null;
			Set<String> ts=new TreeSet<String>();
			String s[]=paragraph.trim().replaceAll(" +|\\W+"," ").split(" ");
			ts.addAll(Arrays.asList(s));
			str.addAll(ts);
			if(mode==1)
			{
				//System.out.println(s.length);
				Collections.sort(str,new Comparator<String>() {

					@Override
					public int compare(String arg0, String arg1) {

						return arg0.compareTo(arg1);
					}
					
				});
			}
			else
			{
				Collections.sort(str,new Comparator<String>() {

					@Override
					public int compare(String arg0, String arg1) {
						int ret=arg0.length()-arg1.length();
						if(ret==0)
							return arg0.compareTo(arg1);
						return ret;
					}
					
				});
			}
			
			return str;

		}

		public static void main(String[] args) {

			try {
				String paragraph = args[0];
				int mode = Integer.parseInt(args[1]);
				FetchUniqueWordsFromParagraph obj = new FetchUniqueWordsFromParagraph();
				System.out.println(obj.fetchUniqueWords(paragraph, mode));
			} catch (NumberFormatException e) {
				System.out.println("Invalid mode. Expecting an int");
			} catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Invalid number of arguments. Expecting a string and a number");
			}
		}


	}
/*
 * Problem Statement - Sort Unique Words Complete the method
 * fetchUniqueWords(..) that accepts two parameters. The first parameter is a
 * String representing a bunch of sentences (like a paragraph) and the second
 * parameter is an int.
 * 
 * The method should return a List<String> of unique words, from the input
 * string. The list should be sorted based on the second parameter. If the
 * second parameter is 1, then the list is ordered in alphabetical order. If it
 * is 2, then the list is ordered based on the word length. If the word lengths
 * of two or more words are same, then they must be ordered alphabetically. The
 * method should return null, if the mode is invalid or the input string is null
 * Following functionality is present in the main method. Do not change it
 * 
 * Input's are taken through Command line arguments method fetchUniqueWords(..)
 * is invoked and the resultant list is displayed Example Sample Input:
 * "Fruits come in various colours. Apples are   reddish-yellow in colour, whereas Grapes are green in colour."
 * 1
 * 
 * Expected Output: [Apples, Fruits, Grapes, are, colour, colours, come, green,
 * in, reddish, various, whereas, yellow] Sample Input:
 * "Fruits come in various colours. Apples are   reddish-yellow in colour, whereas Grapes are green in colour."
 * 2
 * 
 * Expected Output: [in, are, come, green, Apples, Fruits, Grapes, colour,
 * yellow, colours, reddish, various, whereas] Hints/Tips Use a Set and
 * Comparator
 */
