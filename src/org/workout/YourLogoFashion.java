package org.workout;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YourLogoFashion {
		
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		
		WebElement btnSignin = driver.findElement(By.xpath("//a[@class='login']"));
		btnSignin.click();
		WebElement txtemail = driver.findElement(By.id("email_create"));
		txtemail.sendKeys("udayb.techit@gmail.com");
		
		WebElement btnCreateAccount = driver.findElement(By.id("SubmitCreate"));
		btnCreateAccount.click();
		
		Thread.sleep(5000);
		
		WebElement btnGender = driver.findElement(By.name("id_gender"));
		btnGender.click();
		
		
		WebElement txtFirstName = driver.findElement(By.id("customer_firstname"));
		txtFirstName.sendKeys("Uday");
		
		
		WebElement txtLastName = driver.findElement(By.id("customer_lastname"));
		txtLastName.sendKeys("Madhu");
		
		

		
		WebElement txtPass = driver.findElement(By.id("passwd"));
		txtPass.sendKeys("Uday1234");
		
		WebElement dDnDate = driver.findElement(By.id("days"));
		Select selectDate= new Select(dDnDate);
		selectDate.selectByIndex(9);
		
		WebElement dDnMonth = driver.findElement(By.id("months"));
		Select selectMonth = new Select(dDnMonth);
		selectMonth.selectByValue("8");
		
		WebElement dDnYear = driver.findElement(By.id("years"));
		Select selectYear = new Select(dDnYear);
		selectYear.selectByValue("1992");;
		
		
		WebElement btnClick = driver.findElement(By.id("optin"));
		btnClick.click();
		
		WebElement txtCompany = driver.findElement(By.id("company"));
		txtCompany.sendKeys("Dubai Company");
		
		WebElement txtAddress = driver.findElement(By.name("address1"));
		txtAddress.sendKeys("701 N El Camino Real");
			
		WebElement txtAddress1 = driver.findElement(By.name("address2"));
		txtAddress1.sendKeys("San Clemente");
		
		
		WebElement txtCity = driver.findElement(By.id("city"));
		txtCity.sendKeys("California");
		
		WebElement dDnState = driver.findElement(By.id("id_state"));
		Select state = new Select(dDnState);
		state.selectByIndex(5);
		
		WebElement txtPincode = driver.findElement(By.id("postcode"));
		txtPincode.sendKeys("92672");
		
		WebElement dDnCountry = driver.findElement(By.id("id_country"));
		Select country = new Select(dDnCountry);
		country.selectByIndex(1);
		
		WebElement txtOthers = driver.findElement(By.id("other"));
		txtOthers.sendKeys("Near Fashiona Bar");
		
		WebElement txtPhone = driver.findElement(By.id("phone"));
		txtPhone.sendKeys("+45987632");
		
		WebElement txtMobile = driver.findElement(By.id("phone_mobile"));
		txtMobile.sendKeys("85694752");
		
		WebElement txtFutRef = driver.findElement(By.id("alias"));
		txtFutRef.sendKeys("Califo Palusm");
		
		WebElement btnRegister = driver.findElement(By.id("submitAccount"));
		btnRegister.click();
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}

}
