package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question2 {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver",
			"C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	
	WebElement txtUserName = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
	txtUserName.sendKeys("KalaKilla");
	
	WebElement txtPassword = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
	txtPassword.sendKeys("123@456");
	
	WebElement btnLogin = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
	btnLogin.click();
	
}
}
