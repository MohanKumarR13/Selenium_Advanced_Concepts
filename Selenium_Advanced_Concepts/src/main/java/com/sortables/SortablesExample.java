package com.sortables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortablesExample {
//Not Worked
	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/sortable/");
		// Scroll to Some Position
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scroll(0,150)", "");
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id='sortable']/li/span"));
		System.out.println(elements.size());
		WebElement fromElement = elements.get(6);
		WebElement toeleElement = elements.get(0);
		Actions actions = new Actions(driver);
		actions.clickAndHold(fromElement);
		actions.moveToElement(toeleElement);
		actions.release(toeleElement);
		actions.build().perform();

	}

}
