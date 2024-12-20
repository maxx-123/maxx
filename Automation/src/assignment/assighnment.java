package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assighnment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("apple iphone");Thread.sleep(8000);
		List<WebElement> allSuggs=driver.findElements(By.xpath("//ul/li"));
		int s=allSuggs.size();
		System.out.println(s);
		for(WebElement a:allSuggs)
		{
			System.out.println(a.getText());
		}
		
	}

}
