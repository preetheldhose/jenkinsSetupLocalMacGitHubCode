package com.test.selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/preetheldhose/Desktop/Bismallah/Work/Software/chromeDriver/128/chromedriver-mac-x64/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void f() {

		String baseUrl = "https://www.toolsqa.com/";

		System.out.println("Launching Google Chrome browser");
		// driver = new ChromeDriver();
		driver.get(baseUrl);
		String testTitle = "Tools QA";
		String originalTitle = driver.getTitle();
		System.out.println("Print the title : " + originalTitle);
		Assert.assertEquals(originalTitle, testTitle);
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
		System.out.println("Finished Test On Chrome Browser");
	}
}
