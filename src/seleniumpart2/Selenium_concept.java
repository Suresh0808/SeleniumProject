package seleniumpart2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_concept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String text = driver.findElement(By.xpath("(//p[@class='oxd-text oxd-text--p'])[1]")).getText();
		String username = text.substring(11);
		
		String text1 = driver.findElement(By.xpath("(//p[@class='oxd-text oxd-text--p'])[2]")).getText();
		String pass = text1.substring(11);
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pass);
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).submit();
	}
}
