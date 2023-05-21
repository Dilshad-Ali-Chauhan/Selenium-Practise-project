package com.codingiri.selenium_test.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_iframe {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/nested-iframes-example/");
		Thread.sleep(2000);
		
		driver.switchTo().frame("demo_parent_iframe");
		driver.switchTo().frame("demo_frame1");
	    driver.findElement(By.id("u_5_6")).click();
	    
	    Thread.sleep(2000);
	    driver.switchTo().parentFrame();
	    driver.findElement(By.id("u_5_5")).click();
	 
	    driver.switchTo().defaultContent();

	}

}
