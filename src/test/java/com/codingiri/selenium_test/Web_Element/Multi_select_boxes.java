package com.codingiri.selenium_test.Web_Element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_select_boxes {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/jobs/information-technology-jobs-agra?trk=homepage-jobseeker_suggested-search&position=1&pageNum=0");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("button[data-tracking-control-name='public_jobs_f_E'][type='button']")).click();

		Thread.sleep(4000);

		List<WebElement> inputs = driver.findElements(By.cssSelector("input[name='f_E'] + label"));
		for (WebElement input : inputs) {
			if(input.getText().trim().contains("Entry level (1)") || input.getText().trim().contains("Mid-Senior level (1)")) {
				input.click();
			}
			
			// to select all we dont need to use if condition simply write 'input.click()' 
		}

	}
}
