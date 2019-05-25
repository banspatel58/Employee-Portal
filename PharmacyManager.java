// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// banspate

import java.util.Scanner;


public class PharmacyManager extends StaffPharmacist{

	private boolean Leadership;
	
	public PharmacyManager(){
		
		
	}
	public PharmacyManager( int JobID, int EmployeeID, String Name, double hourlyRate ){
		
		//inherit the method from staffPharmacist class which has following parameters using super key word which inturn refers to parent class
		super( JobID, EmployeeID, Name, hourlyRate );
				
	}
	
	public PharmacyManager(String [] list){
		
		//inherit the method from staffPharmacist class which has following parameters using super key word which inturn refers to parent class
		super(list);
		//set leadership to true as it is
		Leadership = true;
		//set hourly rate as given
		this.hourlyRate = 50;
	}
	//getter method for Leadership
	public boolean isLeader(){
		
		return Leadership;
		
	}	
	//print the PharmacyManager using all the information using string formatting
	public void printPharmacyManager(){
		
		System.out.printf( " ID:%-10d Name:%-20s Rate: %.2f \t Licensed: %b  Has Leadership: %b \n", this.EmployeeID, this.Name, this.hourlyRate, this.Leadership, this.Licensed );
		
				
	}	
	

	
}