package io;
import java.io.*;

public class CountTheVowels {

		public static void main(String[] args) {
			try{
			File infile=new File(args[0]);
					FileReader fr=new FileReader(args[0]); 
	                int i,cnt=0; 
	                while((i=fr.read())!=-1){
	                	char a=(char)i;
	                	if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
	                		cnt+=1;
	                	}
	                }
	                System.out.println(cnt);
				   }
				   catch(IOException e){
				   	System.out.println("Input file does not exist");
				   }
				   catch(ArrayIndexOutOfBoundsException e){
				   System.out.println("Exactly one argument expected");
				   }
		}
	}


/*
 * Instructions for File Handling and IO exercises
 * 
 * Complete the exercise in Eclipse IDE as per the provided class structure
 * Paste the solution in EduNxt coder for submission and evaluation All Files
 * and folders are relative to the Project/Exercise folder Problem Statement -
 * Count Vowels In File Write a Java program
 * 
 * 1. That accepts a filename as command line argument. 2. The program should
 * read the data in file and count the total number of vowels and print the
 * same. 3. If the user does not supply any command line arguments, then an
 * error message "Exactly one argument expected" should be printed. 4. If the
 * input file does not exist, then an error message "Input file does not exist"
 * should be printed. ##Example:
 * 
 * Sample Input 1: Given below is the input file data aeiouAEIOU
 * 
 * Expected Output: 10 Sample Input 2: Given below is the input file data
 * 
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus ullamcorper,
 * justo nec ornare egestas, velit nisl interdum libero, sed ullamcorper metus
 * odio ac eros. Nunc quis ultricies ex. Vivamus nulla nulla, hendrerit nec
 * varius non, feugiat ac ante. In hac habitasse platea dictumst. Pellentesque
 * ac leo augue. Quisque convallis tortor sit amet dignissim vehicula. Quisque
 * ornare arcu nec lacus placerat tristique. Fusce accumsan vehicula velit nec
 * elementum. Cras commodo nunc nunc, id viverra nibh auctor id.
 * 
 * Expected Output: 179 Instructions
 */
