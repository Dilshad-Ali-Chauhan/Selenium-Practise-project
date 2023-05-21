package com.codingiri.selenium_Test_Synchronization;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait {

	public static void main(String[] args) throws InterruptedException {
		
		//implicit wait is used to wait until element is ready and its continuously check element upto given time and whenever element is ready it tells driver to click 
        //if we give 10 sec wait time and it find element in 5 sec its immediately tells driver to click
		//implicit wait is used when element not found exception is occur
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.dezlearn.com/test-sync-example/");
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("dilshad");
//		
//		
//		driver.findElement(By.xpath("//div[@id='content']//input[2]")).sendKeys("dilshad");
//		
		List<WebElement> formInputs = driver.findElements(By.cssSelector("div#content  form > input"));
		
		formInputs.get(0).sendKeys("FNAME");
		formInputs.get(1).sendKeys("LNAME");
		formInputs.get(2).sendKeys("Email");
		Thread.sleep(3000);
		driver.findElement(By.id("u_5_6")).click();
		
	
		
		driver.findElement(By.linkText("Go to Next Page")).click();  
                      
	}

}
