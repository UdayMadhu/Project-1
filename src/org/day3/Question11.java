package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question11 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	
	WebElement txtFname = driver.findElement(By.id("firstName"));
	txtFname.sendKeys("Geroge");

	WebElement txtLname = driver.findElement(By.id("lastName"));
	txtLname.sendKeys("Victoria");
	
	WebElement txtUname = driver.findElement(By.xpath("//input[@id='username']"));
	txtUname.sendKeys("gervic1234");
	
	WebElement txtPass = driver.findElement(By.xpath("//input[@name='Passwd']"));
	txtPass.sendKeys("12345");
	
	WebElement txtCPass = driver.findElement(By.xpath("//input[@name='confirmPasswd']"));
	txtCPass.sendKeys("12345");
	
	WebElement btnSPass = driver.findElement(By.xpath("//input[@type='checkbox']"));
	btnSPass.click();
	
	WebElement btnNext = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]@"));
	btnNext.click();
}
}
