package com.SeleniumTestingSamples.Examples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium. WebDriver;
import org.openqa.selenium. WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//File Upload
public class Example15_1 {
	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		
		WebElement uploadButton = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt89\']/span[1]"));
		uploadButton.click();

		String file = "C:\\Users\\Stuti Rajeev\\Pictures\\kartik.png";
		StringSelection selection = new StringSelection(file);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress (KeyEvent. VK_V);
		robot.keyRelease(KeyEvent. VK_V);
		robot.keyRelease(KeyEvent. VK_CONTROL);
		robot.keyPress (KeyEvent. VK_ENTER);
		robot.keyRelease(KeyEvent. VK_ENTER); 
	}
}