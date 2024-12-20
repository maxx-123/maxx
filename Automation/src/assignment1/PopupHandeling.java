package assignment1;
import java.time.Duration;
import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
public class PopupHandeling 
	
   public static void main(String[] args){
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demo.automationtesting.in/Alerts.html");
			driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
			driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
			Alert alert = driver.switchTo().alert();
			if(alert.getText().contains("cancel"))
			{
				System.out.println("Yes it is present");
			}
			else
				System.out.println("It is not present");
			driver.switchTo().alert().dismiss();
			driver.quit();
		}


}
