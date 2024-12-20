package assignment1;

	import java.time.Duration;
	import java.util.List;
	import java.util.TreeSet;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class PrintDropdownAlphabeticOrderWithoutDuplicat
	{
	//WAS to print all option in city dropdown in alphabetical order and without duplicates
		public static void main(String[] args) 
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("file:///D:/IT/Selenium/Dropdown.html");
			WebElement city_drop = driver.findElement(By.id("city"));
			Select s = new Select(city_drop);
			List<WebElement> options = s.getOptions();
			TreeSet<String> ts = new TreeSet<>();
			for(int i=0; i<options.size(); i++)
			{
				String text = options.get(i).getText();
				ts.add(text);
			}
			for(String txt : ts)
			{
				System.out.println(txt);
			}
			driver.quit();
		}

	}


