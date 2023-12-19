package restassuredscripts;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Scripts007HamcrestValidateMethod {

	//Hamcrest dependency is added to the pom file
	// This dependency provides us many validation methods that help us to validate the response code
	
	// equalTo() Hamcrest method
	
	@Test(priority='1')
	public void validateResponseBody() {
		String PMapiKey = "PMAK-6577e4081d2a72003f52bcc4-a46b5ccff311344c43b639e485c065c692";	
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key", PMapiKey)
		.when().get()
		.then().statusCode(200)
		
		
		.body("workspaces[1].id",equalTo("2dce1613-dda0-4785-83f2-6d0f0a7a52a1"),
		"workspaces[1].name",equalTo("Phase3-Postman"),
		"workspaces[1].type", equalTo("personal"));
		
		
		
	}
	
	@Test(priority='2')
	public void ValidateResponseBody_equalTo() {
		
		
		given().baseUri("https://petstore.swagger.io")
		.basePath("/v2/user/kripamurugan")
		.when().get()
		.then().statusCode(200)
		//fetch the response body and validate if response includes correct values or not
		
		.body("username", equalTo("kripamurugan"),
			 ("firstName"),equalTo("kripa"),
			 ("lastName"),equalTo("murugan"),
			 ("email"),equalTo("murgan@gmail.com"),
			 ("userStatus"),equalTo(1));
			 
			 		
	}
	
	@Test(priority='3')
	public void ValidateResponseBody_hasItems() {
		
	String PMapikey="PMAK-6577e4081d2a72003f52bcc4-a46b5ccff311344c43b639e485c065c692";
		
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key",PMapikey )
		.when().get()
		.then().statusCode(200)
		// fetch the response body and validate if response includes correct values or not
		
		.body("workspaces.name", hasItems("Phase3-Postman","Workspace-PostmanDemo"),
			 "workspaces.type", hasItems("personal"));
		
		
	}
}

