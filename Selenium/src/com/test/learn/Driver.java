package com.test.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Driver {
	public static WebDriver driver;

	// launchGoogle(driver);

	@Test
	public void launchGoogle() {
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		// InputText it = new InputText();
		// it.InputTextBox(driver);
		System.out.println("Hello World");
		String logoName = driver.findElement(By.name("btnK")).getText().toString();
		System.out.println(logoName);
		try {
			Assert.assertEquals("Google Search1", logoName);
		} catch (AssertionError ae) {
			ae.getMessage();
		}
		driver.close();
	}
}
