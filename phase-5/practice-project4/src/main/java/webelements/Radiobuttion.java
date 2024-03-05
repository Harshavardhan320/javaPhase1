package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttion {
	
  public static void main(String args[]) {
	  WebDriver driver = new ChromeDriver();

	    
	    driver.get("https://example.com");

	    // Locate the radio buttons using their XPath or other locators
	    WebElement radioButton1 = driver.findElement(By.xpath("//input[@type='radio' and @value='option1']"));
	    WebElement radioButton2 = driver.findElement(By.xpath("//input[@type='radio' and @value='option2']"));

	    // Select the first radio button
	    radioButton1.click();

	    // Perform assertions to verify the selected radio button
	    assert radioButton1.isSelected() : "Radio button 1 is not selected";
	    assert !radioButton2.isSelected() : "Radio button 2 should not be selected";

	    // Select the second radio button
	    radioButton2.click();

	    // Perform assertions to verify the selected radio button
	    assert !radioButton1.isSelected() : "Radio button 1 should not be selected";
	    assert radioButton2.isSelected() : "Radio button 2 is not selected";

	    // Close the browser
	    driver.quit();
	}
}
