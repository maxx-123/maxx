package Assigment2;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class GetTitlewithoutGetTitle {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://fb.com");
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	System.out.println(jse.executeScript("return document, title"));
	String url= (String )jse.executeScript("return document,url");
	System.out.println(url);
	driver.quit();
	
	
}
}
