package com.org.webtable;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Columntext {
	static WebDriver driver;

	public static void main(String args[]) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://makeseleniumeasy.com/2017/07/14/how-to-handle-a-web-table-in-selenium-webdriver/");

		System.out.println("2nd Column text :");
		List<WebElement> columntext= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td[2]"));
		for(WebElement we:columntext) {
			System.out.println(we.getText());
		}
}
}
