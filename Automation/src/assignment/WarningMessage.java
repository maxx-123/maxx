package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarningMessage {
	public static void main(String[] args, WebElement fogotten) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");Thread.sleep(7000);
		driver.findElement(By.name("login")).click();Thread.sleep(5000);
		WebElement warning=driver.findElement(By.xpath("//div [contains(text(),'The email address']"));
	    String message=warning.getText();
		String colour=warning.getCssValue("color");
		System.out.println("warning message:"+message);
		System.out.println("color of warning message:"+ colour );
		WebElement forgotten=driver.findElement(By.linkText("Forgotten password"));
		System.out.println("Url of forgotten password:+urlOfForgottenPwd");
		String fontSize = fogotten.getCssValue("font-size");
	  System.out.println("font size of forgotten password:"+fontSize);
		
	}
}
