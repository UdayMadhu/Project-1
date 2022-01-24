package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	
	WebElement name = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
	name.sendKeys("UDAY");
	
	WebElement id = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
	id.sendKeys("+12345");


}
}
