package Seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Xpath_Concepts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		//String title = driver.getTitle();
		//System.out.println(title);
		driver.get("https://www.facebook.com/");
		//driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("sureshrain1331@gmail.com");
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("12345");
		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("090610");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		driver.close();
		WebDriver driver1 = new EdgeDriver();
		driver1.navigate().to("https://www.instagram.com/");
		/*WebElement element = driver.findElement(By.partialLinkText("Forgot"));
		String text = element.getText();
		System.out.println(text);
		WebElement element1 = driver.findElement(By.name("login")); 
		boolean displayed = element1.isDisplayed();
		System.out.println(displayed);
		boolean enabled = element1.isEnabled();
		System.out.println(enabled);
		boolean selected = element1.isSelected();
		System.out.println(selected);
		driver.get("https://www.amazon.in/");
		List<WebElement> elements = driver.findElements(By.xpath("//a[@class='nav-a  ']"));
		for (WebElement element2:elements) {
			//String elementNames = element2.getText();
			System.out.println(element2.getText());
		}*/
	}

}
