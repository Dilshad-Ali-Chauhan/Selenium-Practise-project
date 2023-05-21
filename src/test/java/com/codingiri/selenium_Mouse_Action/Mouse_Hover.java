package com.codingiri.selenium_Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		
		//in Selenium whenever we want to automate any action with mouse we need to use a class that is called as action class
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		Actions action = new Actions(driver);
		WebElement login = driver.findElement(By.linkText("Login"));
		action.moveToElement(login).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='Wishlist']")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		driver.quit();
		
}
}
