package io;
import java.io.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
//CHANGE CLASS AS PER INSTRUCTION
class Student {
	private int id;
	private String name;
	private double marks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

}

public class StudentSerializer {

		public void serializeStudent(Student student, String filename) {
		    try{
	            FileOutputStream file = new FileOutputStream (filename); 
	            ObjectOutputStream out = new ObjectOutputStream(file); 
	            out.writeObject(student); 
	            System.out.print("Student Serialized"); }
	            catch(IOException e){
	                
	            }
		}
		
		public static void main(String[] args) {
	        StudentSerializer ob=new StudentSerializer();
	        Student ob1=new Student();
	        File f=new File("charlie.dat");
	        ob.serializeStudent(ob1,"charlie.dat");
	        	}

	}

