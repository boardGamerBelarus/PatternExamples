package com.epam.byta.patterns.decorator.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class WebDriverDecoratorExample {

	private WebDriver driver;
	
	@Test
	public void testCustomDriver() throws InterruptedException
	{		
		System.setProperty("webdriver.chrome.driver", "d:\\_webdriver\\chromedriver\\chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		driver = new ChromeDriver(capabilities);		
		driver = new CustomDriverDecorator(driver);		
		driver.navigate().to("http://google.com");
		driver.findElement(By.xpath("//input[@name='btnI']")).click();
		Thread.sleep(1000);
		driver.quit();
	}
}
