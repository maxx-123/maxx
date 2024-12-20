package ScrollBar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.bbc.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0,3000)");Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,2000)");
		
	}	

}
