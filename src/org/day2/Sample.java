package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	 public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\UDAY MADHU\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/s?k=amazon+india&adgrpid=1338106518018791&hvadid=83631787970864&hvbmt=be&hvdev=c&hvlocphy=158174&hvnetw=o&hvqmt=e&hvtargid=kwd-83632285155786&hydadcr=24663_13493294&tag=mh0b-20&ref=pd_sl_5e1nkyul6t_e");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement txtusername = driver.findElement(By.id("twotabsearchtextbox"));
		txtusername.sendKeys("Green");
		
	 }

}
