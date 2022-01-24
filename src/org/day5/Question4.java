package org.day5;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	driver.manage().window().maximize();
	
	Robot robot= new Robot();
	
	for (int i = 1; i <=3; i++) {
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}
	robot.keyPress(KeyEvent.VK_SHIFT);
	robot.keyPress(KeyEvent.VK_R);
	robot.keyRelease(KeyEvent.VK_R);
	robot.keyRelease(KeyEvent.VK_SHIFT);
	robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);
	robot.keyPress(KeyEvent.VK_M);
	robot.keyRelease(KeyEvent.VK_M);
	robot.keyPress(KeyEvent.VK_1);
	robot.keyRelease(KeyEvent.VK_1);
	robot.keyPress(KeyEvent.VK_2);
	robot.keyRelease(KeyEvent.VK_2);
	robot.keyPress(KeyEvent.VK_3);
	robot.keyRelease(KeyEvent.VK_3);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_R);
	robot.keyRelease(KeyEvent.VK_R);
	robot.keyPress(KeyEvent.VK_SHIFT);
	robot.keyPress(KeyEvent.VK_2);
	robot.keyRelease(KeyEvent.VK_2);
	robot.keyRelease(KeyEvent.VK_SHIFT);
	robot.keyPress(KeyEvent.VK_1);
	robot.keyRelease(KeyEvent.VK_1);
	robot.keyPress(KeyEvent.VK_2);
	robot.keyRelease(KeyEvent.VK_2);
	robot.keyPress(KeyEvent.VK_3);
	robot.keyRelease(KeyEvent.VK_3);
	robot.keyPress(KeyEvent.VK_4);
	robot.keyRelease(KeyEvent.VK_4);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);

}
}
