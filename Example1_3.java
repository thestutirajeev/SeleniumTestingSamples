package com.SeleniumTestingSamples.Examples;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_3 {
	//TEXTBOX SCENARIO TO AUTOMATE 
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.manage().window().maximize();
		
		WebElement username1 = driver.findElement(By.name("username"));
		WebElement password1 = driver.findElement(By.name("password"));
		
		username1.sendKeys("Admin");
		password1.sendKeys("admin123");
		
		System.out.println("Text Field Values Set");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Delete Text Field Values
		username1.sendKeys(Keys.CONTROL+"a");
		username1.sendKeys(Keys.DELETE);
		password1.sendKeys(Keys.CONTROL+"a");
		password1.sendKeys(Keys.DELETE);
		System.out.println("Text Field Values deleted");
		
		
		//Find Login Button and Click
		WebElement submit = driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		username1.sendKeys("Admin");
		password1.sendKeys("admin123");
		submit.click();
		System.out.println("Login Button Clicked");
		
		//Find Logout button and click
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
	}
}
