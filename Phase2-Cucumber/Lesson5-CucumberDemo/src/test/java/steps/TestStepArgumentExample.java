package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStepArgumentExample {

	WebDriver driver;
	
	@Given("I am on the tutorialsNinja HomePage")
	public void i_am_on_the_tutorials_ninja_home_page() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://tutorialsninja.com/demo/");
	}

	@Then("I am click on my account link")
	public void i_am_click_on_my_account_link() {
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
	}

	@When("I am click on login link")
	public void i_am_click_on_login_link() {
		driver.findElement(By.linkText("Login")).click();
	}

	@Then("I am  will be on the login page and I capture the title of the page")
	public void i_am_will_be_on_the_login_page_and_i_capture_the_title_of_the_page() {
		System.out.println("Title of the page is : " + driver.getTitle());

	}

	@Then("I am enter email id as {string} on the page")
	public void i_am_enter_email_id_as_on_the_page(String EmailId) {
		driver.findElement(By.id("input-email")).sendKeys(EmailId);
	}

	@Then("I am enter password as {string} on the page")
	public void i_am_enter_password_as_on_the_page(String password) {
		driver.findElement(By.id("input-password")).sendKeys(password);
	}

	@Then("I am click login button")
	public void i_am_click_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

}
