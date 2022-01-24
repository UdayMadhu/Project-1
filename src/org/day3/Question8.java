package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question8 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement modelResume = driver.findElement(By.id("heading201"));
	modelResume.click();
	
	WebElement modelResume1 = driver.findElement(By.xpath("(//a[@title='Model Resume training in chennai'])[1]"));
	modelResume1.click();

}
}
