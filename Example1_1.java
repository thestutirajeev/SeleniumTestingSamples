package com.SeleniumTestingSamples.Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_1 {
	//SEND KEYS EXAMPLE 
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//Go to google home page
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//Open a website
		driver.findElement(By.name("q")).sendKeys("STUTI RAJEEV"+Keys.ENTER);
			
	}
}
