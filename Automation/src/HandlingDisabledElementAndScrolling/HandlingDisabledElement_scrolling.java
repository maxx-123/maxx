package HandlingDisabledElementAndScrolling;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElement_scrolling {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("file.///c:/user/qsp/desktop/Diabled.html");
		driver.findElement(By.id("t1")).sendKeys("Virat");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementBy Id("t1".value='Anuska');"
	}
}
