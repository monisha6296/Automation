package com.org.internet.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addremove {
	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Add/Remove Elements']")).click();
		driver.findElement(By.xpath("//button[text()='Add Element']")).click();
		driver.findElement(By.xpath("//button[text()='Add Element']")).click();
		driver.findElement(By.xpath("//button[text()='Add Element']")).click();
		driver.findElement(By.xpath("//div[@id='elements']/button")).click();
		driver.findElement(By.xpath("//div[@id='elements']/button")).click();
		driver.findElement(By.xpath("//div[@id='elements']/button")).click();
		

}
}
