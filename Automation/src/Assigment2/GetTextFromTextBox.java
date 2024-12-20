package Assigment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFromTextBox {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.open source billing.org/en/user/sign-in");
		WebElement email = driver.findElement(By.id("Email"));
		String text=email.getAttribute("value");
		System.out.println(text+"is present in the textbox");
		driver.manage().window().maximize();
		driver.quit();
	}

}
