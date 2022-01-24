package org.day8;

import java.awt.AWTException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question10 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		WebElement btnCreate = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		btnCreate.click();
		
		
		Thread.sleep(3000);
		WebElement txtattribute = driver.findElement(By.id("year"));
		Select attribute= new Select(txtattribute);
		List<WebElement> options = attribute.getOptions();
		int size = options.size();
		System.out.println("--------List-------");
		for (WebElement element : options) {
			
			String text = element.getText();
			System.out.println(text);		
		}
		Set<WebElement> S = new LinkedHashSet<>();
		S.addAll(options);
		int size2 = S.size();
		System.out.println("---------Set----------");
		for (WebElement element2 : S) {
			String text2 = element2.getText();
			System.out.println(text2);
			
		}
		
	}
}
