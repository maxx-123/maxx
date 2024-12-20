package assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWebPag {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("SQL");Thread.sleep(2000);
		List<WebElement> element = driver.findElements(By.xpath("//span[contains(text(),'sql')]"));Thread.sleep(2000);
//		for(WebElement el : element)
//		{
//			System.out.println(el.getText());
//		}
		for(int i=0; i<element.size(); i++)
		{
			String text = element.get(i).getText();
			System.out.println(text);
		}
		driver.quit();
	}

}