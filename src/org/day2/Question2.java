package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\UDAY MADHU\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.redbus.in/ ");
		
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("Chennai");
	
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("Coimbatore");
	
	
	
	}

}
