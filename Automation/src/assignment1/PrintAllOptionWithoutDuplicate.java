package assignment1;
	import java.time.Duration;
	import java.util.HashSet;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class PrintAllOptionWithoutDuplicate
	{
	//WAS to print all option in city dropdown without duplicate
		public static void main(String[] args) 
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("file:///D:/IT/Selenium/Dropdown.html");
			WebElement city_dd = driver.findElement(By.id("city"));
			Select s = new Select(city_dd);
			List<WebElement> allOptions = s.getOptions();
			//to store without duplicate
			HashSet<String> hs = new HashSet<>();
			for(int i=0; i<allOptions.size(); i++)
			{
				String text = allOptions.get(i).getText();
				hs.add(text);
			}
			//extracting all one by one
			for(String txt : hs)
			{
				System.out.println(txt);
			}
			driver.quit();
		}

	}



