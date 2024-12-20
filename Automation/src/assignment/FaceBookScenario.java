package assignment;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookScenario {

public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	a.sendKeys("axyzte.ben08gmail.com"+Keys.CONTROL+"AC");
	driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"V");
	a.clear();
	String button = driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).getAttribute("title");
	
	
	
	

}

	
}
