package HandlingMouseActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.context.Context;

public class HandlingRightClick {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://en-gb.facebook.com/r.php");
	 WebElement ele = driver.findElement(By.linkText("Sign Up"));
	Actions a = new Actions (driver);Thread.sleep(5);
	a.contextClick(ele).perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_W);
	}
}
