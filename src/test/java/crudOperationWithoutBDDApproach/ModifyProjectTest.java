package crudOperationWithoutBDDApproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class ModifyProjectTest {
	
	@Test
	public void modifyProjectTest() {
	JSONObject jobj = new JSONObject();
	jobj.put("createdBy", "Srivalli");
	jobj.put("projectName", "RmgYantra007");
	jobj.put("status", "todo");
	jobj.put("teamSize", 25);
	
	RequestSpecification reqspec = RestAssured.given();
	reqspec.body(jobj);
	reqspec.contentType(ContentType.JSON);
	
	Response response = reqspec.put("http://rmgtestingserver:8084/projects/TY_PROJ_745");
	
	response.getContentType();
	ValidatableResponse valResponse = response.then();
	valResponse.assertThat().contentType(ContentType.JSON);
	valResponse.assertThat().statusCode(200);
	valResponse.log().all();
	
	
	}

}
