package pojoClassForParsing;

public class EmployeeDetailsWithSpouseDetails {

	// Step 1: Declaration of variables
		String empName;
		String empID;
		int phoneNo;
		String address;
		String mailID;
		SpouseDetails spouse;

		//Step 2: Create constructor for initialization
		
		public EmployeeDetailsWithSpouseDetails() {}
		
		public EmployeeDetailsWithSpouseDetails(String empName, String empID, int phoneNo, String address, String mailID, SpouseDetails spouse) {

			this.empName = empName;
			this.empID = empID;
			this.phoneNo = phoneNo;
			this.address = address;
			this.mailID = mailID;
			this.spouse = spouse;
			
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
		
		public SpouseDetails getSpouse() {
			return spouse;
		}

		public void setSpouse(SpouseDetails spouse) {
			this.spouse = spouse;
		}
		
		
}
