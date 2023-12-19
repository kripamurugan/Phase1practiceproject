package restassuredscripts;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Scripts010_LoggingMethods {
	
	
	@Test
	public void LoggingRestAssured() {
		
		String PMapikey = "PMAK-6577e4081d2a72003f52bcc4-a46b5ccff311344c43b639e485c065c692";
		
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key", PMapikey)
		.when().get()
		.then().log().all();
		//.then().log().headers();
		//.then().log().ifError();
		//.then().statusCode(200).log().cookies();
		
		
	}

}
