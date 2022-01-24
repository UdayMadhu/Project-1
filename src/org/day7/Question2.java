package org.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Jallianwala_Bagh");
		driver.manage().window().maximize();
		
		WebElement txtExternal = driver.findElement(By.id("External_links"));
		JavascriptExecutor A = (JavascriptExecutor)driver;
		A.executeScript("arguments[0].scrollIntoView(true)", txtExternal );
		String data = txtExternal.getText();
		System.out.println(data);
		
		WebElement txtFirst = driver.findElement(By.id("firstHeading"));
		A.executeScript("arguments[0].scrollIntoView(false)", txtFirst);
		String data1 = txtFirst.getText();
		System.out.println(data1);
		
		
	}

}
