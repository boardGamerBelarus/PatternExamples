package com.epam.byta.patterns.factorymethod;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class TutByTest {

	@Test
	public void test1() {
		
		WebDriverCreator creator = new ChromeDriverCreator();		
				
		WebDriver driver = creator.FactoryMethod();
		driver.navigate().to("http://www.tut.by/");
		driver.quit();
	}

}