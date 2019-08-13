package practice.utilityclasses;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Colour_Code_Validator {


		// CODE HERE
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int ch,res;
			String s;
			ch=scan.nextInt();
			if(ch==1){
				s=scan.next();
				res=validateHexCode(s);
				if(res==1)
				System.out.print("Valid Code");
				else
				System.out.print("Invalid Code");
			}
			else if(ch==2){
				s=scan.next();
				res=validateDecimalCode(s);
				if(res==1)
				System.out.print("Valid Code");
				else
				System.out.print("Invalid Code");
			}
			else{
				System.out.print("Invalid choice");
			}
			// CODE END
			scan.close();
		}
		public static int validateHexCode(String s3){
				int l=s3.length();
				int f=0,i=0;
				char[] s = s3.toCharArray();
				if(l==7){
				if(s[i]=='#')
				f++;
				for(i=1;i<7;i++){
					if((s[i]>='0' &&s[i]<='9')||(s[i]>='A'&&s[i]<='F'))
					f++;
				}}
				if(f==7)
				return 1;
				else
				return -1;
			}
			public static int validateDecimalCode(String s3){
				int i=0,c1=0,s=0;
	            int j[]=new int[10];
			    String b;
			    int g=s3.length();
			    char[] te= s3.toCharArray();
			    if(te[0]=='r'&&te[1]=='g'&&te[2]=='b'&&te[g-1]==')'&&te[g-2]!=')'){
			    Pattern p = Pattern.compile("\\d+");
	            Matcher m = p.matcher(s3);
	            while(m.find()) {
	            b=m.group();
	            j[i++]=Integer.parseInt(b);
	            }
	        for(s=0;s<i;s++)
	        {
	            if(j[s]>=0&&j[s]<=255)
	            c1++;
	        }}
					if(c1==3)
					return 1;
					else
					return -1;
			}

	}
/*
 * Sample Input: 1 #ABCDEF
 * 
 * Expected Output: Valid Code Sample Input: 2 rgb(9,99,249)
 * 
 * Expected Output: Valid Code Sample Input: 9
 * 
 * Expected Output: Invalid choice
 */


