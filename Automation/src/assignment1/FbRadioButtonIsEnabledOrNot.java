package assignment1;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class FbRadioButtonIsEnabledOrNot {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");Thread.sleep(2000);
			driver.findElement(By.xpath("//font[contains(text(),'Create a new account')]")).click();
			boolean radioButton = driver.findElement(By.id("sex")).isSelected();
			if(radioButton)
			{
				System.out.println("Test is passed radio button is selected ");
			}
			else
				System.out.println("Test is failed Radio button is not selected");
		}

	}

