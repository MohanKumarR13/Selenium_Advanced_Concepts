package com.selectable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectableexample {
//Not Worked
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		Thread.sleep(5000);

		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id='selectable']/li"));
		int listSize = selectable.size();		Thread.sleep(5000);
		System.out.println(listSize);
		Actions actions = new Actions(driver);
		//actions.keyDown(Keys.CONTROL).click(selectable.get(2)).build().perform();
		//actions.clickAndHold(selectable.get(3)).build().perform();

	}

}
