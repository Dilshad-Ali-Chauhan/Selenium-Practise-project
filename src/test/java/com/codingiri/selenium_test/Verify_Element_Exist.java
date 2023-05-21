package com.codingiri.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_Exist {

	public static void main(String[] args) throws InterruptedException {
		
		//this is an alternative of isDisplayed as it is not so effective
		//if isDIsplayed is not able to locate element it shows error rather than showing true or false

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
	
		try {
			driver.findElement(By.xpath("//a[contains(text(),'नया अकाउंट बनाएँ')]"));
			System.out.println("True:Case 1 Element is present");
			
		}
		catch(Exception e) {
			System.out.println("False:Case 1 Element is not present");
		}
		
		try {
			driver.findElement(By.id("jhfjvhfhu"));  //taking wrong id 
			System.out.println("True:Case 2 Element is present");
		}
		  catch(Exception e){
			  System.out.println("False:Case 2 Element is not present");
		  }
       driver.quit();
	}

}
