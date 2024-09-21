package seleniumpart2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		WebElement element = driver.findElement(By.id("multiselect1"));
		
		Select dropdown = new Select(element);
		dropdown.selectByIndex(0);
		dropdown.selectByValue("Hyundaix");
		dropdown.selectByVisibleText("Audi");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		dropdown.deselectByValue("Hyundaix");
		dropdown.selectByIndex(1);
		
		List<WebElement> listed = dropdown.getAllSelectedOptions();
		for(WebElement result:listed)	{
			String obj = result.getText();
			System.out.println(obj);
		}
		
	}

}
