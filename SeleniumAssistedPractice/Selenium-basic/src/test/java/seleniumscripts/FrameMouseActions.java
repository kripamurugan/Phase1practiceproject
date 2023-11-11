package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameMouseActions {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");

		// Switch to the frame using its name or index. It is only used when you have
		// iframe in your html code

		driver.switchTo().frame(0);

		// Finding element to be dragged - Source

		WebElement e1 = driver.findElement(By.id("draggable"));

		// find element where we have to drop - Target

		WebElement e2 = driver.findElement(By.id("droppable"));

		// Mouse Event

		Actions a = new Actions(driver);
		
		Thread.sleep(3000);

		a.clickAndHold(e1).moveToElement(e2).release().perform();
		
		driver.close();

	}

}