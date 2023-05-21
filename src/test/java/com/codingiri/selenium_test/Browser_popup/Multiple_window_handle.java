package com.codingiri.selenium_test.Browser_popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_window_handle {

	public static void main(String[] args) throws InterruptedException {
		
		//Multiple_tabs();
		Close_tabs();
	}
	
	static void Multiple_tabs() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/multiple-browser-windows/");
		Thread.sleep(2000);
		driver.findElement(By.id("u_7_8")).click();
		
		Set<String> windows = driver.getWindowHandles();
		for(String window : windows) {
			
			System.out.println(window);
			driver.switchTo().window(window);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			System.out.println("..................");
			Thread.sleep(2000);
			if(driver.getCurrentUrl().equals("https://twitter.com/")) {
				break;
			}
		}
		
		driver.findElement(By.cssSelector("div.css-901oao.r-1awozwy.r-13gxpu9.r-6koalj.r-18u37iz.r-16y2uox.r-1qd0xha.r-a023e6.r-b88u0q.r-1777fci.r-rjixqe.r-bcqeeo.r-q4m81j.r-qvutc0")).click();
		
		System.out.println("Switch to Twitter ");
		 Thread.sleep(2000);
		 driver.quit();
		 

	}
	
	static void Close_tabs() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/multiple-browser-windows/");
		Thread.sleep(2000);
		
        driver.findElement(By.id("u_7_8")).click();
        Thread.sleep(2000);
        String parentWindow = driver.getWindowHandle();
		
		Set<String> windows = driver.getWindowHandles();
		for(String window : windows) {
			if(!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				driver.close();
				Thread.sleep(2000);
				
			}
		}
		driver.switchTo().window(parentWindow);
	}

}
