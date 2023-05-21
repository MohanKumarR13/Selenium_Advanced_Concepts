package com.dynamic_tables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TablesExample {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.leafground.com/dynamicgrid.xhtml;jsessionid=node01gbkksb9t2f5572q6o8pr8vmd265250.node0");
		List<WebElement> coulmns = driver.findElements(By.tagName("th"));
		int columnCount = coulmns.size();
		System.out.println("Number of Columns : " + columnCount);
		List<WebElement> rows = driver.findElements(By.tagName("th"));
		int rowCount = rows.size();
		System.out.println("Number of Columns : " + rowCount);
		/*
		 * List<WebElement> getPrice = driver .findElements(By.
		 * xpath("//td[normalize-space()='Black Watch']//following::span[1]")); int
		 * price = getPrice.size();
		 */
		List<WebElement>allProgress=driver.findElements(By.xpath("//td[2]"));
		List<Integer>numberList=new ArrayList<Integer>();
		for (WebElement webElement : allProgress) {
			String individualValue=webElement.getText().replace("-", "");
			numberList.add(Integer.parseInt(individualValue));
			
		}System.out.println("Final List :"+numberList);
		int smallValue=Collections.min(numberList);
		String smallValueString=Integer.toString(smallValue);
		System.out.println("Small Value :"+smallValue);
		
		String finalXpath="//td[normalize-space()="+"\""+smallValueString+"\""+"]"+"//following::td[1]]";
		System.out.println(finalXpath);
		/*
		 * WebElement check=driver.findElement(By.xpath(finalXpath)); check.click();
		 */


	}

}
