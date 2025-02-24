package com.SeleniumTestingSamples.Examples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Drop Down Example by Value or Index
public class Example3_2 {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		String URL = "https://www.leafground.com/select.xhtml";
		driver.get(URL);
		
		WebElement dropdown1 = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		Select select = new Select(dropdown1);
		
		select.selectByIndex(1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		select.selectByVisibleText("Cypress");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		List<WebElement> listOfOptions = select.getOptions();
		int size = listOfOptions.size();
		System.out.println("Number of Elements "+size);
		
		//Using Send Keys()
		dropdown1.sendKeys("Playwright");		
	}
}
