package assignment1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelectAndDeselect 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///D:/IT/Selenium/Dropdown.html");
		WebElement city = driver.findElement(By.id("city"));
		Select s = new Select(city);
		List<WebElement> options = s.getOptions();
		int count = options.size();
		for(int i=0; i<count; i++)
		{
			s.selectByIndex(i);Thread.sleep(500);
		}
		for(int i=count-1; i>=0; i--)
		{
			s.deselectByIndex(i);Thread.sleep(500);
		}
		for(WebElement ele : options)
		{
			String opt = ele.getText();
			s.selectByVisibleText(opt);
		}
		for(WebElement ele1 : options)
		{
			String value = ele1.getAttribute("value");
			s.deselectByValue(value);
		}
	}
}
