package com.codingiri.selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advance_collection_getbooktext {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.goodreads.com");
		Thread.sleep(2000);
		List<WebElement> books = driver.findElements(By.cssSelector("img[src$='jpg']"));
		
		System.out.println(books.size());//size of books text to be displayed or size of search result
		/*for(WebElement book : books) {
			System.out.println(book.isDisplayed());//if book is visible on page its shows true if not then false
			System.out.println(book.getAttribute("alt"));
			System.out.println("...................");
		}
		
		*/
			
			for(WebElement book : books) {    //it shows the list of only books that are present on page i.e only true case
				if(book.isDisplayed()) {
					System.out.println(book.isDisplayed());
					System.out.println(book.getAttribute("alt"));
					System.out.println("........................");
				}
			}
		
		
		driver.close();

	}

}
