package com.codingiri.selenium_Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multi_key_operation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/#default");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement  first = driver.findElement(By.cssSelector("ol#selectable>li:nth-child(1)"));
		WebElement  third = driver.findElement(By.cssSelector("ol#selectable>li:nth-child(3)"));
		WebElement  fifth = driver.findElement(By.cssSelector("ol#selectable>li:nth-child(5)"));
		
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL).perform(); //key_down means control key is keeps on pressing for select multiple element until we release it
		action.click(first);
		action.click(third);
		action.click(fifth);
		action.keyUp(Keys.CONTROL).perform(); //key_up means it release the control key.
		Thread.sleep(4000);
		driver.quit();
		
		

	}

}
