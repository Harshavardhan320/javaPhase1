package webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageElement {
	static WebElement element;
	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//Locating WebPage Element;
		
		driver.get("http://www.google.com");
		
		element = driver.findElement(By.tagName("textarea"));
		element.click();
		
		Thread.sleep(2000);
		
		element.sendKeys("facebook.com");
		
		Thread.sleep(5000);
		
		driver.close();
		
	}
}
