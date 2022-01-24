package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question10 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	WebElement txtBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	txtBox.click();
	
	WebElement txtSearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	txtSearch.sendKeys("Iphone 12 covers");
	
	WebElement btnSearch = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	btnSearch.click();
	
}
}
