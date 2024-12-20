package Popup;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vtiger {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://www.vtiger.com/");
			WebElement company=driver.findElement(By.linkText("company"));
			Actions a = new Actions(driver);
a.moveToElement(company).perform();
driver.findElement(By.linkText("Contact Us")).click();
 String text = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]")).getText();
System.out.println(text);
driver.quit();
}
}
