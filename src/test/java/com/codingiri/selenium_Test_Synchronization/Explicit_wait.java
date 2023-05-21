package com.codingiri.selenium_Test_Synchronization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

	public static void main(String[] args) throws InterruptedException {
		
		
		//in this example if we have a form and after we fill the form ,the button go to next page is present but not enable
		//so wait for some button to enable and appear we use explicit wait
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.get("https://www.dezlearn.com/explicit-wait-example/");
		Thread.sleep(2000);
		
		List<WebElement> formInputs = driver.findElements(By.cssSelector("div#content  form > input"));
		formInputs.get(0).sendKeys("FNAME");
		formInputs.get(1).sendKeys("LNAME");
		formInputs.get(2).sendKeys("Email");
		Thread.sleep(3000);
		
		driver.findElement(By.id("u_5_6")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("u_5_7")));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("u_5_7"))).click(); //whether we can use this line or 38 line
		//driver.findElement(By.id("u_5_7")).click();
		
		 
                      

	}

}
