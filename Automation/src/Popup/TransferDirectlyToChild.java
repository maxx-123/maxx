package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TransferDirectlyToChild {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		driver.findElement(By.id("browserButton2")).click();
		Set<String> allwidInSet = driver.getWindowHandles();
		List <String>a1 = new ArrayList<>(allwidInSet);
		String wid3 = a1.get(3);
		driver.switchTo().window(wid3);Thread.sleep(7);
		driver.close();
		
	}
	
}
