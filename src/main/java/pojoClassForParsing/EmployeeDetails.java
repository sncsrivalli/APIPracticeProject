package pojoClassForParsing;

public class EmployeeDetails {

	// Step 1: Declaration of variables
	public String empName;
	String empID;
	int phoneNo;
	String address;
	String mailID;

	//Step 2: Create constructor for initialization
	
	public EmployeeDetails() {}
	
	public EmployeeDetails(String empName, String empID, int phoneNo, String address, String mailID) {

		this.empName = empName;
		this.empID = empID;
		this.phoneNo = phoneNo;
		this.address = address;
		this.mailID = mailID;
		
	}

	//Step 3: Generate getters and setters
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMailID() {
		return mailID;
	}

	public void setMailID(String mailID) {
		this.mailID = mailID;
	}
	
	

}
