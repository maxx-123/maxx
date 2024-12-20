package assignment1;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class CaptureAutoSuggestFlifkart {

		public static void main(String[] args) 
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.name("q")).sendKeys("apple iphone");
			List<WebElement> suggestion = driver.findElements(By.xpath("//span[contains(text(),'apple iphone')]"));
			for(int i=0; i<suggestion.size(); i++)
			{
				String text = suggestion.get(i).getText();
				System.out.println(text);
			}
		}

	}

