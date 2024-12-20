package assignment1;
import org.openqa.selenium.Dimension;
	import org.openqa.selenium.Point;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Assignment1 
	{
		public static void main(String[] args) throws InterruptedException 
		{
			//open the chrome browser
			WebDriver driver = new ChromeDriver();
			//maximize the browser screen
			driver.manage().window().maximize();Thread.sleep(1000);
			//trigger qspider webpage using get() method
			driver.get("https://www.qspiders.com");Thread.sleep(1000);
			//navigate to jspiders webpage
			driver.navigate().to("https://jspiders.com/");Thread.sleep(1000);
			//navigate back to previous page
			driver.navigate().back();Thread.sleep(1000);
			//navigate to forward page
			driver.navigate().forward();Thread.sleep(2000);
			//refresh the page
			driver.navigate().refresh();Thread.sleep(2000);
			//storing actual url 
			String actualUrl = "https://jspiders.com/";
			//getting url from webpage
			String expectedUrl = driver.getCurrentUrl();
			//comparing actual url with expected url
			if(actualUrl.equals(expectedUrl))
			{
				System.out.println("Test Passed : URL are same");
			}
			//making full screen
			driver.manage().window().fullscreen();Thread.sleep(1000);
			//changing the webpage resolution
			driver.manage().window().setSize(new Dimension(500,600));Thread.sleep(1000);
			//storing resolution size of webpage
			Dimension size=driver.manage().window().getSize();Thread.sleep(1000);
			//storing position of webpage
			Point size1 = driver.manage().window().getPosition();Thread.sleep(2000);
			System.out.println(size);
			System.out.println(size1);
			//storing the page soure or visible code of webpage
			String pgSrc = driver.getPageSource();Thread.sleep(2000);
			System.out.println(pgSrc);
			driver.quit();
			
			
			
			
		}
	}

