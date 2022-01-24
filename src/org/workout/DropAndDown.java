package org.workout;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropAndDown {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		
		WebElement selectSingle = driver.findElement(By.id("select-demo"));
		Select A = new Select(selectSingle);
		A.selectByIndex(3);
		List<WebElement> options = A.getOptions();
		WebElement element = options.get(3);
		String data = element.getText();
		System.out.println("-------Print Select Value-------");
		System.out.println(data);
		System.out.println("-----Print All the Value in the Option-------");
		for (WebElement x : options) {
			String text = x.getText();
			System.out.println(text);
		}
		
		WebElement multiSelect = driver.findElement(By.id("multi-select"));
		Select  B = new Select(multiSelect);
		B.selectByValue("New York");
		B.selectByIndex(2);
		B.selectByVisibleText("Pennsylvania");
		System.out.println("---------Print the Selected Value---------");
		List<WebElement> selectedOptions = B.getAllSelectedOptions();
		for (WebElement x : selectedOptions) {
			String text = x.getText();
			System.out.println(text);
		}
		
		for (WebElement z : selectedOptions) {
			String text1 = z.getText();
			B.deselectByValue(text1);
		}
		
		
		
		List<WebElement> options2 = B.getOptions();
		for (WebElement y : options2) {
			String text2 = y.getText();
			B.selectByVisibleText(text2);
			
		}
		System.out.println("----------print the Selected Values-------------");
		List<WebElement> SelectedOptions2 = B.getAllSelectedOptions();
		for (WebElement w : SelectedOptions2) {
			String text3 = w.getText();
			System.out.println(text3);
			
		}
		
		B.deselectAll();
			
		}
		
		
	}


