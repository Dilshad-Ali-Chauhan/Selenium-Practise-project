package com.codingiri.selenium_test.Browser_popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Strings;

public class Switch_Browser_tab {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Data Policy")).click();
		
		String parentWindow = driver.getWindowHandle();   //it give window handle of current window tab
	

	   Set<String> windows =  driver.getWindowHandles(); //it give the window handle of all the windows
	   
	   for(String window : windows) {
		   
		   if(!window.equals(parentWindow)) {
			 driver.switchTo().window(window);  
			   
		   }
	   }
	   Thread.sleep(300);
	   driver.findElement(By.cssSelector("a._42ft._4jy0.signup_btn._4jy4._4jy2.selected._51sy")).click();
	   Thread.sleep(4000);
	   
	   driver.switchTo().window(parentWindow);
	}
	

}
