package seleniumpart2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Concept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		WebElement simple = driver.findElement(By.id("accept"));
		simple.click();
		Alert simplealert = driver.switchTo().alert();
		simplealert.accept();
		
		WebElement confirm =driver.findElement(By.id("confirm"));
		confirm.click();
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.accept();
		
		WebElement prompt = driver.findElement(By.id("prompt"));
		prompt.click();
		Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys("abc123");
		promptalert.accept();
		
		
	}

}
