package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://106.51.82.61:9007/");Thread.sleep(3000);
		driver.manage().window().maximize();Thread.sleep(3000);
		WebElement emailtf = driver.findElement(By.id("email"));
		emailtf.sendKeys("admin@admin.com");Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("admin@123");Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("admin logged in");Thread.sleep(3000);
		driver.findElement(By.xpath("//h3[text()='Doctor']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Add Doctor')]")).click();
		driver.findElement(By.id("feild-1")).sendKeys("Manjunath");
		
		
		
		
		
		
		
		
	}

}
