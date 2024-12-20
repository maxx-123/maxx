package assignment1;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWebPage 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the URL");
		String url = sc.nextLine();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		String expectedUrl=driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		if(url.equals(expectedUrl))
			System.out.println("Test is passed : same URL ");
		else
			System.out.println("Test is passed : not a same URL");
		System.out.println(actualTitle);
		driver.quit();
		
		
	}
}