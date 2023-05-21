package com.drag_and_drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		WebElement browser = driver.findElement(By.id("menuform:j_idt38"));
		browser.click();
		WebElement drag = driver.findElement(By.id("menuform:m_drag"));
		drag.click();
		WebElement from = driver.findElement(By.id("form:drag"));
		WebElement to = driver.findElement(By.id("form:drop"));
		Actions actions = new Actions(driver);
		//actions.clickAndHold(from).moveToElement(to).release(to).build().perform();
		actions.dragAndDrop(from, to).build().perform();

	}

}
