package com.SeleniumTestingSamples.Examples;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//ALERT EXAMPLE 1
public class Example10_1 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		WebElement alertBoxElement = driver.findElement(By.id("alertexamples"));
		alertBoxElement.click();
		
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		alert.accept();		
	}
}