package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	
	driver.manage().window().maximize();
	
	WebElement source = driver.findElement(By.id("credit2"));
	WebElement target = driver.findElement(By.id("bank"));
	
	Actions actions= new Actions(driver);
	actions.dragAndDrop(source, target).perform();
	
	WebElement source1 = driver.findElement(By.id("fourth"));
	WebElement target1 = driver.findElement(By.id("amt7"));
	actions.dragAndDrop(source1, target1).perform();
	
	WebElement source3 = driver.findElement(By.id("credit1"));
	WebElement target3 = driver.findElement(By.id("loan"));
	actions.dragAndDrop(source3, target3).perform();
	
	WebElement source4 = driver.findElement(By.id("fourth"));
	WebElement target4 = driver.findElement(By.id("amt8"));
	actions.dragAndDrop(source4, target4).perform();
	
	WebElement txtPerfect = driver.findElement(By.id("equal"));
	String print = txtPerfect.getText();
	System.out.println(print);
	
	
}
}
