package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import org.testng.Assert;

public class GithubSteps_BDD {
	
	Response res;
	
	
	@Given("User Enters github base URL and Authorization")
	public void user_enters_github_base_url_and_authorization() {
		
		given().baseUri("https://api.github.com").basePath("/user/repos")
		.header("Authorization","Bearer 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");
		
		
	}
	  
	

	@When("User executes HTTP get method")
	public void user_executes_http_get_method() {
		
		res = given().baseUri("https://api.github.com").basePath("/user/repos")
				.header("Authorization","Bearer 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")
				.when().get();
	 
	}

	@Then("Validate the response status code")
	public void validate_the_response_status_code() {
		
		res.prettyPrint();
		Assert.assertEquals(res.statusCode(), 200);
		
	}
	 

}
