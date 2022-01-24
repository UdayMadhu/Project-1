package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question3 {
/**
 * @param args
 * @throws InterruptedException
 */
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement txtFirstName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	txtFirstName.sendKeys("Joseph");
	WebElement txtLastName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	txtLastName.sendKeys("Vijay");
	
	WebElement txtAddress = driver.findElement(By.xpath("//textarea[@rows='3']"));
	txtAddress.sendKeys("Tnagar,Chennai,600017");
	
	WebElement txtEmail = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
	txtEmail.sendKeys("VijayJoseph@gamil.com");
	
	WebElement phoneNumber = driver.findElement(By.xpath("//input[@type='tel']"));
	phoneNumber.sendKeys("9003718254");
	
	WebElement btnGender = driver.findElement(By.name("radiooptions"));
	btnGender.click();
	
	WebElement hobbies = driver.findElement(By.id("checkbox2"));
	hobbies.click();
	
	WebElement txtLan = driver.findElement(By.id("msdd"));
	
	Thread.sleep(5000);
	txtLan.click();
	WebElement btnEnglish = driver.findElement(By.xpath("//a[text()='English']"));
	btnEnglish.click();
	
	WebElement btnMalay = driver.findElement(By.xpath("//a[text()='Malay']"));
	btnMalay.click();
	
	WebElement btnDanish = driver.findElement(By.xpath("//a[text()='Danish']"));
	btnDanish.click();
	
	Select dDnSkills = new Select(driver.findElement(By.id("Skills")));
	dDnSkills.selectByVisibleText("Adobe Photoshop");
	
	Select dDncountry = new Select(driver.findElement(By.id("country")));
	dDncountry.selectByIndex(10);
	
	Select drpYear = new Select(driver.findElement(By.id("yearbox")));
	drpYear.selectByValue("2011");
	
	Select drpMonth = new Select(driver.findElement(By.xpath("(//select[@type='text'])[4]")));
	drpMonth.selectByVisibleText("June");
	
	Select drpDay = new Select(driver.findElement(By.xpath("(//select[@type='text'])[5]")));
	drpDay.selectByValue("20");

	WebElement txtPass1 = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
	txtPass1.sendKeys("123456");
	
	WebElement txtPass2 = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	txtPass2.sendKeys("123456");

	WebElement btnSubmit = driver.findElement(By.id("submitbtn"));
	Thread.sleep(2000);
	btnSubmit.click();



}
}
