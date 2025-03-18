package com.SeleniumTestingSamples.Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//ELEMENT: Checkbox
//Methods- isSelected() and Click()
public class Example6 {
	public static void main(String args[]) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		WebElement basicOption = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]"));
		basicOption.click();
		WebElement ajaxOption = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt91\"]/div[2]"));
		boolean ajaxStatus = ajaxOption.isSelected();
		System.out.println("Ajax CheckBox Status is: " + ajaxStatus);
	}
}