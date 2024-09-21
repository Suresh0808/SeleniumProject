package Seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Browser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.className("gLFyf")).sendKeys("Indian girl name Yogita meaning" + Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("www.onlymyhealth.com")).click();
		Thread.sleep(3000);*/
		//driver.navigate().to("https://www.facebook.com/");
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		//driver.findElement(By.name("email")).sendKeys("Hi Ganga, Thank You");
		//Thread.sleep(4000);
		//driver.quit();
		//driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.findElement(By.name("firstname")).sendKeys("Ganga");
		driver.findElement(By.name("lastname")).sendKeys("S");
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("sureshrain1331@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sureshrain1331@gmail.com");
		WebElement password = driver.findElement(By.id("password_step_input"));
		password.sendKeys("123456789");
		driver.findElement(By.partialLinkText("Already have an account?")).click();
		driver.findElement(By.id("email")).sendKeys("sureshrain1331@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("090610");
		driver.findElement(By.name("login")).click();
		driver.manage().window().maximize();
	}
}
