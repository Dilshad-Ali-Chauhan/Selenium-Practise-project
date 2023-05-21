package com.codingiri.selenium_test.Web_Element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_WebTables {

	public static void main(String[] args) throws InterruptedException {
		// WebTables_data();
		WebTables_cells();
	}

	static void WebTables_data() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/webtable-example/");
		Thread.sleep(2000);

		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='tg']/tbody/tr"));
		int c = 0;
		for (WebElement row : rows) { // we skip 1st row because it does not contain any data it is heading row
			c++;
			if (c == 1) {
				continue;
			}
			String x = row.findElement(By.xpath("td[1]")).getText();
			String y = row.findElement(By.xpath("td[2]")).getText();

			System.out.println("Name:" + x);
			System.out.println("Email:" + y);
			System.out.println("....................");

		}
		driver.quit();

	}

	static void WebTables_cells() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilshad\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/webtable-example/");
		Thread.sleep(2000);

		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='tg']/tbody/tr"));
		int c = 0;
		for (WebElement row : rows) { // we skip 1st row because it does not contain any data it is heading row
			c++;
			if (c == 1) {
				continue;
			}
			String name = row.findElement(By.xpath("td[1]")).getText();
			System.out.println(name);

			if (name.equals("John White")) {
				Thread.sleep(4000); // row.findElement(By.xpath("tr[4]/td[4]/input")).click();
				row.findElement(By.xpath("td[4]/input")).click();

				// List<WebElement> options = row.findElements(By.xpath("tr[4]/td[5]/select"));
				List<WebElement> options /* select */ = row.findElements(By.xpath("td[5]/Select/option"));
				System.out.println("List size: " + options.size());
				for (WebElement opt : options) {
//					System.out.println(opt.getText());
					if (opt.getText().contains("Suv")) {

						opt.click();
						break;
					}
				}
				Thread.sleep(2000);
				// row.findElement(By.xpath("tr[4]/td[6]/input")).sendKeys("demo test");
				row.findElement(By.xpath("td[6]/input")).sendKeys("demo test");
//				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='demo']")).click();
		Thread.sleep(5000);
		// driver.switchTo().frame("mailerlite-popup");
//		driver.findElement(By.xpath("//div[@class='mailerlite-popup']/div[@class='ml-popup']/button[@class='close']"))
//				.click();
		driver.findElement(By.cssSelector(".mailerlite-popup > .ml-popup > button.close")).click();
//
	}
}
