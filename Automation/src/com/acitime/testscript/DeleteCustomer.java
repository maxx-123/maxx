package com.acitime.testscript;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class DeleteCustomer {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://localhost/login.do");
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			driver.findElement(By.linkText("TASKS")).click();
			driver.findElement(By.xpath("//input[contains(@placeholder,'Sta')]")).sendKeys("apple");
			driver.findElement(By.xpath("//span[@class='highlightToken']/../..//div[@class='editButton available']")).click();Thread.sleep(2000);
		    driver.findElement(By.xpath("(//div[text()='ACTIONS'])[1]")).click();
		    driver.findElement(By.xpath("//div[text()='Delete']")).click();
		    driver.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
		    driver.quit();
		}

	}



