package hadlelistbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DOB {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("creat new account")).click();
		WebElement day = driver.findElement(By.id("day"));
		Select s1=new Select(day);Thread.sleep(5000);
		s1.selectByIndex(6);
		WebElement month = driver.findElement(By.id("month"));
		Select s2=new Select(month);Thread.sleep(5000);
		s2.selectByValue("7");
		WebElement year = driver.findElement(By.id("year"));
		Select s3=new Select(year);Thread.sleep(5000);
		s3.selectByVisibleText("1988");
		

		
		
		
	}

}
