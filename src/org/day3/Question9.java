package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question9 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	
	
	//WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
	//login.click();
	
	Thread.sleep(5000);
	
	WebElement email = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
	email.sendKeys("8122756607");
	
	WebElement txtpass = driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
	txtpass.sendKeys("UdayMadhu@123");
	
	WebElement btnLogin = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	btnLogin.click();
	
}
}
