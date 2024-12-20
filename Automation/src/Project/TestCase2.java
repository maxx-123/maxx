package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://106.51.82.61:9007/");Thread.sleep(3000);
		driver.manage().window().maximize();Thread.sleep(3000);
		WebElement emailtf = driver.findElement(By.id("email"));
		emailtf.sendKeys("das@gmail.com");Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("das@123");Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("patient logged in");Thread.sleep(3000);
		driver.findElement(By.xpath ("//i[@class='fa fa-edit']")).click();
		System.out.println("clicked on appointment button");
		driver.findElement(By.xpath("//span[text()='Appointment List']")).click();
		System.out.println(" appointment page is displayed");
		driver.findElement(By.xpath("/button[contains(text(),'Apply for appoinment')]")).click();
		System.out.println("appointment selection page is displayed");
		driver.findElement(By.id("s2id_autogen3")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[last()]")).sendKeys("arjun reddy");
		driver.findElement(By.xpath("//[@name='date_timestamp']")).sendKeys("Fri,13 December 2024");
		driver.findElement(By.name("time_timestamp")).clear();
		driver.findElement(By.name("time_timestamp")).sendKeys("01:30");
		driver.findElement(By.className("modal-title")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		driver.findElement(By.id("email")).sendKeys("arjun@gmail.com");
		driver.findElement(By.id("password")).sendKeys("arjn");
		driver.findElement(By.xpath("/button[contains[@type='submit']")).click();
		driver.quit();

		

		
			


		


		
		
		

		
				
	
		
		

		
}
}
