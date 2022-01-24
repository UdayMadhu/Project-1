package org.day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		WebElement btnBox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		btnBox.click();
		
		WebElement btnPrompt = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		btnPrompt.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Happy New Year 2022");
		alert.accept();
		WebElement txtPrint = driver.findElement(By.xpath("//p[text()='Hello Happy New Year 2022 How are you today']"));
		String print = txtPrint.getText();
		
		System.out.println(print);
		
		
	}

}
