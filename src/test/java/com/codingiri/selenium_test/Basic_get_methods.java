package com.codingiri.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_get_methods {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		String att1 = driver.findElement(By.id("email")).getAttribute("class");
		String att2 = driver.findElement(By.id("email")).getAttribute("data-testid");
		String att3 = driver.findElement(By.id("email")).getAttribute("placeholder");
		String att4 = driver.findElement(By.id("email")).getAttribute("bddhd");      //if no attribute name is present then it show null
		
		String text = driver.findElement(By.xpath("//button[contains(text(),'लॉग इन करें')]")).getText();
		
		System.out.println(att1);
		System.out.println(att2);
		System.out.println(att3);
		System.out.println(att4);
		System.out.println(text);
		
		driver.quit();

	}

}
