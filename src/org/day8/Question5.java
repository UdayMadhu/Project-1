package org.day8;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question5 {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		WebElement btnCreate = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		btnCreate.click();
		
		
		Thread.sleep(3000);
		WebElement txtattribute = driver.findElement(By.id("month"));
		Select attribute= new Select(txtattribute);
		List<WebElement> options = attribute.getOptions();
		
		int size = options.size();
		WebElement element = options.get(size/2);
		String text = element.getText();
		System.out.println(text);
		

		
		
	}


}
