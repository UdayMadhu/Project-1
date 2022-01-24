package org.day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question6 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	WebElement signinbtn = driver.findElement(By.xpath("//div[@id='signin-block']"));
	signinbtn.click();
	
	WebElement signupbtn  = driver.findElement(By.xpath("//li[@id='signInLink']"));
	signupbtn.click();
	
	WebElement xFrame= driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
	driver.switchTo().frame(xFrame);
	WebElement mobile = driver.findElement(By.id("mobileNoInp"));
	mobile.sendKeys("8122756607");
	
	
	WebElement xFrame2 = driver.findElement(By.xpath("(//iframe[@title='reCAPTCHA'])[1]"));
	driver.switchTo().frame(xFrame2);
	WebElement clickRobot = driver.findElement(By.xpath("(//div[@class='recaptcha-checkbox-border'])[1]"));
	clickRobot.click();
	driver.switchTo().parentFrame();
	WebElement otp = driver.findElement(By.id("otp-container"));
	otp.click();
	
	
	
	
	
}
}
