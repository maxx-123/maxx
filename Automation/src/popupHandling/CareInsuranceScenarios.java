package popupHandling;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsuranceScenarios
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.careinsurance.com/");
		driver.findElement(By.id("renew_nav")).click();
		Set<String> allTab = driver.getWindowHandles();
		 Iterator<String> i = allTab.iterator();
		 while(i.hasNext())
		 {
			 driver.switchTo().window(i.next());
			 if(driver.getTitle().contains("Policy"))
			 {
				 driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("123");
				 driver.findElement(By.id("dob")).click();
				 WebElement dropMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
				 Select s = new Select(dropMonth);
				 s.selectByIndex(5);
				 WebElement dropYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
				 Select s1 = new Select(dropYear);
				 s1.selectByValue("1999");
				 driver.findElement(By.linkText("22")).click();
				 driver.findElement(By.id("alternative_number")).sendKeys("9876543210");
				 driver.findElement(By.id("renew_policy_submit")).click();
				 WebElement errMsg = driver.findElement(By.id("policynumberError"));
				 boolean msg = errMsg.isDisplayed();
				 if(msg)
				 {
					 System.out.println("Error message is displayed and the message is"+" \""+errMsg.getText()+"\"");
				 }
				 else
				 {
					 System.out.println("Error message is not displayed");
				 }
				 driver.quit();
			 }
		 }
	}
}
