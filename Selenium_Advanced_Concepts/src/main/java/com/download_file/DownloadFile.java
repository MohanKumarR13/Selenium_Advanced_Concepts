package com.download_file;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFile {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/file.xhtml");
		WebElement download = driver.findElement(By.id("j_idt93:j_idt95"));
		download.click();
		File fileLocation = new File("C:\\Users\\91979\\Downloads");
		File[] totalFiles = fileLocation.listFiles();
		for (File file : totalFiles) {
			file.getName().equals("TestLeaf Logo");
			System.out.println("File is Downloaded");
			break;
		}

	}

}
