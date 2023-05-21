package com.codingiri.selenium_Test_Synchronization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_synchronization {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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
		
		Thread.sleep(15000);    //this is static synchronization we will also use other method like implicit and explicit wait in next case 
		
		driver.findElement(By.linkText("Go to Next Page")).click(); //it shows error on this line because submit button need some time to process and driver 
                                                                     //and driver cannot wait so we need to syn element by giving some time to wait driver
	}

}
