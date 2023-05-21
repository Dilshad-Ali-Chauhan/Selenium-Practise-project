package com.codingiri.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_Selected {

	public static void main(String[] args) throws InterruptedException {
		
		//verify if the radio button or checkbox is selected or not for this we use 'isSelected()'

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/sch/ebayadvsearch");
		Thread.sleep(2000);
		
		driver.manage().window().fullscreen();  //to open browser in full screen
		
		boolean cb1 =	driver.findElement(By.xpath("//input[@id='LH_FS']")).isSelected(); 
		driver.findElement(By.xpath("//input[@id='LH_FS']")).click();
		boolean cb2 =	driver.findElement(By.xpath("//input[@id='LH_FS']")).isSelected(); 
		System.out.println(cb1);
		System.out.println(cb2);
		
	    boolean rb1 = driver.findElement(By.xpath("//input[@id='LH_LocatedInRadio']")).isSelected();
		driver.findElement(By.xpath("//input[@id='LH_LocatedInRadio']")).click();
        boolean rb2 = driver.findElement(By.xpath("//input[@id='LH_LocatedInRadio']")).isSelected();
        System.out.println(rb1);
        System.out.println(rb2);
        
        driver.quit();
	}
}
