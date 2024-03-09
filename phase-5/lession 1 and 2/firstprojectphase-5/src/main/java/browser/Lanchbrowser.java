package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lanchbrowser {
	static WebElement element;
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:4200/");
		
		Thread.sleep(3000);
		
		element = driver.findElement(By.xpath("/html/body/app-root/app-headerlogin/div/div[2]/div/a"));
		element.click();
		
		Thread.sleep(2000);
		
		element = driver.findElement(By.name("username"));
		element.sendKeys("admin");
		element = driver.findElement(By.name("password"));
		element.sendKeys("admin");
		
		Thread.sleep(1000);
		
		element = driver.findElement(By.tagName("button"));
		element.click();
		
		Thread.sleep(10000);
		
		driver.close();
	}

}
