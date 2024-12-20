package assignment1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbRadioSelectedOrNot {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement dayB = driver.findElement(By.id("day"));
		dayB.sendKeys("12"+Keys.ENTER);
		boolean radioSoN = dayB.isSelected();
		if(radioSoN)
		{
			System.out.println("radio button is selected ");
		}
		else
		{
			System.out.println("Radio button is not selected");
		}
		
	}

}

