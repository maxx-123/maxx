package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
	@BeforeTest
	public void openBrwoser() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost/login.do");
		Reporter.log("openBrowser",true);}
	@BeforeMethod
	public void login() {
		driver.findElement(By.id(("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div [text()='Login ']")).click();
		Reporter.log("login",true);}
@AfterTest
public void closeBrowser() {
	driver.manage().window().minimize();
	driver.quit();
	Reporter.log("closeBrowser",true);
	
}

}