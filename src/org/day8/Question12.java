package org.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question12 {
public static void main(String[] args) throws InterruptedException  {
	
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com/SearchHotel.php");
	driver.manage().window().maximize();
	
	WebElement txtUser = driver.findElement(By.name("username"));
	txtUser.sendKeys("udaymadhu");
	
	
	
	WebElement txtPass = driver.findElement(By.name("password"));
	txtPass.sendKeys("UdayMadhu@123");
	
	WebElement btnLogin = driver.findElement(By.name("login"));
	btnLogin.click();
	
	WebElement dDnLoca = driver.findElement(By.name("location"));
	Select A = new Select(dDnLoca);
	A.selectByVisibleText("London");
	
	WebElement dDnHotel = driver.findElement(By.name("hotels"));
	Select B = new Select(dDnHotel);
	B.selectByVisibleText("Hotel Sunshine");
	
	
	WebElement dDnRoom = driver.findElement(By.id("room_type"));
	Select C = new Select(dDnRoom);
	C.selectByIndex(2);
	
	WebElement dDnNoRoom = driver.findElement(By.id("room_nos"));
	Select D = new Select(dDnNoRoom);
	D.selectByIndex(3);
	
	WebElement dDnChIn = driver.findElement(By.name("datepick_in"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].setAttribute('value','01/01/2022')",dDnChIn);
	
	WebElement dDnChOut = driver.findElement(By.name("datepick_out"));
	executor.executeScript("arguments[0].setAttribute('value','02/01/2022')",dDnChOut);
	
	WebElement dDnNoAdu = driver.findElement(By.name("adult_room"));
	Select E = new Select(dDnNoAdu);
	E.selectByVisibleText("2 - Two");
	
	WebElement dDnNoChi = driver.findElement(By.id("child_room"));
	Select F = new Select(dDnNoChi);
	F.selectByVisibleText("1 - One");
	
	WebElement btnSubmit = driver.findElement(By.name("Submit"));
	btnSubmit.click();
	
	WebElement btnSele = driver.findElement(By.name("radiobutton_0"));
	btnSele.click();
	
	WebElement btnCon = driver.findElement(By.name("continue"));
	btnCon.click();
	
	WebElement txtFirst = driver.findElement(By.name("first_name"));
	txtFirst.sendKeys("Uday");
	
	WebElement txtLast = driver.findElement(By.name("last_name"));
	txtLast.sendKeys("Madhu");
	
	WebElement txtAdd = driver.findElement(By.id("address"));
	txtAdd.sendKeys("Chennai- 600018");
	
	WebElement credit = driver.findElement(By.id("cc_num"));
	credit.sendKeys("9876 2569 2365 5784");
	
	WebElement cardType = driver.findElement(By.id("cc_type"));
	Select G = new Select(cardType);
	G.selectByValue("VISA");
	
	WebElement month = driver.findElement(By.id("cc_exp_month"));
	Select H = new Select(month);
	H.selectByValue("1");
	
	WebElement year = driver.findElement(By.id("cc_exp_year"));
	Select I = new Select(year);
	I.selectByVisibleText("2022");
	
	WebElement cvv  = driver.findElement(By.id("cc_cvv"));
	cvv.sendKeys("5698");
	
	WebElement btnBook = driver.findElement(By.name("book_now"));
	btnBook.click();
	
	Thread.sleep(7000);
	WebElement ordNo = driver.findElement(By.id("order_no"));
	String text = ordNo.getAttribute("Value");
	System.out.println(text);
	
	
	
	
	






}
}
