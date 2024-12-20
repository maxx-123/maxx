package assignment1;
import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class PrintAllUrlAfterSearch {
	//WAS to search for we in google and print all the url present in the searchpage of google
		public static void main(String[] args)
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.google.com/");
			driver.findElement(By.name("q")).sendKeys("WWE");
			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
			List<WebElement> links = driver.findElements(By.xpath("//a"));
			for(WebElement link : links)
			{
				String text = link.getText();
				System.out.println("text");
			}
		}

	}



