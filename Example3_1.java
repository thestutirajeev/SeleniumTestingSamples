package com.SeleniumTestingSamples.Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Drop Down Example Select Class
public class Example3_1 {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		String URL = "https://www.amazon.com/";
		driver.get(URL);
		driver.manage().window().maximize();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		// Create an object of Select class and pass the dropdown of type WebElement  as argument
		WebElement dropdown1 = driver.findElement(By.id("searchDropdownBox"));
		Select dropdown = new Select(dropdown1);
		dropdown.selectByVisibleText("Books");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	}
}
