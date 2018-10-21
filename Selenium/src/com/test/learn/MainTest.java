package com.test.learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abhishek\\Documents\\GitHub\\Selenium\\Selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// MainTest mt = new MainTest();
		InputText it = new InputText();
		it.InputTextBox(driver);
		System.out.println("Hello World");
	}

}
