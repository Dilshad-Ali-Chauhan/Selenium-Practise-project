package com.codingiri.selenium_test.Web_Element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Select_Date_from_Datepicker {

	public static void main(String[] args) throws InterruptedException {

		String expMonth = "November 2021";
		String expDate = "14";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.trivago.com");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("button[key='checkInButton']")).click();

		Thread.sleep(4000);

//		String currMonth = driver.findElement(By.xpath("//span[text()='August 2021']")).getText();
		List<WebElement> months = driver.findElements(By.cssSelector("th.cal-heading-month"));

//		months->1,2
//		for (WebElement month : months) {
//			System.out.println(month.getText());
//		}

		String currMonth = months.get(0).getText();

		//int c = 0;
		while (!currMonth.equals(expMonth)) {
			
			driver.findElement(By.cssSelector("button.cal-btn-next")).click();
			//c++;
			Thread.sleep(3000);
//			currMonth = driver.findElement(By.xpath("//span[text()='September 2021']")).getText();
			currMonth = driver.findElements(By.cssSelector("th.cal-heading-month")).get(0).getText();
			Thread.sleep(3000);
		//if (c == 12) {
			//break;
//
			//}
			//driver.findElements(By.cssSelector("th.cal-heading-month")).get(0).
		}

		List<WebElement> dates = driver.findElements(By.cssSelector("table:nth-child(2) td"));
	Thread.sleep(3000);
		for (WebElement date : dates) {
			String x = date.getText().trim();
			if (x.equals(expDate)) {
				date.click();
				break;
			}		}
	}

}
