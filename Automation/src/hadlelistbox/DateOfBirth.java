package hadlelistbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateOfBirth {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.get("https://www.facebook.com/");
			driver.findElement(By.linkText("creat new account")).click();
			WebElement day = driver.findElement(By.id("day"));
			WebElement month = driver.findElement(By.id("month"));
			WebElement year = driver.findElement(By.id("year"));
			Select s1=new Select(day);
			Select s2=new Select(month);
			Select s3=new Select(year);
			s1.selectByIndex(6);
			s2.selectByValue("7");
			s3.selectByVisibleText("1988");
			
	}

}
