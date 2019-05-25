default: Driver.class Employee.class PharmacyManager.class StaffPharmacist.class StaffTechnician.class SeniorTechnician.class

Driver.class: Driver.java
	javac Driver.java

Employee.class: Employee.java
	javac Employee.java

StaffPharmacist.class: StaffPharmacist.java
	javac StaffPharmacist.java

PharmacyManager.class: PharmacyManager.java
	javac PharmacyManager.java
	
StaffTechnician.class: StaffTechnician.java
	javac StaffTechnician.java

SeniorTechnician.class: SeniorTechnician.java
	javac SeniorTechnician.java
	
	
clean:
	rm*.class
	

#to run java make file do "$ java Driver"