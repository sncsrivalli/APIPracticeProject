package crudOperationWithoutBDDApproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class AddProjectTest {
	
	@Test
	public void addProjectTest() {
	JSONObject jobj = new JSONObject();
	jobj.put("createdBy", "Srivalli");
	jobj.put("projectName", "RmgYantra007");
	jobj.put("status", "created");
	jobj.put("teamSize", 12);
	
	RequestSpecification reqspec = RestAssured.given();
	reqspec.body(jobj);
	reqspec.contentType(ContentType.JSON);
	
	Response response = reqspec.post("http://rmgtestingserver:8084/addProject");
	
	response.getContentType();
	ValidatableResponse valResponse = response.then();
	valResponse.assertThat().contentType(ContentType.JSON);
	valResponse.assertThat().statusCode(201);
	valResponse.log().all();
	
	
	}
}
