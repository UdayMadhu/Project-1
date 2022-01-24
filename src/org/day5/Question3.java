package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	WebElement loginClose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	loginClose.click();
	
	WebElement btnFashion = driver.findElement(By.xpath("//div[@class='eFQ30H'][4]"));
	Actions actions= new Actions(driver);
	actions.moveToElement(btnFashion).perform();
	
	WebElement btnMens = driver.findElement(By.xpath("//a[text()='Men Footwear']"));
	actions.moveToElement(btnMens).perform();
	
	WebElement btnAll = driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[1]"));
	btnAll.click();


}
}
