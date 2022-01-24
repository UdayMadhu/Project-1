package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question10 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\UDAY MADHU\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	
	WebElement name = driver.findElement(By.id("username"));
	name.sendKeys("Karthi123");
	
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("123456");
}
}
