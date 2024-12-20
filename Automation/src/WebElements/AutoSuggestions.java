package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {
	public static void main(String[] args)throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("chiathra");Thread.sleep(6000);
		List<WebElement> allSugges= driver.findElements(By.xpath("//span[Contains(text(),'chaithra')]"));
		int Count =allSugges.size();
		for(WebElement ele:allSugges) {
			String text=ele.getText();
			System.out.println(text);
		}
		allSugges.get(Count-1).click();
		}
		
	}
