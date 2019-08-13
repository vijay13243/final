package io;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class Fileindirectory {

		public static void createFileAndDirectory(String directory, String file) {
	if((directory.length()<0||directory.length()>20&&file.length()<0||file.length()>20))
	{
		System.out.println("INVALID_INPUT");
	}
	else{
	File f=new File(directory);
	File f1=new File(f,file);
	  if(f.exists())
	{
		System.out.println("Directory Exists");
	}
	  else
	  {
		 f.mkdir();
			  System.out.println("Directory Created");
	  }
	  if(f1.exists())
	{
		 
			  System.out.println("File Exists");
	}
	  else{
	  	try{
	  f1.createNewFile();
	  System.out.println("File Created");}
	  catch(IOException e)
	  {
	  	
	  }
	}
	 System.out.println("FILE PATH :"+directory+"/"+file);
	  }
	   
	 
		}

		//Do not change main method
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String directory = sc.next();
			String file = sc.next();
			createFileAndDirectory(directory, file);
		}

	}

/*
 * Instructions for File Handling and IO exercises
 * 
 * Complete the exercise in Eclipse IDE as per the provided class structure
 * Paste the solution in EduNxt coder for submission and evaluation All Files
 * and folders are relative to the Project/Exercise folder Problem Statement -
 * Create Directory and File Complete the createFileAndDirectory() method of
 * given FileInDirectory class with appropriate code to accept a Folder name and
 * a File name as input. In the method, do the following - Create a folder using
 * the input folder name, if it does not exist (Folder location is relative to
 * the current project folder) - Create a file in the folder using the input
 * file name, if it does not exist.
 * 
 * If the input folder already exists, display "Directory Exists", else display
 * "Directory Created" If the input file exists in the folder, display
 * "File Exists", else display "File Created"
 * 
 * Print the File path in the output even if the folder/file already exists as
 * follows : FILE PATH=directoryname/filename
 * 
 * Following requirements should be taken care in the program.
 * 
 * Input is taken through Console using Scanner The first input should be the
 * directory name and the second input should be the file name Input should be
 * separated by a blank space. Use appropriate java io API classes,interfaces
 * and methods to implement the requirements. Format the output and display
 * exactly as expected . Refer sample input and output below. Filename and
 * Directory name must be from 1 to 20 characters long. If the length of the
 * filename or directory name entered is less than 1 or more than 20 then it
 * should display error message as "INVALID_INPUT" Both file name and directory
 * name cannot have blank space. There are no black box text cases for this
 * exercise
 * 
 * Example Sample Input (folder and file does not exist): mydir myfile.dat
 * 
 * Expected Output: Directory Created File Created FILE PATH : mydir\myfile.dat
 * Sample Input (Folder exists but file does not exists) data file.txt
 * 
 * Expected Output: Directory Exists File Created FILE PATH : data\file.txt
 * Sample Input (Folder and file exists) data file.txt
 * 
 * Expected Output: Directory Exists File Exists FILE PATH : data\file.txt
 * Sample Input internationalcricketdirectory cricket.txt
 * 
 * Expected Output: INVALID_INPUT
 */
