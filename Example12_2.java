package com.SeleniumTestingSamples.Examples;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//FIND NO. OF OPENED WINDOWS & CLOSE ALL WINDOWS EXCEPT PRIMARY WINDOW
public class Example12_2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		String oldWindow = driver.getWindowHandle();
		System.out.println("Parent Window Handle:"+ oldWindow);

		Set<String> handles = driver.getWindowHandles();
		
		for(String newWindow: handles) {
			driver.switchTo().window(newWindow);
		}
		
		// Open Multiple Window		
		WebElement openMultiple = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
		openMultiple.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		int numOfWindows = driver.getWindowHandles().size();
		System.out.println("Number of Windows Opened: "+numOfWindows);

		Set <String> newWindowHandles = driver.getWindowHandles();
		System.out.println("All Window Handles: "+ newWindowHandles);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		for (String allWindows: newWindowHandles) {
			if(!allWindows.equals(oldWindow))
				driver.switchTo().window(allWindows);
		}
	}
}