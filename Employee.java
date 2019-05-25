// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// banspate

import java.util.Scanner;

public class Employee{
	
	protected int JobID;
	protected double hourlyRate;
	protected int EmployeeID;
	protected String Name;
	double pay;
	//default constructor
	public Employee(){
		
	
	}
	//overloaded constructor
	public Employee( int JobID, int EmployeeID, String Name){
		
		this.JobID = JobID;
		this.EmployeeID = EmployeeID;
		this.Name = Name;
		
	}
	//method 1 indicates what part of the text file is the student address information
	public Employee(String [] list){
		
		//the first element in the line is job id which is an int there fore use parseIntas array it is stored in is a string
		this.JobID = Integer.parseInt(list[0]);
		
		//the second element in line is employee id which is again int there fore use parse int as array it is stored in is a string
		this.EmployeeID = Integer.parseInt(list[1]);
		
		//the third and fourth element is first and last name which is string itself.
		this.Name = list[2] + " " +list[3];
		this.hourlyRate = hourlyRate;
		
	}
	//setter method for EmployeeID
	public void setEmployeeID( int ID ){
	
		this.EmployeeID = ID;
		
	}
	//getter method for Employee ID
	public int getEmployeeID(){
	
		return this.EmployeeID;
		
	}
	//setter method for Name
	public void setName( String employeeName ){
	
		this.Name = employeeName;
		
	}	
	//getter method for Last Name 
	public String getName(){
		
		return this.Name;
		
	}
	
	//setter method for Hourly Rate
	public void setHourlyRate( double rate ){
	
		hourlyRate = rate;
		
	}
	
	//getter method for Hourly Rate
	public double getHourlyRate(){
		
		return this.hourlyRate;
		
	}
	//calculate the paycheck for employees
	public void calculatePay(int hoursWorked, double hourlyRate){
		
		//multiply hourly rate with hours worked and store in variable called pay
		pay = hourlyRate * hoursWorked;
		//print the pay check
		System.out.printf( " ID:%-10d Check Amount: %.2f \n",	this.EmployeeID, pay);
		
	}
	
}