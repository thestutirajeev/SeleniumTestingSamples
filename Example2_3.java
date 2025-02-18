package com.SeleniumTestingSamples.Examples;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

//Firefox PageSource
public class Example2_3 {
	public static void main(String[] args) {

		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		String URL = "https://www.google.com/";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		String getCurrentUrl = driver.getCurrentUrl();
		System.out.println("Current URL of Home page: "+ getCurrentUrl);
		String getPageSource = driver.getPageSource();
		System.out.println("Page Source "+getPageSource);
		driver.close();
		
	}
}
