package assignment1;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class GetTitleOfWebPage {

		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize(); Thread.sleep(2000);
			driver.get("https://www.w3schools.com/");Thread.sleep(2000);
			driver.findElement(By.id("search2")).sendKeys("SQL");Thread.sleep(2000);
			driver.findElement(By.id("learntocode_searchbtn")).click();Thread.sleep(2000);
			driver.close();
			
		}

	}



