package seleniumpart2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Frame_Concept {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("firstFr");
		driver.switchTo().frame(1);
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("august123@gmail.com");
		
		driver.switchTo().parentFrame();
		WebElement lastname = driver.findElement(By.name("lname"));
		lastname.sendKeys("Parent Frame");
		
		driver.switchTo().defaultContent();
		WebElement mainframe = driver.findElement(By.xpath("//a[text()='Courses']"));
		mainframe.click();
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File path = new File("C:\\Users\\sures\\eclipse-workspace\\Selenium_Concepts\\Screenshot\\img7.png");
		FileHandler.copy (source, path);
	}

}
