package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement intQue = driver.findElement(By.id("heading20"));
	intQue.click();
	
	WebElement ctsQue = driver.findElement(By.xpath("(//a[@title='Interview Questions'])[6]"));
	ctsQue.click();
}
}
