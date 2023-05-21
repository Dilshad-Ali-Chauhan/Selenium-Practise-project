package com.codingiri.selenium_Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(2000);
		
       WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
       Actions action = new Actions(driver);
       action.contextClick(button).perform();
       Thread.sleep(2000);
       
       action.sendKeys(Keys.ARROW_DOWN).perform();  //arrow_down key click down button of keyboard
       Thread.sleep(2000);
       action.sendKeys(Keys.ARROW_DOWN).perform();
       Thread.sleep(2000); Thread.sleep(2000);
       action.sendKeys(Keys.ARROW_DOWN).perform();
       Thread.sleep(2000);
       
       action.sendKeys(Keys.RETURN).perform();  //it perform the enter key to perform the function

}
}
