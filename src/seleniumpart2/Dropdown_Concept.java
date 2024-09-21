package seleniumpart2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Concept {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		WebElement element = driver.findElement(By.id("day"));
		element.click();
		Select select = new Select(element);
		select.selectByIndex(5);
		//select.selectByValue("10");
		//select.selectByVisibleText("1");
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		
		WebElement element1 = driver.findElement(By.id("month"));
		element1.click();
		Select month = new Select(element1);
		month.selectByVisibleText("Feb");
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
	}

}
