package com.codingiri.selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_navigation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
         System.out.println(driver.getTitle());
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(1000);
		   System.out.println(driver.getTitle());
		   driver.navigate().back();
		   System.out.println(driver.getTitle());
		   Thread.sleep(1000);
		   driver.navigate().forward();
		   System.out.println(driver.getTitle());
		   Thread.sleep(1000);
		   driver.navigate().refresh();
		
		

	}

}
