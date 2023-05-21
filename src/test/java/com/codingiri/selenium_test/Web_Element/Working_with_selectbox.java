package com.codingiri.selenium_test.Web_Element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_selectbox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text() , \"Create New\")]")).click();
		Thread.sleep(2000);
		String a = driver.findElement(By.id("day")).getAttribute("value"); // to take current value of text_field we use
																			// 'value'attribute
		String b = driver.findElement(By.id("month")).getAttribute("value");
		String c = driver.findElement(By.id("year")).getAttribute("value");

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// to select  one element from all option

		
		  List<WebElement> d = driver.findElements(By.cssSelector("select#day>option"));
		  
		  for(WebElement day:d) { if(day.getText().trim().equals("2")) { day.click();
		  break; } } List<WebElement> m =
		  driver.findElements(By.cssSelector("select#month>option"));
		  
		  for(WebElement month:m) { if(month.getText().trim().equals("Aug")) {
		  month.click(); break; } }
		  
		  List<WebElement> y =
		 driver.findElements(By.cssSelector("select#year>option"));
		 
		 for(WebElement year:y) { if(year.getText().trim().equals("1996")) {
		  year.click(); break; }
		  }
		
		// to print all element of list

		List<WebElement> d1 = driver.findElements(By.cssSelector("select#day>option"));

		for (WebElement day : d1) {
			System.out.println(day.getText());

		}
		
		

		List<WebElement> m1 = driver.findElements(By.cssSelector("select#month>option"));

		for (WebElement month : m1) {
			System.out.println(month.getText());

		}
		

		List<WebElement> y1 = driver.findElements(By.cssSelector("select#year>option"));

		for (WebElement year : y1) {
			System.out.println(year.getText());

		}
	}

}
