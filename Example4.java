package com.SeleniumTestingSamples.Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Bootstrap Drop Down
public class Example4 {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		String URL = "https://www.hdfc.com/";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.manage().window().maximize();
		
		//Locate drop down element on web page.
		WebElement housingdropdown = driver.findElement(By.xpath("//*[@id=\"container-91af4cb463\"]/div/div[1]/div"));
		housingdropdown.click();
		WebElement refinanceoption = driver.findElement(By.xpath("//*[@id=\"productType\"]/li[4]"));
		refinanceoption.click();
		
		WebElement product =  driver.findElement(By.xpath("//*[@id=\"container-91af4cb463\"]/div/div[2]/div"));
		product.click();
		WebElement plotOption = driver.findElement(By.xpath("//*[@id=\"productName\"]/li[2]"));
		plotOption.click();
	}
}