package com.SeleniumTestingSamples.Examples;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//prompt BOX EXAMPLE 
public class Example10_3 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		WebElement promptBoxElement = driver.findElement(By.id("promptexample"));
		promptBoxElement.click();
		
		Thread.sleep(5000);
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.accept();
		
		//Page scroll down
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 550)");
	}
}