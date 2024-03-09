package externalelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

    public static void main(String[] args) {
       

      
        WebDriver driver = new ChromeDriver();

        // Open Gmail login page
        driver.get("https://accounts.google.com");



        // Locate and interact with the email input field
        WebElement emailInput = driver.findElement(By.id("identifierId"));
        emailInput.sendKeys("sunnyharsha32@gmail.com");
        
        try {
        	Thread.sleep(5000);
        }catch(InterruptedException e) {
        	
        }

        // Click the "Next" button to proceed to the password page
        WebElement nextButton = driver.findElement(By.id("identifierNext"));
        nextButton.click();
        try {
        	Thread.sleep(10000);
        }catch(InterruptedException e) {
        	
        }

        // Wait for the password input field to be visible (you may need to adjust the wait time)
        WebElement passwordInput = driver.findElement(By.cssSelector("input[@name='password']"));

        // Enter your password
        passwordInput.sendKeys("K.harsha@2000");
        try {
        	Thread.sleep(5000);
        }catch(InterruptedException e) {
        	
        }

        // Click the "Next" button to log in
        WebElement passwordNextButton = driver.findElement(By.id("passwordNext"));
        passwordNextButton.click();

        // Perform any additional actions as needed after logging in

        // Switch back to the default content
        driver.switchTo().defaultContent();
        
        try {
        	Thread.sleep(10000);
        }catch(InterruptedException e) {
        	
        }

        // Close the browser
        driver.quit();
    }
}

