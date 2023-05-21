package com.codingiri.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElement_ById_Link_Text {

	public static void main(String[] args) throws InterruptedException  {
		
		//Testactitime();
		Testamazon();
	}
	
	static void Testactitime() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com");;

		driver.findElement(By.linkText("Try Free")).click();
		
		WebDriverWait Wait = new WebDriverWait(driver,10);
		
		Wait.until(ExpectedConditions.urlToBe("https://www.actitime.com/free-online-trial"));
		
		driver.findElement(By.id("first-name")).sendKeys("dilshd");
		
		driver.findElement(By.id("last-name")).sendKeys("ali");
		
		driver.findElement(By.id("email")).sendKeys("dilshd@gmail.com");
		
		driver.findElement(By.id("company")).sendKeys("dilshd");
		Thread.sleep(2000);
		driver.findElement(By.id("start-trial-submit")).click();
		
		
	}
	
	static void Testamazon() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		driver.findElement(By.name("field-keywords")).sendKeys("laptops");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Acer Aspire 5")).click();
		Thread.sleep(2000);
		String productTitle = driver.findElement(By.id("productTitle")).getText();
		String productPrice = driver.findElement(By.id("priceblock_ourprice")).getText();
		
		System.out.println("productTitle:" + productTitle);
		System.out.println("productPrice:" + productPrice);
		driver.close();
		
		
	}

}
