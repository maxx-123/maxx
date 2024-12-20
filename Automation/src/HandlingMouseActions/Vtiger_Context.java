package HandlingMouseActions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vtiger_Context {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.get("https://www.vtiger.com/");
		WebElement ele = driver.findElement(By.linkText("Company"));
		Actions a = new Actions (driver);Thread.sleep(2);
a.moveToElement(ele);
driver.findElement(By.linkText("Company"));Thread.sleep(2);
driver.findElement(By.linkText("Contact us")).click();
String text = driver.findElement(By.xpath("p[contains[text(),'Bengaluru'/]/../p[2]")).getText();
System.out.println(text);
driver.quit();

		}

}
