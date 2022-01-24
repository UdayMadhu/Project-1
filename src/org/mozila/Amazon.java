package org.mozila;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\UDAY MADHU\\eclipse-workspace\\SeleniumDay1\\Driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.amazon.in");
	
	String title = driver.getTitle();
	System.out.println(title);
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	}

}
