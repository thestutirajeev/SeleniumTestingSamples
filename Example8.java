package com.SeleniumTestingSamples.Examples;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//LOCATOR Link Text
public class Example8 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml"); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000)); 
		driver.findElement(By.linkText("Go to Dashboard")).click();
	}
}