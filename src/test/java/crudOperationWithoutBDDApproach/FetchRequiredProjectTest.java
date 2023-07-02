package crudOperationWithoutBDDApproach;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class FetchRequiredProjectTest {
	
	@Test
	public void fetchProjectTest() {
		
		RequestSpecification reqspec = RestAssured.given();
		Response response = reqspec.get("http://rmgtestingserver:8084/projects/TY_PROJ_963");
		
		ValidatableResponse valResponse = response.then();
		
		valResponse.assertThat().statusCode(200);
		valResponse.log().all();
	}

}
