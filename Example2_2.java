package com.SeleniumTestingSamples.Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

//Firefox Browser
public class Example2_2 {
	public static void main(String[] args) {

		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		//Go to google home page
		driver.get("https://www.facebook.com/");
		
		String getTitle = driver.getTitle();
		String expectedTitle = "Facebook – log in or sign up";
		
		if(getTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Verified!!");
			System.out.println("Home page title is: "+getTitle);
		}else {
			System.out.println("Verification failed");
		}
		driver.close();
		
	}
}