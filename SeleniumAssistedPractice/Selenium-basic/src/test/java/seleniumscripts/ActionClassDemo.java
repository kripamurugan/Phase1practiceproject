package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/newtours/");

		WebElement link_Home = driver.findElement(By.linkText("Home"));

		WebElement td_Home = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]"));

		Actions act = new Actions(driver);

		Action mouseOverHome = act.moveToElement(link_Home).build();
		
		Thread.sleep(3000);

		mouseOverHome.perform();
		
		Thread.sleep(3000);

		driver.close();

	}

}