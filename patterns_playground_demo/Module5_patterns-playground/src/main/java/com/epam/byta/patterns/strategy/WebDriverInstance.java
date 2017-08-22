package com.epam.byta.patterns.strategy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverInstance {

	private static WebDriver instance;

	public static WebDriver getInstance() {
		if (instance == null) {
			System.setProperty("webdriver.chrome.driver", "d:\\_webdriver\\chromedriver\\chromedriver.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			instance = new ChromeDriver(capabilities);;
		}
		return instance;				
	}
}
