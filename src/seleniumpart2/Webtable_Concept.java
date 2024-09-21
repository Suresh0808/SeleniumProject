package seleniumpart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Concept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");
		WebElement fat = driver.findElement(By.xpath("//table[1]/thead[1]/th[3]"));
		String f1 = fat.getText();
		System.out.println(f1);
		
		WebElement data1 = driver.findElement(By.xpath("//table[1]/tr[1]/td[3]"));
		String f2 = data1.getText();
		System.out.println(f2);
		
		WebElement data2 = driver.findElement(By.xpath("//table[1]/tr[2]/td[3]"));
		String f3 = data2.getText();
		System.out.println(f3);
		
		WebElement data3 = driver.findElement(By.xpath("//table[1]/tr[3]/td[3]"));
		String f4 = data3.getText();
		System.out.println(f4);
		
		WebElement data4 = driver.findElement(By.xpath("//table[1]/tr[4]/td[3]"));
		String f5 = data4.getText();
		System.out.println(f5);
		
		WebElement data5 = driver.findElement(By.xpath("//table[1]/tr[5]/td[3]"));
		String f6 = data5.getText();
		System.out.println(f6);
	}

}
