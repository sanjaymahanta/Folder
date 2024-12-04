package com.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Mousehover {

	
	WebDriver driver;
	
	@BeforeClass
public void setUp() {
	System.setProperty("webdriver.gecko.driver", "D:/geckodriver133.exe");
	driver = new FirefoxDriver();
	
}

	@Test
	public void mAction() throws InterruptedException {
		driver.get("https://parivahan.gov.in/parivahan//en/content/driving-licence-0");
		
	
		Actions action = new Actions(driver);
		WebElement element1 = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		WebElement element2 = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
		
		action.moveToElement(element1).perform();
		Thread.sleep(3000);
		action.moveToElement(element2).perform();
	}

}
