package assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWebpageDisplayorNot {
 
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		if("https://www.google.com".equals(driver.getCurrentUrl()))
		{
			System.out.println("Test is passed");
		}
		
	}
}

