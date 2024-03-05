package fullautomation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Fullauto {
	static WebElement element;
	public static void main(String agrs[]) throws IOException {
		String path = "http://www.google.com";
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(path);
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.err.println("error");
		}
		
		element = driver.findElement(By.xpath("/html/body/app-root/app-headerlogin/div/div[2]/div/a"));
		
		element.click();
		
		element = driver.findElement(By.name("username"));
		
		element.sendKeys("admin");
		
		element = driver.findElement(By.name("password"));
	
		element.sendKeys("admin");
		
		element = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/div/form/button"));
		
		element.click();
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			System.err.println("error");
		}
		
		
		//taking screen short
		
		
		TakesScreenshot scrShot = (TakesScreenshot) driver;

		File imgTmpFile = scrShot.getScreenshotAs(OutputType.FILE);

		File destinationFile = new File("D:\\mphasispush\\javaPhase1\\phase-5\\practice-projects6\\src\\main\\java\\screenShoet\\image.png");

		Files.copy(imgTmpFile, destinationFile);
		
		
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			System.err.println("error");
		}
		
		driver.quit();
		
	}
}

