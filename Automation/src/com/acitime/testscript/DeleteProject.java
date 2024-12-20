package com.acitime.testscript;

import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class DeleteProject {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://localhost/login.do");
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			driver.findElement(By.linkText("TASKS")).click();
			driver.findElement(By.xpath("//div[text()='apple iphone ']/..//div[@class='editButton available']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@class='projectNamePlaceholder']/..//div[@class='action']")).click();
			driver.findElement(By.xpath("(//div[text()='Delete'])[3]")).click();
			driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
			driver.quit();
		}

	}

