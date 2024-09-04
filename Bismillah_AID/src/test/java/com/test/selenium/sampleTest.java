package com.test.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleTest {
	
	public WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preetheldhose/Desktop/Bismallah/Work/Software/chromeDriver/128/chromedriver-mac-x64/chromedriver");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
		
	}
	
	@Test
	public void testAll() throws InterruptedException {
		//driver.get("https://iodinesoftware.com/careers-2/");
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id=\"fname\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"fname\"]")).sendKeys("Test");
		driver.close();
		
		System.out.println("New Line");
		
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
		
	}

}
