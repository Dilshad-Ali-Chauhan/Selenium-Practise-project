package com.codingiri.selenium_test.handling_alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_javaScript_Simple_Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		//simple_alerts();
		//confirmation_alerts();
		prompt_alerts();
	}
	
	static void simple_alerts() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/javascript-alerts/");
		Thread.sleep(2000);

		driver.findElement(By.id("s_alert1")).click();
		Thread.sleep(4000);
		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	static void confirmation_alerts() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/javascript-alerts/");
		Thread.sleep(2000);
		driver.findElement(By.id("c_alert2")).click();
		Thread.sleep(4000);
		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
	}
	
	static void prompt_alerts() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/javascript-alerts/");
		Thread.sleep(2000);
		driver.findElement(By.id("p_alert3")).click();
		Thread.sleep(4000);
		
		Alert a = driver.switchTo().alert();
		a.sendKeys("Delhi");
		System.out.println(a.getText());
		a.accept();
		
		//In alerts case we don't need to switch browser to main case 
		//but in multiple browser and i_frame case we need to switch browser
	}

}
