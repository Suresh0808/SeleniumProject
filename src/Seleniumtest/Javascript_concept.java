package Seleniumtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Javascript_concept {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement aboutus = driver.findElement(By.xpath("//a[text()='About Us']"));
		WebElement careers = driver.findElement(By.xpath("//a[text()='Careers']"));


		JavascriptExecutor script = (JavascriptExecutor) driver;
		script.executeScript("arguments[0].scrollIntoView();",aboutus);
		script.executeScript("arguments[0].click();", careers);
		script.executeScript("window.scrollBy(0,-3000)","");
		script.executeScript("window.scrollBy(0,1000)");
	}

}
