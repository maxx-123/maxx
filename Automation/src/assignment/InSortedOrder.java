package assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InSortedOrder {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.qspiders.com/");
		WebElement city = driver.findElement(By.id("city"));//use select class when tag name is made up of select or option
		Select s=new Select(city);
		List<String>a1 = new ArrayList<>();
		List<WebElement> allOpt = s.getOptions();
		for(int i=0; i<allOpt.size();i++) {
			WebElement	ele = allOpt.get(i);
			String text = ele.getText();
			a1.add(text);
			}
			Collections.sort(a1);
			for( String text:a1) {
			System.out.println(text);
		}
			
				driver.quit();
			}

		
		


}

