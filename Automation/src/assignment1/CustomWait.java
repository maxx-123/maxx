package assignment1;
import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class CustomWait 
	{
		public static void main(String[] args)
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Prasad K"+Keys.ENTER);
			for (int i = 0; i < 1000; i++) 
			{
				try 
					{
					driver.findElement(By.xpath("//h3[contains(text(),'Prasad K (@prasad_k_____) ')]")).click();
					break;
					}
				catch (Exception e) 
					{
						System.out.println(i);
					}
			}
		}
	}


