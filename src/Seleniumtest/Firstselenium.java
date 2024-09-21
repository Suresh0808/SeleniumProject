package Seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Firstselenium {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println(title);
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		driver.manage().window().fullscreen();
		driver.manage().window().minimize();*/
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.navigate().back();
		//driver.navigate().refresh();
		driver.findElement(By.id("email")).sendKeys("abc123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Password@123");
		driver.navigate().to("https://www.amazon.in/");
	}
 
}