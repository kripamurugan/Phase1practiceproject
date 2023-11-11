package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		//Open a Browser
		
		
		WebDriver driver = new ChromeDriver();
		
		//Open a website
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//Maximize the browser window
		
		driver.manage().window().maximize();
		
		// Get the current URL
		
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL is : " + currentURL);
		
		// Get the page title
		
		String pageTitle =driver.getTitle();
		System.out.println("Page title is : " + pageTitle);
		
		WebElement element=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/a"));
		element.click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().forward();
		
		driver.close();
		
		driver.quit();
		
		

	}

}
