package restassuredsimplilearn.in;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
public class GetDemo {
@Test
public void getServerResponse() {
	RestAssured
	     .when()
	          .get("https://reqres.in/api/users?page=2")
	     .then()
	          .assertThat()
	          .statusCode(200)
	          .log().all();
}
}
