package assignment1;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOnlyDuplicateCIty {
//WAS to print only duplicate in city dropdown
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///D:/IT/Selenium/Dropdown.html");
		WebElement city_drop = driver.findElement(By.id("city"));
		Select s = new Select(city_drop);
		List<WebElement> options = s.getOptions();
		//has set to store unique values
		HashSet<String> set1 = new HashSet<>();
		//has set to stor duplicate values
		HashSet<String> duplicateSet = new HashSet<>();
		for(WebElement el : options)
		{
			String txt = el.getText();
			//if element is not added to collection consider as duplicate
			if(!set1.add(txt))
			{
				//duplicate element will be added to duplicate set
				duplicateSet.add(txt);
			}
		}
		System.out.println(duplicateSet);
		driver.quit();
		
	}

}
