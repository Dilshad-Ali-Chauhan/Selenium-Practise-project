package com.codingiri.selenium_test.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		
		//if the element is within some i_frame then driver is not able to locate it directly
		//so first we need to switch the driver to particular i_frame
		//we can switch the driver using index if the element is static
		//if element is dynamic then we can also switch driver through id/name and web_element.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/iframe-example/");
		Thread.sleep(2000);
		
      // driver.switchTo().frame(1);                        //By index
      // driver.findElement(By.id("u_5_6")).click();
       
      // driver.switchTo().frame("iframe1");               //By id
      // driver.findElement(By.id("u_5_6")).click();
       
      // driver.switchTo().frame("demo_frame1");          //By name
       //driver.findElement(By.id("u_5_6")).click();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframe1']"));       //By web_element
		driver.switchTo().frame(frame);
		driver.findElement(By.id("u_5_6")).click();
		
		Thread.sleep(2000);                                           //switch to main browser
		driver.switchTo().defaultContent();
 driver.findElement(By.xpath("//a[text()='Courses']")).click();
 
	}

}
