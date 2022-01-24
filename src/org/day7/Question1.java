package org.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txtName = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement txtPass = driver.findElement(By.id("pass"));
		WebElement btnLogin = driver.findElement(By.xpath("//button[@name='login']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].setAttribute('value','udaym')",txtName);
		executor.executeScript("arguments[0].setAttribute('value','uda@123')", txtPass);
		Object userName = executor.executeScript("return arguments[0].getAttribute('value')", txtName);
		System.out.println(userName);
		Object userPass = executor.executeScript("return arguments[0].getAttribute('value')", txtPass);
		System.out.println(userPass);
		executor.executeScript("arguments[0].click()", btnLogin);
		
		
		
		
		
		
		
		
		
	}

}
