package com.SeleniumTestingSamples.Examples;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Element: Button
//Methods - isSelected() and Click()
public class Example7 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String Url = "https://www.leafground.com/button.xhtml;jsessionid=node01eifibwzy1f5bvp5tuiwk09hd7788608.node0";
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.manage().window().maximize();

		WebElement getPositionButton = driver.findElement(By.id("j_idt88:j_idt94"));
		org.openqa.selenium.Point xypoint = getPositionButton.getLocation();
		int xValue = xypoint.getX();
		int yValue = xypoint.getY();
		System.out.println("X value is: "+xValue+"  Y value is: "+yValue);
		
		WebElement colourButton = driver.findElement(By.id("j_idt88:j_idt96"));
		String colour = colourButton.getCssValue("background");
		System.out.println("Button colour is: "+colour);
		
		WebElement sizeButton =	driver.findElement(By.id("j_idt88:j_idt98"));
		int height = sizeButton.getSize().getHeight();
		int width = sizeButton.getSize().getWidth();
		System.out.println("Button Height is: " +height+" Button Width is: "+width);
	}
}