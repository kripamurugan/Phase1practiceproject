package seleniumscripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoITDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.remove.bg/");

		// Thread.sleep(5000);

		// div[@class='mx-auto w-full px-8 max-w-5xl relative']/descendant::button[1]

		WebElement e1 = driver
				.findElement(By.xpath("//div[@class='mx-auto w-full px-8 max-w-5xl relative']/descendant::button[1]"));
		Thread.sleep(5000);
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// s
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mx-auto
		// w-full px-8 max-w-5xl relative']/descendant::button[1]")));

		e1.click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\user\\OneDrive\\Desktop\\AutoIT_Files\\ScriptUpload1.exe");

	}

}