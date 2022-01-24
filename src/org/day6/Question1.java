package org.day6;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/markets/fno-market-snapshot");
		driver.manage().window().maximize();
		
		WebElement snapFo = driver.findElement(By.xpath("(//div[@class='leftD'])[2]"));
		
		File s=snapFo.getScreenshotAs(OutputType.FILE);
		System.out.println(s);
		File d= new File("C:\\Users\\UDAY MADHU\\Desktop\\Selenium\\Task\\Day6\\image1.jpeg");
		FileUtils.copyFile(s, d);
		System.out.println(d);
		
		
		
		driver.quit();
	
	
	
	
	
	}

}
