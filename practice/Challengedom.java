package com.org.internet.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Challengedom {

	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Challenging DOM']")).click();
		String s=driver.findElement(By.xpath("//a[@class='button']")).getText();
		System.out.println(s);
		String s1=driver.findElement(By.xpath("//a[@class='button alert']")).getText();
		System.out.println(s1);
		
		String s2=driver.findElement(By.xpath("//a[@class='button success']")).getText();
		System.out.println(s2);
}
}
