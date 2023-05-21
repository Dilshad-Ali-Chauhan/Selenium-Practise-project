package com.codingiri.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("i.hm-icon")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Arts & Crafts")).click();
		//driver.findElement(By.partialLinkText("Arts & Crafts")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Crafting")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Bostitch Office HP12")).click();
		Thread.sleep(1000);
		String title = driver.findElement(By.cssSelector("span#productTitle")).getText();
		//driver.findElement(By.cssSelector("span[id='productTitle")).getText();
		System.out.println(title);
		if(title.contains("Bostitch Office"))
		{
			
			System.out.println("pass");
		}
			else
			{
				System.out.println("fail");
			}
		driver.close();
		}
	

	

}
