package assignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WithOutDuplicates {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("file:////c:/Users/qsp/Desktop:Multi_select%20dropdown.html");
		WebElement city = driver.findElement(By.id("city"));
		Select s=new Select(city);
		Set<String>hs=new HashSet<>();
		List<WebElement>allOpt=s.getOptions();
		for(int i=0;i<allOpt.size();i++) {
			 WebElement ele = allOpt.get(i);
			 String text = ele.getText();
			 hs.add(text);
		}
		for(String text:hs) {
			System.out.println(text);
			
			
		}
		driver.quit();
		
		
		
		
	}

}
