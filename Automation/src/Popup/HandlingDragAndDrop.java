package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		driver.findElement(By.xpath("//h1[text()='Block 1']"));
		driver.findElement(By.xpath("//h1[text()='Block 2']"));
		driver.findElement(By.id("coloumn-3"));Thread.sleep(6);
		WebElement drag1=driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement drag2=driver.findElement(By.xpath("//h1[text()='Block 2']"));
		WebElement drop1=driver.findElement(By.id("coloumn-3"));
		Actions a = new Actions(driver);
		a.dragAndDrop(drag1,drop1).perform();Thread.sleep(6);
		a.clickAndHold(drag2).pause(2000).moveToElement(drop1).release().perform();

	}
	

}
