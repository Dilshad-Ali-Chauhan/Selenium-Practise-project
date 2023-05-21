package com.codingiri.selenium_Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement red = driver.findElement(By.cssSelector("div#red>span"));
		WebElement green = driver.findElement(By.cssSelector("div#green>span"));
		WebElement blue = driver.findElement(By.cssSelector("div#blue>span"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(red).moveByOffset(-20, 0).release().build().perform(); //we go -20 to x direction because its already up_to max length in positive direction
                                                                         //we set length only for x direction because it doesn't have y direction
		Thread.sleep(2000);
		action.clickAndHold(green).moveByOffset(-30, 0).release().build().perform();
		Thread.sleep(2000);
		action.clickAndHold(blue).moveByOffset(20, 0).release().build().perform();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
