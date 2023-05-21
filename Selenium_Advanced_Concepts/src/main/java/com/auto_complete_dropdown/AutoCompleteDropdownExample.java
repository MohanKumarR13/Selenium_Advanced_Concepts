package com.auto_complete_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoCompleteDropdownExample {
	private static By frameLocator = By.className("demo-frame");
	private static By tagText = By.id("tags");

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/autocomplete/");
		Thread.sleep(5000);
		WebElement frameElement = driver.findElement(frameLocator);
		driver.switchTo().frame(frameElement);
		WebElement textBoxElement = driver.findElement(tagText);
		textBoxElement.sendKeys("A");
		Thread.sleep(5000);

		List<WebElement> optionList = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		System.out.println(optionList.size());
		for (WebElement webElement : optionList) {
			if (webElement.getText().equals("ActionScript")) {
				webElement.click();
				// System.out.println("Selecting " + webElement.getText());
				System.out.println("If Part");
				break;
			} else {
				System.out.println("Else Part");
			}
		}

	}

}
