package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question8 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
	
	
	Thread.sleep(3000);
	WebElement name = driver.findElement(By.name("username"));
	name.sendKeys("Madhu");
	
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("uday@12234");
}
}
