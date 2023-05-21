package com.frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesExample {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		WebElement firstClick = driver.findElement(By.id("menuform:j_idt38"));
		firstClick.click();
		WebElement frames = driver.findElement(By.id("menuform:m_frame"));
		frames.click();
		driver.switchTo().frame(0);
		WebElement browser = driver.findElement(By.id("Click"));
		browser.click();
		String text=driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		/*
		 * driver.switchTo().defaultContent(); driver.switchTo().frame(1);
		 * driver.switchTo().frame("frame2"); WebElement frameClick_2 =
		 * driver.findElement(By.id("Click")); frameClick_2.click();
		 */
		driver.switchTo().defaultContent();
		List<WebElement> totalFrames=driver.findElements(By.tagName("iframe"));
		int size=totalFrames.size();
		System.out.println(size);





	}

}
