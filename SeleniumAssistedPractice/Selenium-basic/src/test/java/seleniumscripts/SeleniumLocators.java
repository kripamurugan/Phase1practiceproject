package seleniumscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) {
		// TO open the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%25253ASign+up");
		boolean displayed=driver.findElement(By.id("wpName2")).isDisplayed();
		System.out.println("element is displayed?" +displayed);
		boolean enabled=driver.findElement(By.id("wpName2")).isEnabled();
		System.out.println("element is enabled?" +enabled);
		
		driver.findElement(By.id("wpName2")).sendKeys("demoluser");
		WebElement password= driver.findElement(By.id("wpPassword2"));
		displayed=password.isDisplayed();
		System.out.println("element password is displayed?" +displayed);
		enabled=password.isEnabled();
		System.out.println("element password is enabled?" +enabled);
		password.sendKeys("demo@123");
		
		WebElement retypePassword= driver.findElement(By.name("retype"));
		retypePassword.sendKeys("demo@123");
		WebElement email= driver.findElement(By.name("email"));
		email.sendKeys("admindemo123@gmail.com");
		
		driver.navigate().to("https://www.redbus.in/");
		
		// with xpath locator

				driver.findElement(By.xpath("//*[@id=\'src\']")).sendKeys("Mumbai");

				// cssselector : If you get ID as an attribute then you need to provide value
				// like "#src", "#firstname"

				driver.findElement(By.cssSelector("#src")).sendKeys("Mumbai");
		
		
	}

}
