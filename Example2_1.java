package com.SeleniumTestingSamples.Examples;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

//Firefox Browser
public class Example2_1 {
	public static void main(String[] args) {

		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		//Go to google home page
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		System.out.println("Website launched successfully");
		String getTitle = driver.getTitle();
		System.out.println("Title of home page: " + getTitle);
		driver.close();
		
	}
}