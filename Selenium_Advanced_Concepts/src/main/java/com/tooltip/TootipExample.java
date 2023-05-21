package com.tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TootipExample {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		WebElement element = driver.findElement(By.id("menuform:j_idt39"));
		element.click();

		WebElement textBox = driver.findElement(By.id("menuform:m_input"));
		textBox.click();

		WebElement notifications = driver.findElement(By.id("j_idt88:j_idt101"));
		String tooltipText = notifications.getAttribute("placeholder");
		System.out.println(tooltipText);

	}

}
