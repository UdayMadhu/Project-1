package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question13 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
	
	WebElement mobileNumber = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
	mobileNumber.sendKeys("9003718254");
	
	WebElement cont = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
	cont.click();
	
	
	
}
}
