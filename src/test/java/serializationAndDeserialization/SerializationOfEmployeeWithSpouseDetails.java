package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForParsing.EmployeeDetailsWithSpouseDetails;
import pojoClassForParsing.SpouseDetails;

public class SerializationOfEmployeeWithSpouseDetails {
	

	@Test
	public void employeeDetailsTest() throws JsonGenerationException, JsonMappingException, IOException {
		
		SpouseDetails spouse = new SpouseDetails("XYZ", 65656565);
		//Step 1: Create an object for POJO classes
		EmployeeDetailsWithSpouseDetails emp0 = new EmployeeDetailsWithSpouseDetails("ABC", "TY_01", 876543210, "Bangalore", "abc@gmail.com",spouse);
		
		//Step 2: create the object for object mapper
		ObjectMapper obj = new ObjectMapper();
		
		//Step 3: Write the values to json file
		obj.writeValue(new File("employeeDetailsWithSpouse.json"), emp0);
	}


}
