package com.links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksExtendedExample {
	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		WebElement dashBoard = driver.findElement(By.linkText("Go to Dashboard"));
		dashBoard.click();
		driver.navigate().back();
		WebElement find_My_Destination = driver.findElement(By.linkText("Find the URL without clicking me."));
		String withOut_Click_Me = find_My_Destination.getAttribute("href");
		System.out.println("This link is going to " + withOut_Click_Me);

		WebElement brokenLink = driver.findElement(By.linkText("Broken?"));
		brokenLink.click();
		String title = driver.getTitle();
		if (title.contains("404")) {
			System.out.println("Link Is Broken");
		}
		driver.navigate().back();
		WebElement dashBoard_1 = driver.findElement(By.linkText("Go to Dashboard"));
		dashBoard_1.click();
		driver.navigate().back();
		
		List<WebElement>totalLinks=driver.findElements(By.tagName("a"));
		int totalLinksCount=totalLinks.size();
		System.out.println("Total Links Count: "+totalLinksCount);

	}
}
