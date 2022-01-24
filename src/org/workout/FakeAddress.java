package org.workout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FakeAddress {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://a.testaddressbook.com/");
		driver.manage().window().maximize();
		
		WebElement btnSignin = driver.findElement(By.id("sign-in"));
		btnSignin.click();
		
		Thread.sleep(3000);
		WebElement btnSignup = driver.findElement(By.xpath("//a[text()='Sign up']"));
		btnSignup.click();
		
		Thread.sleep(3000);
		
		WebElement txtUser = driver.findElement(By.id("user_email"));
		txtUser.sendKeys("udayb.techit@gmail.com");
				
		WebElement txtPass = driver.findElement(By.id("user_password"));
		txtPass.sendKeys("UdayMadhu@123");
				
		WebElement btnSign = driver.findElement(By.name("commit"));
		btnSign.click();
	}

}
