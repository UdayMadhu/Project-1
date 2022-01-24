package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	String title = driver.getTitle();
	System.out.println(title);
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	WebElement txtCon = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
	String A = txtCon.getText();
	System.out.println(A);
	
	WebElement txtCon1 = driver.findElement(By.xpath("//a[contains(text(),'Conditions')]"));
	String A1 = txtCon1.getText();
	System.out.println(A1);
	
	WebElement txtCon2 = driver.findElement(By.xpath("(//a[contains(@class,'nav')])[105]"));
	String A2 = txtCon2.getText();
	System.out.println(A2);
	
	WebElement txtget = driver.findElement(By.xpath("//div[contains(@id,'navbar')]"));
	String data = txtget.getText();
	System.out.println(data);

}
}
