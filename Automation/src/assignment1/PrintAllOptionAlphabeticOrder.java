package assignment1;

	import java.time.Duration;
	import java.util.List;
	import java.util.TreeSet;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	//WAS to print all options present in city dropdown in alphabetical order
	public class PrintAllOptionAlphabeticOrder 
	{
		public static void main(String[] args) 
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("file:///D:/IT/Selenium/Dropdown.html");
			WebElement city_dropdown = driver.findElement(By.id("city"));
			Select s = new Select(city_dropdown);
			List<WebElement> options = s.getOptions();
			//to do default sorting treeset object will create
			TreeSet<String> ts = new TreeSet<>();
			for(int i=0; i<options.size(); i++)
			{
				String text = options.get(i).getText();
				ts.add(text);
			}
			for(String tx : ts)
			{
				System.out.println(tx);
			}
			driver.quit();
//			ts.addAll(options); // will get classcastexception 
//			for(WebElement txt : ts)
//			{
//				String text = txt.getText();
//				System.out.println(text);
//			}
		}
	}


