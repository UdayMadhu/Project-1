package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question14 {
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.swiggy.com/");
	
	WebElement login = driver.findElement(By.xpath("//a[@class='r2iyh']"));
	login.click();
	
	WebElement txtNumber = driver.findElement(By.id("mobile"));
	txtNumber.sendKeys("9003718254");
	
	WebElement txtName = driver.findElement(By.id("name"));
	txtName.sendKeys("George");
	
	WebElement txtemail = driver.findElement(By.id("email"));
	txtemail.sendKeys("udaycutebaby@gmail.com");
	
	WebElement txtpass = driver.findElement(By.xpath("//input[@id='password']"));
	txtpass.sendKeys("123456");
	
	WebElement btncon = driver.findElement(By.xpath("//a[@class='a-ayg']"));
	btncon.click();
}
}
