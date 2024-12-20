package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintSingleLine {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
driver.findElement(By.name("q")).sendKeys("apple iphone 14pro max");
driver.findElement(By.xpath("//button[@type='submit']'")).click();

int c = 1;
for(int i=0;i<c;i++)
{
List<WebElement> brand = driver.findElements(By.xpath("//div[contains(text(),'Apple iphone 14 Pro')]/../../../div[2]/div[2]/div[1]/div[1]"));
int s = brand.size();
c=s;
String name = brand.get(i).getText();
List<WebElement> price = driver.findElements(By.xpath("//div[contains(text(),'Apple iphone 14 Pro')]/../../../div[2]/div[2]/div[1]/div[1]"));
String amount = price.get(i).getText();
System.out.println(name+'='+amount);
}
driver.quit();



}

	
}


