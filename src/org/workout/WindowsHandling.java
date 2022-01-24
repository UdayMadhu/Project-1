package org.workout;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowsHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearch.sendKeys("OnePlus9", Keys.ENTER);
		
	/*	WebElement clkPhone = driver.findElement(By.xpath("//span[text()='OnePlus 9 5G (Astral Black, 12GB RAM, 256GB Storage)']"));
		clkPhone.click();
		
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
		for (String childId : allId) {
			
			if (!parentId.equals(childId)) {
				
				driver.switchTo().window(childId);
				
			}
			
		}
		
		WebElement clkWhishList = driver.findElement(By.name("submit.add-to-registry.wishlist.unrecognized"));
		clkWhishList.click();
		
	
		
		driver.switchTo().window(parentId); */
		
		
		WebElement clkPhone2 = driver.findElement(By.xpath("//span[text()='OnePlus 9 Pro 5G (Morning Mist, 12GB RAM, 256GB Storage)']"));
		clkPhone2.click();
		
		
		driver.switchTo().window("https://www.amazon.in/Test-Exclusive_2020_1167-Multi-3GB-Storage/dp/B089MV3MVY/ref=sr_1_10?crid=38A5GYX3H8ZJZ&keywords=oneplus+9&qid=1641209532&sprefix=oneplus+9%2Caps%2C392&sr=8-10");
			
		WebElement clkBuyBtn = driver.findElement(By.id("buy-now-button"));
		clkBuyBtn.click();
		
		
	}

}




