package com.epam.byta.patterns.factorymethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeDriverCreator extends WebDriverCreator {
	@Override
	public WebDriver FactoryMethod() {
		ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(
				new File("d:\\_webdriver\\chromedriver\\chromedriver.exe")).build();
		try {
			service.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver = new ChromeDriver(service);
		return driver;
	}
}
