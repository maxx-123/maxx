package assignment1;
import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class YatraAssignment {

		public static void main(String[] args) 
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.yatra.com/");
			driver.findElement(By.xpath("//p[@title='New Delhi']")).click();
			driver.findElement(By.xpath("//div[text()='Bangalore, (BLR)']")).click();
			driver.findElement(By.xpath("//p[@title='Mumbai']")).click();
			driver.findElement(By.xpath("//div[text()='Goa, (GOI)']")).click();
			driver.quit();
		}

	}



