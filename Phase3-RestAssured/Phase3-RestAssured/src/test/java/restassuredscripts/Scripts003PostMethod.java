package restassuredscripts;
import java.util.HashMap;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Scripts003PostMethod {
@Test
	public void postMethod() {
	HashMap<String,String>	map= new HashMap<String,String>();
	map.put("name", "Kripa");
	map.put("jobs", "QA Engineer");
	
	
	//https://reqres.in/api/users
	
	RestAssured
	.given().baseUri("https://reqres.in/")
	.basePath("/api/users")
	.contentType("application/json")
	.body(map)
	.when().post()
	.then().statusCode(201).log().all();
		
	}
}
