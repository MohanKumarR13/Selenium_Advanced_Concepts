package com.calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarExample {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://jqueryui.com/resources/demos/datepicker/other-months.html");
		WebElement calElement = driver.findElement(By.id("datepicker"));
		calElement.click();
		WebElement nextOption = driver.findElement(By.xpath("//a[@title='Next']"));
		nextOption.click();

		WebElement dateToBeGiven = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		dateToBeGiven.click();
	}

}
