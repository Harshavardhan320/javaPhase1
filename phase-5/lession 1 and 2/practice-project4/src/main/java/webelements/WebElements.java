package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements {
	
	static WebElement element;
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/createaccount?flowEntry=SignUp");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		element = driver.findElement(By.name("firstName"));
		
		element.sendKeys("harsha");
		
		element = driver.findElement(By.name("lastName"));
		
		element.sendKeys("vardhan");
		
		String path = "/html/body/div[1]/div[1]/div[2]/div/c-wiz/div[2]/div[2]/div/div[2]/div/div/div/div/button/span";
		
		element = driver.findElement(By.xpath(path));
		
		element.click();
		 
		 
		 element = driver.findElement(By.name("day"));
		 element.sendKeys("3");
		 
//		 try {
//			 Thread.sleep(2000);
//		 }catch(InterruptedException e) {
//			 
//		 }
//		 element = driver.findElement(By.id("month"));
//		 Select select = new Select(element);
//		 
//		 select.selectByValue("4");
//		 
//		 element = driver.findElement(By.name("year"));
//		 element.sendKeys("34");
//		 
		 try {
			 Thread.sleep(5000);
		 }catch(InterruptedException e) {
			 
		 }
		 
		 
		driver.close();
	}
}
