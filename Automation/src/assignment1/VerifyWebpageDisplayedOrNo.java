package assignment1;
import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class VerifyWebpageDisplayedOrNo
	{

		public static void main(String[] args)
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String expectedUrl = "https://www.w3schools.com/java/java_intro.asp";
			driver.get(expectedUrl);
			String actualUrl = driver.getCurrentUrl();
			if(expectedUrl.equals(actualUrl))
			{
				System.out.println("Test is passed ");
			}
			else
				System.out.println("Test is failed");
			driver.quit();
		}

	}



