package projectbasic;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basic_Project {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		WebElement createacct = driver.findElement(By.xpath("//a[text()='Create an Account']"));
		createacct.click();
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("Suresh");
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("S");
		WebElement email = driver.findElement(By.id("email_address"));
		email.sendKeys("Automation123412@gmail.com");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Testing@456");
		WebElement cpass = driver.findElement(By.id("password-confirmation"));
		cpass.sendKeys("Testing@456");
		WebElement acctbutton = driver.findElement(By.xpath("//span[text()='Create an Account']"));
		acctbutton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions action = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("//span[text()='Men']"));
		action.moveToElement(men).perform();
		WebElement element = driver.findElement(By.id("ui-id-17"));
		action.moveToElement(element).perform();
		WebElement hoodies = driver.findElement(By.id("ui-id-20"));
		action.click(hoodies).perform();
		
		WebElement sort = driver.findElement(By.id("sorter"));
		sort.click();
		Select select = new Select(sort);
		select.selectByValue("price");
		
		WebElement material = driver.findElement(By.xpath("//div[text()='Material']"));
		action.click(material).perform();
		
		WebElement hemp = driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[6]/div[2]/ol/li[3]/a"));
		action.click(hemp).perform();
		
		WebElement rightclick = driver.findElement(By.xpath("//div[@class='product-item-info']"));
		action.contextClick(rightclick).perform();
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		String window1 = driver.getWindowHandle();
		
		Set <String> window2 = driver.getWindowHandles();
		for(String window : window2) {
			if(!window1.equalsIgnoreCase(window)) {
				driver.switchTo().window(window);
			}
		}
		
		WebElement sizeM = driver.findElement(By.xpath("//div[@id='option-label-size-143-item-168']"));
		action.click(sizeM).perform();
		WebElement colorGreen = driver.findElement(By.xpath("//div[@id='option-label-color-93-item-53']"));
		action.click(colorGreen).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement qty = driver.findElement(By.id("qty"));
		qty.clear();
		qty.sendKeys("4");
		WebElement cart = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		action.click(cart).perform();
		driver.switchTo().window(window1);
		
		WebElement clearall = driver.findElement(By.xpath("//span[text()='Clear All']"));
		action.click(clearall).perform();
		WebElement size = driver.findElement(By.xpath("//div[text()='Size']"));
		action.click(size).perform();
		WebElement sizeL = driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/div/div/a[4]/div"));
		action.click(sizeL).perform();
		WebElement color = driver.findElement(By.xpath("//div[text()='Color']"));
		action.click(color).perform();
		WebElement colorred = driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[2]/div/div/a[9]/div"));
		action.click(colorred).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement linkcart1 = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/div/strong/a"));
		action.moveToElement(linkcart1).perform();
		WebElement addtocart1 = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		action.click(addtocart1).perform();
		WebElement linkcart2 = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[2]/div/div/strong/a"));
		action.moveToElement(linkcart2).perform();
		WebElement addtocart2 = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		action.click(addtocart2).perform();
		WebElement linkcart3 = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[3]/div/div/strong/a"));
		action.moveToElement(linkcart3).perform();
		WebElement addtocart3 = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		action.click(addtocart3).perform();
		WebElement linkcart4 = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[4]/div/div/strong/a"));
		action.moveToElement(linkcart4).perform();
		WebElement addtocart4 = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		action.click(addtocart4).perform();
		WebElement linkcart5 = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[5]/div/div/strong/a"));
		action.moveToElement(linkcart5).perform();
		WebElement addtocart5 = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		action.click(addtocart5).perform();
		WebElement linkcart6 = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[6]/div/div/strong/a"));
		action.moveToElement(linkcart6).perform();
		WebElement addtocart6 = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		action.click(addtocart6).perform();
		Thread.sleep(3000);
		WebElement linkcart7 = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[7]/div/div/strong/a"));
		action.moveToElement(linkcart7).perform();
		WebElement addtocart7 = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[7]/div/div/div[3]/div/div[1]/form/button/span"));
		action.click(addtocart7).perform();
		Thread.sleep(3000);
		WebElement movetocart = driver.findElement(By.xpath("//a[@class='action showcart']"));
		action.click(movetocart).perform();
		WebElement vieweditcart = driver.findElement(By.xpath("//span[text()='View and Edit Cart']"));
		action.click(vieweditcart).perform();
		
		List<WebElement> totalqty= driver.findElements(By.xpath("//*[@data-role='cart-item-qty']"));
		for(WebElement cartqty : totalqty ) {
			cartqty.clear();
			cartqty.sendKeys("2");
		}
		
		WebElement updatecart = driver.findElement(By.xpath("//span[text()='Update Shopping Cart']"));
		action.click(updatecart).perform();
		driver.navigate().refresh();
		WebElement proceedcart = driver.findElement(By.xpath("//button[@class='action primary checkout'][@data-role='proceed-to-checkout']"));
		JavascriptExecutor script = (JavascriptExecutor) driver;
		script.executeScript("arguments[0].scrollIntoView();",proceedcart);
		script.executeScript("arguments[0].click();", proceedcart);
		
		driver.findElement(By.name("street[0]")).sendKeys("Po box 1872");
		driver.findElement(By.name("street[1]")).sendKeys("4th ave suite 401");
		driver.findElement(By.name("street[2]")).sendKeys("long beach");
		driver.findElement(By.name("city")).sendKeys("Los Angeles");
		WebElement region = driver.findElement(By.xpath("//select[@name='region_id'][@aria-required='true']"));
		Select select1 = new Select(region);
		select1.selectByIndex(13);
		driver.findElement(By.name("postcode")).sendKeys("87432");
		WebElement country = driver.findElement(By.name("country_id"));
		Select select2 = new Select(country);
		select2.selectByValue("US");
		driver.findElement(By.name("telephone")).sendKeys("8778423210");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@value='tablerate_bestway']")).click();
		WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
		action.click(next).perform();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@title='Place Order']")).click();
		Thread.sleep(5000);
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\sures\\eclipse-workspace\\Selenium_Concepts\\Screenshot\\order placed.png");
		FileHandler.copy(source, destination);
		driver.quit();
	}
}