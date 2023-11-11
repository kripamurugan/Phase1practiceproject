package seleniumscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.ironspider.ca/forms/dropdowns.htm");

		// Select the dropdown

		WebElement e1 = driver.findElement(By.xpath("//select[@name='coffee']"));

		// Selecting the drop down and to perform action on it, we need to create object
		// of Select class in selenium

		Select dd = new Select(e1);

		dd.selectByIndex(4); // You can select dropdown values with the help of Index

		Thread.sleep(2000);

		dd.selectByValue("regular");

		Thread.sleep(2000);

		dd.selectByVisibleText("With cream");

		// Get all the options from the dropdown and store in the list

		List<WebElement> li = dd.getOptions();

		System.out.println("The size of the list : " + li.size());

		// print all the values of the dropdown

		for (WebElement l : li) {

			System.out.println(l.getText());
		}

	}

}
