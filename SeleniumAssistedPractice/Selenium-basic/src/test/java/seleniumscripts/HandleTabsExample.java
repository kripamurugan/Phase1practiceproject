package seleniumscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTabsExample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");

		// On our keyboard if we give CTL T , out new tab will open
		// same thing if we have to ask selenium to do for us then we Robot class
		// USing robot class we can do virtual keyboard events

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL); // press ctl key on virtual keybord

		r.keyPress(KeyEvent.VK_T); // press letter T

		// Now release the key

		r.keyRelease(KeyEvent.VK_CONTROL); // release ctl key on virtual keybord

		r.keyRelease(KeyEvent.VK_T); // release letter T

		r.keyPress(KeyEvent.VK_CONTROL); // press ctl key on virtual keybord

		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL); // release ctl key on virtual keybord

		r.keyRelease(KeyEvent.VK_T); // release letter T

		// how many tabs are open

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		System.out.println(tabs);

		driver.switchTo().window(tabs.get(1));

		driver.get("https://www.simplilearn.com/");

		Thread.sleep(1000);

		driver.switchTo().window(tabs.get(0));

		driver.get("https://github.com/");

		Thread.sleep(1000);

		// close() closes only the current window , driver. quit() method closes all
		// browser windows and ends the WebDriver session

		driver.quit(); // close all the tabs and the browser window

		// driver.close(); // close only that particular tab on the window that
		// currently you are on.

	}

}