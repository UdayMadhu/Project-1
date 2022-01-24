package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	String title = driver.getTitle();
	System.out.println(title);
	
	String cUrl = driver.getCurrentUrl();
	System.out.println(cUrl);
	
	WebElement txtAda = driver.findElement(By.xpath("//p[text()='Adactin Launches The Adactin Hotel App! ']"));
	String data = txtAda.getText();
	System.out.println(data);
	
	WebElement txtAda1 = driver.findElement(By.xpath("//p[contains(text(),'Adactin')]"));
	String data1 = txtAda1.getText();
	System.out.println(data1);
	
	WebElement txtAda2 = driver.findElement(By.xpath("//p[contains(@style,'text-align')]"));
    String data2 = txtAda2.getText();
    System.out.println(data2);
    
    

}
}
