package Seleniumtest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		WebElement element = driver.findElement(By.xpath("//span[text()='Sign up']"));
		Thread.sleep(3000);
		element.click();
		/*WebElement instahomepage = driver.findElement(By.xpath("//a[text()='Twitter']"));
		instahomepage.click();
		WebElement twitter = driver.findElement(By.xpath("//a[text()='Go to twitter.com']"));
		twitter.click();*/
		TakesScreenshot shot = (TakesScreenshot) element;
		File source = shot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\sures\\eclipse-workspace\\Selenium_Concepts\\Screenshot\\img5.png");
		FileHandler.copy(source, dest);
		driver.quit();
	}

}
