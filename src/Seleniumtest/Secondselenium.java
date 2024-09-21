package Seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Secondselenium {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		System.out.println(driver.getTitle());
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		driver.navigate().refresh();
		//driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("abc123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456789");
		WebElement element = driver.findElement(By.partialLinkText("password"));
		String text = element.getText();
		System.out.println(text);
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
		//boolean enabled = element.isEnabled();
		//System.out.println(enabled);
		//boolean selected = element.isSelected();
		//System.out.println(selected);
	}
}
