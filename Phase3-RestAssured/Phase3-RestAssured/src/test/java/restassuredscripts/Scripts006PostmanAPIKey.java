package restassuredscripts;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Scripts006PostmanAPIKey {
	@Test(priority = 1)
	public void postmanGetMethod() {

		String PMapiKey = "PMAK-6577e4081d2a72003f52bcc4-a46b5ccff311344c43b639e485c065c692";
		given().baseUri("https://api.postman.com").basePath("/workspaces").header("x-api-key", PMapiKey).when().get()
				.then().statusCode(200).log().all();
	}

	@Test(priority = 2)
	public void extract_value_response() {

		String PMapiKey = "PMAK-6577e4081d2a72003f52bcc4-a46b5ccff311344c43b639e485c065c692";
		String responseoutput = given().baseUri("https://api.postman.com").basePath("/workspaces")
				.header("x-api-key", PMapiKey).when().get().then().extract().path("workspaces[1].name");
		System.out.println("The name of the workspace extracted is :" + responseoutput);
	}

	@Test(priority = 3)
	public void extract_response_JSONPath() {
		String PMapiKey = "PMAK-6577e4081d2a72003f52bcc4-a46b5ccff311344c43b639e485c065c692";
		Response res = given().baseUri("https://api.postman.com").basePath("/workspaces").header("x-api-key", PMapiKey)
				.when().get().then().extract().response();

		JsonPath json = new JsonPath(res.asString());
		System.out.println(json.getString("workspaces[15]"));

	}
}
