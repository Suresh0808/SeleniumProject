package seleniumpart2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action_concept {

	public static void main(String[] args) throws AWTException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action = new Actions(driver);
		WebElement element1 = driver.findElement(By.xpath("//span[text()='Prime']"));
		action.moveToElement(element1).perform();
		WebElement element2 = driver.findElement(By.id("multiasins-img-link"));
		action.contextClick(element2).perform();
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		//robot.keyPress(KeyEvent.VK_DOWN);
		//robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		Set<String> windows = driver.getWindowHandles();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		for(String child : windows) {
			if(!parentWindow.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
			}				
		}
	}
}
