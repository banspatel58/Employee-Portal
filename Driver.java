// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// banspate
import java.io.File;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver{
	
	public static void main (String args[] ){
		
		//ask for user input what user would like to do
		Scanner scanner = new Scanner( System.in );
		System.out.print ( "  1. Load Employee (From File) \n  2. Exit Program \n Enter Your Selection: " );
		int input = scanner.nextInt();
		
		//if user inputs 1 read the text file and print employees loaded from the file
		if (input == 1 ){
			String[] Data;
			/**
			**create four arrays each of type StaffPharmacist, PharmacyManager, StaffTechnician, Senior technician
			**in order to store the employee objects. create arrays of length 1
			**/
			StaffPharmacist [] Pharmacist = new StaffPharmacist[1];		
			PharmacyManager [] Manager = new PharmacyManager[1];			
			StaffTechnician [] staffTech = new StaffTechnician[1];			
			SeniorTechnician [] seniorTech = new SeniorTechnician[1];
			try{
				//read the text file using scanner
				File file = new File("employees.txt");
						
				Scanner sc = new Scanner(file);
					
				//while text file has next line split the text to store all elements in to an array
				while (sc.hasNextLine()){
					
					//read the text file and store it in an array called data. split the text file at , and read until we have next line
					Data = sc.nextLine().split(",");
					
					//create 4 employee objects of each employee type 
					PharmacyManager pharmacyManager = new PharmacyManager(Data);
					StaffPharmacist staffPharmacist = new StaffPharmacist(Data);
					StaffTechnician staffTechnician = new StaffTechnician(Data);
					SeniorTechnician seniorTechnician = new SeniorTechnician(Data);
						
					int i;
					/** parse through the text files to check the job id number.
					if the job id is one than the employee is pharmacy manager and there fore store it in an array of type pharmacy manager, else if job id == 2 than it is a staff pharmacist there fore store the staff pharmacist employee in the respective array. else if job id == 3 the employee is a staff technician therefore store the employee object staff technician in array of type staff technician and if the id == 4 than the employee is senior technician so store the employee senior technician in an array of type senior technician
					**/
					for( i = 0; i < Data.length; i = i + 4){
						if( Integer.parseInt(Data[i]) == 1 ){
								
							Manager[0] = pharmacyManager;
								
						}else if( Integer.parseInt(Data[i]) == 2 ){
								
							Pharmacist[0] = staffPharmacist;
								
						}else if( Integer.parseInt(Data[i]) == 3 ){
								
							staffTech[0] = staffTechnician;
								
						}else if( Integer.parseInt(Data[i]) == 4 ){
								
							seniorTech[0] = seniorTechnician;
								
						}
					}
				}
					
				//close the file 
				sc.close();
					
				//print that the file loaded success fully
				System.out.println ( " \n File Successfully Loaded! " );
					
				//set a boolean variable named keepgoing equal to true.
				boolean keepGoing = true;
				//as long as keep going remains true, do the following steps
				while(keepGoing){
					
					//ask the user what they would like to do next
					System.out.print ( " \n  1. Print Employee Information \n  2. Enter Hours Worked \n  3. Calculate Paychecks \n  4. Exit Program \n Enter Your Selection: " );
					input = scanner.nextInt();
					do{
						//if user inputs 3 that is tries to print checks prior to entering hours worked than throw an error
						if(input == 3){
									
							System.out.println( " Please enter the hours worked (Option #2) before trying to calculate the paycheck amounts! " );
							
							//again ask the user after throwing the exception about what they would like to do
							System.out.print ( " \n  1. Print Employee Information \n  2. Enter Hours Worked \n  3. Calculate Paychecks \n  4. Exit Program \n Enter Your Selection: " );
							input = scanner.nextInt();
							
						}
						
						//do this steps as long as user inputs 1 or 2
						do{
							//if the user inputs 1 print the employee information described in respective classes of employees
							if(input == 1){
									
								Manager[0].printPharmacyManager();
									
								Pharmacist[0].printStaffPharmacist();
									
								seniorTech[0].printSeniorTechnician();
									
								staffTech[0].printStaffTechnician();
									
									
							}
							
							//if the user inputs 2 prompt the user asking the number of hours worked by employees
							else if(input == 2){
									
								System.out.print( " \n Please enter the hours worked: " );
								int workingHours = scanner.nextInt();
								
								//than again ask user what they would like to do
								System.out.print ( " \n  1. Print Employee Information \n  2. Enter Hours Worked \n  3. Calculate Paychecks \n  4. Exit Program \n Enter Your Selection: " );
								input = scanner.nextInt();
								
								/**if user inputs 3 after they entered number of hours employees worked than calculate the employee pay checks
								using the calculate pay method defined in employee class
								get the employees pay rate by using getHourlyRate method defined in employee class
								**/
								if(input == 3){
										
									Manager[0].calculatePay(workingHours, Manager[0].getHourlyRate() );
									Pharmacist[0].calculatePay(workingHours, Pharmacist[0].getHourlyRate() );
									staffTech[0].calculatePay(workingHours, seniorTech[0].getHourlyRate() );
									seniorTech[0].calculatePay(workingHours, staffTech[0].getHourlyRate() );
										
								}
										
							}
							//again show the menu to the user asking them what they would like to do
							//if user enters one or two or three repeat the above steps else exit the loop
							System.out.print ( " \n  1. Print Employee Information \n  2. Enter Hours Worked \n  3. Calculate Paychecks \n  4. Exit Program \n Enter Your Selection: " );
							input = scanner.nextInt();
								
						}while(input == 1 || input == 2 );
					}while(input == 3);
					//if user enters 4 set keepGoing = false print good bye and exit the loop.
					if(input == 4){
						
						keepGoing = false;
						System.out.println( " Goodbye! " );
			
					}
											
				}
				
			//if the file is not found in the system throw an IO exception printing file not found							
			}catch(FileNotFoundException fnfe){
							
				//catch the exception if the file is not found
				System.out.println(" File Load Failed! \n java.io.FileNotFoundException: employees.txt ( The system cannot find the file specified) \n Program Exiting..... ");
							
			}
		}	
		//if the user inputs 2 in the main menu bar exit the loop and say goodBye!
		if(input == 2){
				
			System.out.println ( "\n Good Bye! \n" );
				
		}
			
	}
}