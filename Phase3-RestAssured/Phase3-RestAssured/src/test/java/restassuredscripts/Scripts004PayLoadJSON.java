package restassuredscripts;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.equalTo;

public class Scripts004PayLoadJSON {
@Test
	public void PostUsingJSON() {
		
		JSONObject body= new JSONObject();
		body.put("name", "Murugan");
		body.put("salary", "60000");
		body.put("age", "38");
		
		int responseID= RestAssured    //Chaining the request
		.given()
		.baseUri("https://dummy.restapiexample.com/api/v1/create")
		.contentType(ContentType.JSON)
		.body(body.toString())
		.when().post()
		.then()
		.statusCode(200)
		.body("data.name", equalTo("Murugan"))
		.extract().path("data.id");
		
		System.out.println(responseID);
	}
}
