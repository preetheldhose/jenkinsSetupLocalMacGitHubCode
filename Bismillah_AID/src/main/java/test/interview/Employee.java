package test.interview;

public class Employee {
	
	int empID;
    String empName;
    
    Employee(int eID, String eName) {
    	empID = eID;
    	empName = eName;
    }
    
    public int returnEmpID() {
    	return empID;	
    }
    
    public String returnempName() {
    	return empName;
    }

}
