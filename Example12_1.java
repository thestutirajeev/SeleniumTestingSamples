package com.SeleniumTestingSamples.Examples;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//OPEN SINGLE WINDOW
public class Example12_1 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		String oldWindow = driver.getWindowHandle();
		System.out.println("Parent Window Handle:"+ oldWindow);

		//Click New Window button
		WebElement firstButton = driver.findElement(By.xpath("//*[@id=\'j_idt88:new\']/span"));
		
		firstButton.click();
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println("Window Handles: " + handles);
		
		for(String newWindow: handles) {
			driver.switchTo().window(newWindow);
		}
		// Enter value in Email Address Text box
		
		WebElement textBox = driver.findElement(By.xpath("//*[@id=\'email\']"));
		textBox.sendKeys("mcavit@gmail.com");
	}
}