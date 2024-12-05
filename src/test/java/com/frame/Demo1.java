package com.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo1 {

	WebDriver driver;

	@BeforeClass
	public void setup() {

		System.setProperty("webdriver.gecko.driver", "D:/geckodriver133.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void testFrameYoutube() {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='gb_A']")).click();

		WebElement element = driver.findElement(By.name("app"));
		driver.switchTo().frame(element);

		driver.findElement(By.xpath("//span[text()='YouTube']")).click();

	}

}
