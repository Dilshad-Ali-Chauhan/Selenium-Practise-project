package com.codingiri.selenium_test.Browser_popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_vs_Quit {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/multiple-browser-windows/");
		Thread.sleep(2000);
		
        driver.findElement(By.id("u_7_8")).click();
        Thread.sleep(2000);
        
        //driver.close();   //it close only the current window like if multiple tabs are open it only close the parent tab and all other tabs are remains open.
        
        driver.quit();    //it close all the windows including parent window tab.
	}                     //driver.quit() its destroy the instance of the web driver and all the window that are associated with that driver they also get destroyed.

}
