package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question7 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.cleartrip.com/trains");
	
	WebElement from = driver.findElement(By.id("from_station"));
	from.sendKeys("Chennai");
	
	WebElement to = driver.findElement(By.id("to_station"));
	to.sendKeys("Coimbatore");	
	
	WebElement btnSearch = driver.findElement(By.id("trainFormButton"));
	btnSearch.click();
}
}
