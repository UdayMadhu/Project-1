package org.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\UDAY MADHU\\eclipse-workspace\\SeleniumChrome\\Driver\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("http://gmail.com/");
	
	String title = driver.getTitle();
	System.out.println(title);
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	}

}
