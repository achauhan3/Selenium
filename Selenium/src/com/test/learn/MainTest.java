package com.test.learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {

	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abhishek\\Documents\\GitHub\\Selenium\\Selenium\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		MainTest mt = new MainTest();
		mt.launchGoogle(driver);
	}

	public void launchGoogle(WebDriver driver) {
		driver.get("www.google.com");
		// InputText it = new InputText();
		// it.InputTextBox(driver);
		System.out.println("Hello World");
		driver.close();
	}

}
