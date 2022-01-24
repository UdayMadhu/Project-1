package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("ghuire");
		String attribute = txtUserName.getAttribute("value");
		System.out.println(attribute);
		WebElement txtFacebook = driver.findElement(By.xpath("//h2[@class=\"_8eso\"]"));
		String text = txtFacebook.getText();
		System.out.println(text);

	}
}
