package assignment;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class AllOptionsInListBox {
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://www.facebook.com/login/");
			driver.findElement(By.linkText("Sign up for Facebook")).click();
			WebElement month = driver.findElement(By.id("month"));//use select class when tag name is made up of select or option
			Select s=new Select(month);
	 List<WebElement> allopt = s.getOptions();
	 for(int i=0;i<allopt.size();i++) {
		 WebElement add = allopt.get(i);
		String text = add.getText();
		System.out.println(text);
		
	 }
		driver.quit()	;
	
			
		
			
		}
}

			
