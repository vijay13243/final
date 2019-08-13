package io;
import java.io.*;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileCopier {
	
	public void copyFile(String fileName) throws IOException,NoSuchElementException{
		 String newfilename=fileName.replace(".txt","_copy.txt");
		 File ob=new File(newfilename);

			ob.createNewFile();
			File ob1=new File(fileName);
			 BufferedReader on=new BufferedReader(new FileReader(ob1));
			 String j=on.readLine();
			 on.close();
			 String k=j.replaceAll("\\s+"," ").trim(); 
			 String m=k.replaceAll(",",", ");
			 BufferedWriter ok=new BufferedWriter(new FileWriter(ob));
			 ok.write(m);
			 ok.close();
			 String pk=fileName+" "+"file copied to"+" "+newfilename;
			 System.out.println(pk);
		} 
	public static void main(String args[])throws IOException
	{
		Scanner scan = new Scanner(System.in);
		try{
	    		String filename = scan.next();
				FileCopier ob=new FileCopier();
				ob.copyFile(filename);
			}
			catch(IOException e)
			{
				System.out.print("File Not Found");
			}
			catch(NoSuchElementException e)
			{
				System.out.print("file does not exist");
			}
	}
	}

/*
 * nstructions for File Handling and IO exercises
 * 
 * Complete the exercise in Eclipse IDE as per the provided class structure
 * Paste the solution in EduNxt coder for submission and evaluation All Files
 * and folders are relative to the Project/Exercise folder Problem Statement -
 * File Copier Complete the copyFile(..) method of FileCopier class to accept
 * the name of a source file as parameter.
 * 
 * Note:
 * 
 * Do the following in the method
 * 
 * Copy the content of source file to destination file after formatting as given
 * below
 * 
 * Multiple spaces between words should be reduced to single space every comma
 * should be followed by a space
 * 
 * The destination file should be created by the method in the same folder
 * 
 * The destination filename should be source file name suffixed with 'copy' eg:
 * if source file name is abc.txt destination filename should be abccopy.txt
 * 
 * Upon successful copy operation the method should print the following message
 * as output.
 * 
 * xxx.txt file copied to xxx_copy.txt where xxx is the source file name If the
 * input file is not found, method should propagate the Exception
 * 
 * Do the following in the main method
 * 
 * Input should be taken through Console Program should print the output as
 * described in the Example Section below Display "File Not Found" if the file
 * does not exist File copy Sample
 * 
 * SOURCE FILE pqr.txt Java is a programming language,which can be used to write
 * platform independent programs. Welcome to Java World.
 * 
 * DESTINATION FILE :pqr_copy.txt** Java is a programming language, which can be
 * used to write platform independent programs. Welcome to Java World. Example
 * Sample Input: file1.txt
 * 
 * Expected Output: file1.txt copied to file1_copy.txt Sample Input:(file does
 * not exist) file2.txt
 * 
 * Expected Output: file1.txt copied to file1_copy.txt
 */
