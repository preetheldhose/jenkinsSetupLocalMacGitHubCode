package test.interview.execution;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class javaSelenium {
	
	public WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
	}
	
	@Test
	public void test() {
		driver.get("url");
		if(driver.getPageSource().contains("check")) {
			System.out.println("Found string");
		} else {
			System.out.println("Didn't find it");
		}
		
		WebElement tableRow = driver.findElement(By.xpath(".../table/tbody/tr[3]"));
		String thirdRow = tableRow.getText();
		
		//@tag
		
		WebElement tableColumn = driver.findElement(By.xpath(".../table/tbody/td[3]"));
		String thirdColumn = tableColumn.getText();
		
		HashMap<String, Integer> hM = new HashMap<String, Integer>();
		hM.put(thirdRow, null);
		hM.put(thirdColumn, null);
		for(Entry<String, Integer> mHS : hM.entrySet()) {
			System.out.println("Keys and values: " + mHS.getKey() + " " + mHS.getValue());
		}
			
	}
	
	@AfterTest
	public void afterTest() {
		
	}

}
