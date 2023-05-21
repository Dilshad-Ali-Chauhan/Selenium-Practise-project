package com.codingiri.selenium_test.Web_Element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Element_within_Web_Element {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.walmart.com");//can't overcome captcha problem
		driver.get("https://www.flipkart.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("Mens Shoes");
		//driver.findElement(By.id("global-search-submit")).click();
		driver.findElement(By.xpath("//button[@type='submit']//*[local-name()='svg']")).click();
		Thread.sleep(5000);
		
		List<WebElement> items = driver.findElements(By.cssSelector("div._1xHGtK,div._373qXS"));
		for(WebElement item : items) {
	
			String itmPz = item.findElement(By.cssSelector("div._30jeq3")).getText().trim();  //if price is range then we can use first child to take only starting price
		    String itmPz2 = itmPz.replace("₹", "").replace(" ", "").replaceAll(",", "");                                                                                   //e.g=span.price-main:first-child*
	         double itmPz3 = Double.parseDouble(itmPz2);                                                                                           //trim is used to trim unnecessary space
             if(itmPz3 <1000.00 || itmPz3 >5000.00)         //replace is used to replace ₹ to no space and space to no space
            	// if(itmPz3 >200.00)	 
             {
            		 System.out.println(itmPz3);
            	 
            	WebElement productTitle = item.findElement(By.cssSelector("a.IRpwTa")) ;
 
            	System.out.println(productTitle.getText());
            	System.out.println(productTitle.getAttribute("href"));
            	System.out.println(itmPz);
            	System.out.println("......................");
            		
            	
             }
		}
		Thread.sleep(5000);
		driver.quit();
	
	}     	
             }
