package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
	searchBox.sendKeys("iphone 12");
	
	WebElement searchButton = driver.findElement(By.xpath("//input[@type='submit']"));
	searchButton.click();
	
	
}
}
