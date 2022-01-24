package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question2 {
public static void main(String[] args) throws InterruptedException   {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.t-mobile.com/?src=spr&rdpage=%2F");
	
	Thread.sleep(5000);
	WebElement btnClose = driver.findElement(By.id("tntButtonToClose"));
	btnClose.click();
	
	WebElement btnPhones = driver.findElement(By.id("nav-link-contaniner-1"));
	Actions actions= new Actions(driver);
	actions.moveToElement(btnPhones).perform();
	
	WebElement btn5g = driver.findElement(By.xpath("//span[text()='5G phones']"));
	btn5g.click();
	
	WebElement txtPrint = driver.findElement(By.xpath("//a[text()=' Do Not Sell My Personal Information']"));
	String text = txtPrint.getText();
	System.out.println(text);
	
	
	
	
}
}
