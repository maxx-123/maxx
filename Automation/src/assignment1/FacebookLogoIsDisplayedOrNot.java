package assignment1;
import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class FacebookLogoIsDisplayedOrNot {

		public static void main(String[] args) 
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.facebook.com/");
			boolean logoDisOrNot = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
			if(logoDisOrNot)
				System.out.println("logo is displayed");
			else
				System.out.println("Logo is not displayed");
			driver.quit();
		}

	}



