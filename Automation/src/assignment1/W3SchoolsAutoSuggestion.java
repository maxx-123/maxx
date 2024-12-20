package assignment1;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3SchoolsAutoSuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/java/java_intro.asp");Thread.sleep(2000);
		driver.findElement(By.id("tnb-google-search-input")).sendKeys("SQL");Thread.sleep(2000);
		List<WebElement> element = driver.findElements(By.xpath("//a[contains(text(),'SQL')]"));
		for(int i=0; i<element.size(); i++)
		{
			String text = element.get(i).getText();
			System.out.println(text);
		}
		driver.quit();
	}

}

