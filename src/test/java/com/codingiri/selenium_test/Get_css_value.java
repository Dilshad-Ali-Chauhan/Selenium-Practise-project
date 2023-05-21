package com.codingiri.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_css_value {

	public static void main(String[] args) throws InterruptedException {
		//Get_css_value();
		Element_visible_enabled();
	}
	 static void Get_css_value() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		String color = driver.findElement(By.xpath("//a[contains(text(),'नया अकाउंट बनाएँ')]")).getCssValue("color");
		String bgcolor = driver.findElement(By.xpath("//a[contains(text(),'नया अकाउंट बनाएँ')]")).getCssValue("background-color"); 
		String font = driver.findElement(By.xpath("//a[contains(text(),'नया अकाउंट बनाएँ')]")).getCssValue("font"); 
		String font_size = driver.findElement(By.xpath("//a[contains(text(),'नया अकाउंट बनाएँ')]")).getCssValue("font-size"); 
		String font_family = driver.findElement(By.xpath("//a[contains(text(),'नया अकाउंट बनाएँ')]")).getCssValue("font-family"); 
		String height = driver.findElement(By.xpath("//a[contains(text(),'नया अकाउंट बनाएँ')]")).getCssValue("height"); 
		String width = driver.findElement(By.xpath("//a[contains(text(),'नया अकाउंट बनाएँ')]")).getCssValue("width"); 
		
		
		System.out.println("color:" + color);
        System.out.println("background-color:" + bgcolor);
        System.out.println("font:" + font);
		System.out.println("font_size:" + font_size);
        System.out.println("font_family:" + font_family);
        System.out.println("height:" + height);
        System.out.println("width:" + width);
        driver.quit();
	 }
	 
	 static void Element_visible_enabled() throws InterruptedException {
		 
		 //isDisplayed is used to identify whether a button ,text_field is visible or not
		 //isEnabled is used whether a button or text_field is click_able or not or its working or not

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			Thread.sleep(2000);
			boolean isDisplayed = driver.findElement(By.xpath("//a[contains(text(),'नया अकाउंट बनाएँ')]")).isDisplayed();
			boolean isEnabled = driver.findElement(By.xpath("//a[contains(text(),'नया अकाउंट बनाएँ')]")).isEnabled();
			
			System.out.println(isDisplayed);
			System.out.println(isEnabled);
			driver.quit();
	 }
       
	}


