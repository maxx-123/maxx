package assignment1;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class FaceBook2Assignment {

		public static void main(String[] args)
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.facebook.com/");
			driver.findElement(By.name("login")).submit();
			WebElement errorMessage = driver.findElement(By.xpath("//div[contains(text(),'The email addres')]"));
			String color = errorMessage.getCssValue("color");
			String text = errorMessage.getText();
			WebElement forgetPass = driver.findElement(By.xpath("//div[@id='login_link']//a"));
			Dimension size = forgetPass.getSize();
			String forgetPasLink = forgetPass.getAttribute("href");
			System.out.println(color);
			System.out.println(text);
			System.out.println(size);
			System.out.println(forgetPasLink);
			driver.quit();
		}

	}


