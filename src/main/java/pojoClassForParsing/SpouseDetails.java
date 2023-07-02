package pojoClassForParsing;

public class SpouseDetails {
	
	String spouseName;
	int spousePhoneNo;
	
	public SpouseDetails() {}
	public SpouseDetails(String name,int phoneNo ) {
		this.spouseName = name;
		this.spousePhoneNo = phoneNo;
	}
	public String getSpouseName() {
		return spouseName;
	}
	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}
	public int getSpousePhoneNo() {
		return spousePhoneNo;
	}
	public void setSpousePhoneNo(int spousePhoneNo) {
		this.spousePhoneNo = spousePhoneNo;
	}
	
	

}
