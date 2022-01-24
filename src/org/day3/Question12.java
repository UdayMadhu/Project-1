package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question12 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	
	driver.manage().window().maximize();
	
	WebElement btnSignin = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
	btnSignin.click();
	
	WebElement btnReg = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
	btnReg.click();
	
	Thread.sleep(3000);
	WebElement txtNumber = driver.findElement(By.xpath(("//input[@class='col-xs-24 clickOnceOnly']")));
	txtNumber.sendKeys("9003718254");
	
}
}
