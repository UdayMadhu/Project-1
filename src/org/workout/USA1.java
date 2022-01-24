package org.workout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class USA1 {
	static WebDriver driver;
	public static class Chrome {
		private void chrom() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Selenium\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			Step S = new Step();
			S.test();
		}
	}
	public static class Firefox {
		private void fox() {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Selenium\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			Step S = new Step();
			S.test();
		}
	}
	public static class Edge {
		private void edge() {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\UDAY MADHU\\eclipse-workspace\\Selenium\\Selenium\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			Step S = new Step();
			S.test();
		}
	}
	public static class Step {
		private void test() {
			driver.get("https://www.google.co.in/");
			WebElement txtSearch = driver.findElement(By.name("q"));
			txtSearch.sendKeys("Uday");
			txtSearch.click();
		}
	}
	public static void main(String[] args) {
		Chrome ch = new Chrome();
		ch.chrom();
		Firefox f = new Firefox();
		f.fox();
		Edge e = new Edge();
		e.edge();

	}

}
