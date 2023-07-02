package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForParsing.EmployeeDetails;

public class SerializationOfEmployeeDetailsTest {
	
	@Test
	public void employeeDetailsTest() throws JsonGenerationException, JsonMappingException, IOException {
		//Step 1: Create an object for POJO classes
		EmployeeDetails emp0 = new EmployeeDetails("ABC", "TY_01", 876543210, "Bangalore", "abc@gmail.com");
		
		//Step 2: create the object for object mapper
		ObjectMapper obj = new ObjectMapper();
		
		//Step 3: Write the values to json file
		obj.writeValue(new File("employeeDetails.json"), emp0);
		EmployeeDetails emp =obj.readValue(new File("employeeDetails.json"), EmployeeDetails.class);
		System.out.println(emp.empName);
	}

}
