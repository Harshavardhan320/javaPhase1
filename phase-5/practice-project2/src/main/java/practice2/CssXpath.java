package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssXpath {
	
	static WebDriver driver = new ChromeDriver();
	public static void main(String args[]) throws InterruptedException {
		
		driver.get("https://www.wikipedia.org/");
		
		//handling with CSS path
		WebElement element = driver.findElement(By.cssSelector("input[type='search']"));
		Thread.sleep(2000);
		element.sendKeys("A. P. J. Abdul Kalam");

		Thread.sleep(5000);
		
		
		//handling with X path
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button"));
		
		element1.click();
		
		Thread.sleep(3000);
		
		driver.close();
	}
}
