package com.org.internet.herokuapp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Securedwn {
	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//http://username:password@websiteurl
		//driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		//driver.get("http://admin:admin@the-internet.herokuapp.com/digest_auth");
		driver.get("http://admin:admin@the-internet.herokuapp.com/download_secure");
		String s=driver.findElement(By.xpath("//div[@class='example']")).getText();
		System.out.println(s);
		
	}

}
