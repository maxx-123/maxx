package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("Chaithrap@321gmail.com"+Keys.CONTROL+"AC");Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"V");   
	}


}