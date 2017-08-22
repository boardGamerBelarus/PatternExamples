package com.epam.byta.patterns.singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class TutByTest {
	
	@Test
	public void tutByTest()
	{
//		System.setProperty("webdriver.chrome.driver", "d:\\_webdriver\\chromedriver\\chromedriver.exe");
//		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//		driver = new ChromeDriver(capabilities);			
		WebDriverSingleton.getWebDriverInstance().navigate().to("http://www.tut.by");
		WebDriverSingleton.getWebDriverInstance().quit();
		//...
	}
	
}
