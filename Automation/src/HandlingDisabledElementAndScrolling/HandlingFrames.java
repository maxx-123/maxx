package HandlingDisabledElementAndScrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("‪C:\Users\USER\OneDrive\Documents\T2.html");
		driver.findElement(By.id("t1")).sendKeys("virat");
		driver.switchTo().frame(0);
		driver.findElement("t2")).sendKeys("Rohit");
		driver.switchTo().parentframe();Thread.sleep(3000);
		driver.findElement(By.id(("t1")).sendKeys("Kohli");
		driver.switchTo().frame("f1");Thread.sleep(3000);
		driver.findElement((By.id("t2")).sendKeys("sharma")
	}
}
