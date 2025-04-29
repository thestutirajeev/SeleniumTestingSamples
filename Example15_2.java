package com.SeleniumTestingSamples.Examples;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//15.2
//File Download

public class Example15_2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");

		WebElement downLoad = driver.findElement(By.xpath("//*[@id=\'j_idt93:j_idt95\']"));
		downLoad.click();
		
		File fileLocation = new File("C:\\Users\\Admin\\Downloads");
		File[] totalFiles = fileLocation.listFiles();

		for (File file: totalFiles) {
			if(file.getName().equals("TestLeaf Logo.png")) 
				System.out.println("File Download Success");
			break;
		}

	}


}