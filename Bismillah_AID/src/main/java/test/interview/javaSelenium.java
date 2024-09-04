package test.interview;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class javaSelenium {
	
	public WebDriver driver;

	@BeforeTest
	public void beforeTestSetup() {
		System.out.println("Before Test");
		System.setProperty("webdriver.chrome.driver", "/Users/preetheldhose/Desktop/Bismallah/Work/Software/chromeDriver/85/chromedriver");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
		
		
	}
	
	public void actualTest() throws InterruptedException {
		System.out.println("Actual test");
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		WebElement nCollect = driver.findElement(By.name("q"));
		Thread.sleep(3000);
		nCollect.sendKeys("Selenium Java");
		Thread.sleep(3000);
		WebDriverWait waitU = new WebDriverWait(driver, Duration.ofSeconds(30));
		waitU.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));

	}
	
	public void demoSwitchToAlert () throws InterruptedException {
		Thread.sleep(3000);
		driver.get("https://blog.testproject.io/");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

	}
	
	@Test
	public void testYahooPageSource() throws InterruptedException {
		Thread.sleep(3000);
		driver.get("https://www.yahoo.com");
		Thread.sleep(3000);
		if(driver.getPageSource().contains("yahoo")) {
			System.out.println("Found the match");
		} else {
			System.out.println("Didn't find the match");
		}

	}
	
	
	@AfterTest
	public void afterTestTearDown() throws InterruptedException {
		System.out.println("After test");
//		Thread.sleep(3000);
//		driver.close();
		Thread.sleep(3000);
		driver.quit();
	}
	
	public void checkEleLoaded(WebDriver ndriver, String passedXpath) {
		driver = ndriver;
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passedXpath)));
	}
	
	public void checkEleWname(String passedName) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(passedName)));
	}
	
}
