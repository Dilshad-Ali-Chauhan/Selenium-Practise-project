package com.codingiri.selenium_test.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook_By_xpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("English (UK)")).click();
		driver.findElement(By.linkText("Create New Account")).click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("dilshad");
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("ali");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("dilshad@gmail.com");
	    driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("dilshad@123");
	    driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("dilshad@123");
	     Select day = new Select(driver.findElement(By.id("day")));
	     day.selectByVisibleText("20");
	     Select month = new Select(driver.findElement(By.id("month")));
	     month.selectByVisibleText("Aug");
	
	     Select year = new Select(driver.findElement(By.id("year")));
	     year.selectByVisibleText("1996");
	     
	     driver.findElement(By.xpath("//label[text()='Male']")).click();
	     driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	     
	     Thread.sleep(2000);
	     driver.close();
}
}