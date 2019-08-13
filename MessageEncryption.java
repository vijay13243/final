package practice.utilityclasses;
import java.util.Scanner;
public class MessageEncryption {
	
		public static String encrypt(String a)
		{
			String b = a.toLowerCase();
			char[] ch = b.toCharArray();
			String z="";
			for(char c: ch)
			{
				if(c=='a')
				{
					z=z+'e';
				}
				else if(c=='e')
				{
					z=z+'a';
				}
				else if(c=='o')
				{
					z=z+'u';
				}
				else if(c=='u')
				{
					z=z+'o';
				}
				else if(c!='a' && c!='e' &&c!='i' && c!='o' && c!='u'&& c!='z'&& c!=' '&& c!='9')
				{
					char cha = (char)(c+1);
					if(cha=='e' || cha=='i' || cha=='o' || cha=='u')
					{
						cha = (char)(cha+1);
					}
					z=z+cha;
				}
				else
				{
				z=z+c;	
				}
				
			}
			String c = z.replace(' ','+');
			String d = c.replace('i','!');
			String e = d.replace('z','b');
			String f = e.replace('9','0');
			return f;

		}

		public static void main(String[] args) {
			//CODE START
			Scanner sc = new Scanner(System.in);
			System.out.println(encrypt(sc.nextLine()));
			//CODE END
		}

		//CODE HERE

	}


/*
 * In the class MessageEncryption create the following public static method:
 * 
 * encrypt(String message): String The input message String to the method should
 * be encrypted as per the below rules. encrypted message should be returned
 * back. message should be converted to lower case a and e should be replaced
 * with each other o and u should be replaced with each other i should be
 * replaced with ! and space should be replaced with + In case of Consonant, It
 * should be replaced with next immediate consonant In case of digit, it should
 * be replaced with next digit z should be replaced with b and 0 with 1 Assume
 * that the input string is alphanumeric without special characters Do the
 * following in the main method of MessageEncryption
 * 
 * Accept a message from the console and display the encrypted message Example
 * Sample Input: good Morning
 * 
 * Expected Output: huuf+nusp!ph Sample Input: silence please
 * 
 * Expected Output: t!mapda+qmaeta Sample Input: call at 4pm
 * 
 * Expected Output: demm+ev+5qn
 */