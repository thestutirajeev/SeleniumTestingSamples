package com.SeleniumTestingSamples.Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//DRAG AND DROP
public class Example13 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		WebElement from = driver.findElement(By.xpath("//*[@id=\'form:drop_header\']"));
		WebElement to = driver.findElement(By.xpath("//*[@id=\'form:drop_header\']"));
		
		Actions actions = new Actions(driver);
		
		Thread.sleep(5000);
		actions.dragAndDrop(from, to).build().perform();
		System.out.print("Successfully Dropped");		
	}
}