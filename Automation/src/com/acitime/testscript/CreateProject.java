package com.acitime.testscript;
	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class CreateProject {
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://localhost/login.do");
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			driver.findElement(By.linkText("TASKS")).click();
			driver.findElement(By.xpath("//div[text()='Add New']")).click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='+ New Project']")));
			driver.findElement(By.xpath("//div[text()='+ New Project']")).click();
			driver.findElement(By.id("projectPopup_projectNameField")).sendKeys("apple iphone");
			driver.findElement(By.id("ext-gen23")).click();
			driver.findElement(By.linkText("Boston Chocolate")).click();
			driver.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("prasadk");
			driver.findElement(By.xpath("//span[text()='Create Project']")).click();
			driver.quit();

		}
	}



