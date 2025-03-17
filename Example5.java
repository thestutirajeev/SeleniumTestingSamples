package com.SeleniumTestingSamples.Examples;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Radio Button
//Methods - isSelected() and Click()
public class Example5 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String Url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.manage().window().maximize();

		WebElement usernamel = driver.findElement(By.name("username"));
		WebElement password1 = driver.findElement(By.name("password"));
		usernamel.sendKeys("Admin");
		password1.sendKeys("admin123");

		WebElement submit =	driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		submit.click();

		Thread.sleep(5000);
		WebElement myInfo = driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span"));
		myInfo.click();

		WebElement radio1 = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span") );
		boolean selectState = radio1.isSelected();

		if(!selectState) {
			radio1.click();
		}

		//Page scroll down
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy (0,250)");
		Thread.sleep(5000);

		//Page scroll up
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,-250)");
	}
}