// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// banspate

import java.util.Scanner;

public class StaffPharmacist extends Employee{
	
	protected boolean Licensed;
	
	//default constructor
	public StaffPharmacist(){
		
		
	}
	//overloaded constructor
	public StaffPharmacist( int JobID, int EmployeeID, String Name, double hourlyRate ){
		//inherit the method from employee class which has following parameters using super key word which inturn refers to parent class
		super( JobID, EmployeeID, Name);
		
				
	}
	public StaffPharmacist(String [] list){
		//inherit the method from employee class which has following parameters using super key word which inturn refers to parent class
		super(list);
		//set license to true as it has license
		this.Licensed = true;
		//set hourly rate for staff pharmacist as provided
		this.hourlyRate = 40;
		
	}
	
	//getter method for licensed
	public boolean hasLicense(){
		
		return Licensed;
		
	}
	//print the staff Pharmacist using all the information using string formatting
	public void printStaffPharmacist(){
		
		System.out.printf( " ID:%-10d Name:%-20s Rate: %.2f \t Licensed:%b \n", this.EmployeeID, this.Name, this.hourlyRate, this.Licensed);
				
	}	
	
}