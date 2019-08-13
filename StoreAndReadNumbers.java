package io;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.*;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
public class StoreAndReadNumbers implements Serializable {
	
		private static final long serialVersionUID = -6479639680675939492L;

		public void store(Object[] args) {

			try {
				File f;
				int i = 0;
				if (args[0] instanceof String) {
					f = new File((String) args[0]);
					i = 1;
				} else
					f = new File("numbers.dat");
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				while (i < args.length) {
					if (args[i] instanceof Double)
						oos.writeObject(args[i]);
					i++;
				}
				oos.close();
				fos.close();
			} catch (FileNotFoundException e) {
			} catch (IOException e) {
			}// STUDENT CODE ENDS HERE
		}

		public Double[] read(String filename) {

			// STUDENT CODE STARTS HERE
			Double d[];
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {

				ArrayList<Double> al = new ArrayList<Double>();
				while (true) {
					try {
						al.add((Double) ois.readObject());
					} catch (EOFException e) {
						break;
					} catch (ClassNotFoundException e) {
						break;
					}
				}
				int n = al.size();
				d = new Double[n];
				for (int i = 0; i < n; i++)
					d[i] = al.get(i);
				return d;
			} catch (FileNotFoundException e) {
				return null;
			} catch (IOException e) {
				return null;
			}
			
		
			// STUDENT CODE ENDS HERE
		}

		public static void main(String[] args) {

			String filename = "numbers.dat";
			try{
				Double d2 = Double.parseDouble(args[0]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.exit(0);
			}catch(NumberFormatException e) {
				filename = args[0];	
			}

			Object obj[] = new Object[args.length];

			for (int i = 0; i < args.length; i++) {
				boolean bn = Pattern.matches("[a-zA-Z]+", args[i]);
				if (bn)
					obj[i] = obj[i];
				else
					obj[i] = Double.parseDouble(args[i]);
			}
			StoreAndReadNumbers s = new StoreAndReadNumbers();
			s.store(obj);
			Double d[];
			d = s.read(filename);
			System.out.println(Arrays.toString(d));
		
			// STUDENT CODE ENDS HERE

		}
	}



/*
 * Instructions for File Handling and IO exercises
 * 
 * Complete the exercise in Eclipse IDE as per the provided class structure
 * Paste the solution in EduNxt coder for submission and evaluation All Files
 * and folders are relative to the Project/Exercise folders Problem Statement -
 * Store and Read Numbers from a file Following requirements should be taken
 * care in the program.
 * 
 * -1. Complete the function called "store" that accepts an array of objects as
 * parameters and writes the content into a binary file. The first argument
 * should be a string representing the filename. The rest of the elements of the
 * array can be of any type. However, the function should only write Double
 * objects. If the first argument is not a String, then the filename should be
 * "numbers.dat".
 * 
 * -2. Complete function called "read" to read the content of the file. The
 * filename is supplied as an argument and it should return an array of Double
 * objects.
 * 
 * -3. The main() method is given which accepts inputs from the Command Line.The
 * data is written into a binary file "numbers.dat"
 * 
 * -4. Program should print the output as described in the Example Section below
 * Example: Sample Input 1: 29 pqrs 49.56 asdf 100 29.3
 * 
 * Expected Output: [29.0, 49.56, 100.0, 29.3] Hints/Tips instanceOf operator
 * 
 * Instructions Do not change the provided class/method names unless instructed
 * Ensure your code compiles without any errors/warning/deprecations Follow best
 * practices while coding Avoid too many & unnecessary usage of white spaces
 * (newline, spaces, tabs, ...), except to make the code readable Use
 * appropriate comments at appropriate places in your exercise, to explain the
 * logic, rational, solutions, so that evaluator can know them Try to retain the
 * original code given in the exercise, to avoid any issues in compiling &
 * running your programs Always test the program thoroughly, before
 * saving/submitting exercises/project For any issues with your exercise,
 * contact your coach
 */
