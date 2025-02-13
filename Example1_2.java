package com.SeleniumTestingSamples.Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_2 {
	//TEXT BOX EXAMPLE 
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		
		WebElement textBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:name\"]"));
		textBox.sendKeys("Stuti Rajeev");
		
		WebElement appendBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
		appendBox.sendKeys(" India");

		WebElement disabledBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]"));
		boolean enabled = disabledBox.isEnabled();
		System.out.println(enabled);

		WebElement clearBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]"));
		clearBox.clear();
		
		WebElement retriveText = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt97\"]"));
		String value = retriveText.getAttribute("value");
		System.out.println(value);
		
		WebElement emailBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt99\"]"));
		emailBox.sendKeys("stuti@gmail.com");
		emailBox.sendKeys(Keys.TAB);
						
	}
}
