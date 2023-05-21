package com.codingiri.selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_collection {

	public static void main(String[] args) throws InterruptedException {
		
		//get collection of all the links from a web page

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.actitime.com");
		Thread.sleep(2000);
		//List<WebElement> links = driver.findElements(By.cssSelector("a"));//we get the list of all links of 'a' tag whether it has name or empty
		List<WebElement> links = driver.findElements(By.cssSelector("li.header__li"));//we get only 4 links that has tag name 'li' and class name header__li
		for(WebElement link : links)
		{
			String text = link.getText();//we get only that links which have link name before that we get all links that have name or empty
			if(!text.trim().isEmpty())
			{
			
			System.out.println(link.getText());
			System.out.println(link.getAttribute("class"));//get class name along with links.we can also use any other attribute like id
			System.out.println("................");
		}
		}
		
          driver.close();
		
		
		
		
		
		
		
	}

}
