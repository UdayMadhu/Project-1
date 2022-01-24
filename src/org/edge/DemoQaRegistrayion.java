
package org.edge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoQaRegistrayion {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", 
			"C:\\Users\\UDAY MADHU\\eclipse-workspace\\SeleniumDay1\\Driver\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	
	String title = driver.getTitle();
System.out.println(title);
String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);

}
}
