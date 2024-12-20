package assignment1;
import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class CityNamePresentOrNotInDropdow {
	//WAS to check whether the mentioned city name is present in the dropdown or not
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("file:///D:/IT/Selenium/Dropdown.html");
			WebElement city_drop = driver.findElement(By.id("city"));
			Select s = new Select(city_drop);
			List<WebElement> options = s.getOptions();
			int count=0;
			for(int i=0; i<options.size(); i++)
			{
				String text = options.get(i).getText();
				if("Bengalore".equals(text))
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println("Yes it is present in the dropdown");
			}
			else
			{
				System.out.println("No it is not present in the dropdown");
			}
			driver.quit();

		}

	}



