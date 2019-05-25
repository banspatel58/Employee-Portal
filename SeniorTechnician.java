// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// banspate

import java.util.Scanner;

public class SeniorTechnician extends StaffTechnician{

	private boolean serviceAward;
	
	//default constructor
	public SeniorTechnician(){
		
		
	}
	//overloaded constructor
	public SeniorTechnician( int JobID, int EmployeeID, String Name, double hourlyRate){
		
		//inherit the method from staffTech class which has following parameters using super key word which inturn refers to parent class
		super( JobID, EmployeeID, Name, hourlyRate);
		
		
		
		
	}
	public SeniorTechnician(String [] list){
		
		//inherit the method from staffTech class which has following parameters using super key word which inturn refers to parent class
		super(list);
		//set service awardto true as it has one
		serviceAward = true;
		// set hourlyRate as provided
		this.hourlyRate = 25;
	}
	
	//getter method for serviceAward
	public boolean hasAward(){
		
		return serviceAward;
		
	}
	
	//print the senior technicians using all the information using string formatting
	public void printSeniorTechnician(){
		
		System.out.printf( " ID:%-10d Name:%-20s Rate: %.2f \t Has Degree: %b   Has Service Award: %b \n", this.EmployeeID, this.Name, this.hourlyRate, this.serviceAward, this.Degree );
				
	}	
	


}