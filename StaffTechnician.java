// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// banspate

import java.util.Scanner;

public class StaffTechnician extends Employee{
	
	protected boolean Degree;
	
	//default constructor
	public StaffTechnician(){
		
		
	}
	//overloaded constructor
	public StaffTechnician( int JobID, int EmployeeID, String Name, double hourlyRate ){
		
		//inherit the method from employee class which has following parameters using super key word which inturn refers to parent class
		super( JobID, EmployeeID, Name);
			
	}
	public StaffTechnician(String [] list){
		//inherit the method from employee class which has following parameters using super key word which inturn refers to parent class
		super(list);
		//set degree = true as it has degree 
		this.Degree = true;
		//set hourly rate for staff tech as provided
		this.hourlyRate = 20;
		
	}
	//getter method for degree
	public boolean hasDegree(){
		
		return Degree;
		
	}
	//print the staff technicians using all the information using string formatting
	public void printStaffTechnician(){
		
		System.out.printf( " ID:%-10d Name:%-20s Rate: %.2f \t Has Degree: %b \n", this.EmployeeID, this.Name, this.hourlyRate, this.Degree);
				
	}	
	
}