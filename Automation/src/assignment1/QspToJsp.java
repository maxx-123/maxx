package assignment1;
import java.time.Duration;

	import org.jspecify.annotations.Nullable;
	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.Point;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class QspToJsp 
	{
		public static void main(String[] args)
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.qspiders.com/");
			driver.navigate().to("https://jspiders.com/");
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
			String title = driver.getTitle();
			String currentUrl = driver.getCurrentUrl();
			driver.manage().window().fullscreen();
			driver.manage().window().setSize(new Dimension(720, 1080));
			driver.manage().window().setPosition(new Point(100,200));
			Dimension size = driver.manage().window().getSize();
			Point position =driver.manage().window().getPosition();
			String pagesrc = driver.getPageSource();
			driver.manage().window().minimize();
			System.out.println("The size "+size);
			System.out.println("The position "+position);
//			System.out.println("The page source"+pagesrc);
			driver.quit();
		}
	}



