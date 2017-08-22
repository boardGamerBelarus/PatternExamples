package com.epam.byta.patterns.strategy;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PaymentMethodTest {

	private PaymentContext paymentContext = new PaymentContext();

	public static final String TEXT_TO_CHECK = "Your payment was successfully completed!";

	@BeforeMethod
	public void before() {
		WebDriverInstance.getInstance().navigate().to("http://someserver/shop/");				
	}

	@Test
	public void testPayWithVisa() {
		assertPay(new VisaPayment("Uladzimir Zviartouski", "9999-5555-2222-7777", "10/12/2015", "345"));
	}

	@Test
	public void testPayWithInternetMoney() {
		assertPay(new InternetMoneyPayment("98309680938", "Fghfk45HTfe"));
	}

	@Test
	public void testPayWithMobileMoney() {
		assertPay(new MobileMoneyPayment("velcom", "+375-44-5555555", "FT45"));
	}

	private void assertPay(PaymentStrategy paymentStrategy) {
		paymentContext.setPaymentStrategy(paymentStrategy);
		paymentContext.pay();
		Assert.assertFalse(WebDriverInstance.getInstance()
				.findElements(By.xpath(String.format("//*[text()='%s']", TEXT_TO_CHECK))).isEmpty());
	}
}