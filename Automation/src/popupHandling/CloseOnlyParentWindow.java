package popupHandling;

import java.time.Duration;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyParentWindow {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allWid = driver.getWindowHandles();
		String pwid = driver.getWindowHandle();
		for (String wid : allWid) 
		{
			driver.switchTo().window(wid);
			@Nullable
			String title = driver.getTitle();
			if(title.contains("Indeed"))
			{
				driver.close();
			}
		}
	}

}
