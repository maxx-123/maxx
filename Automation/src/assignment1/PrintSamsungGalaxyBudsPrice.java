package assignment1;

import java.util.Scanner;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class PrintSamsungGalaxyBudsPrice {

		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the URL :");
			String url = sc.nextLine();
			System.out.println("Enter the x-path");
			String xPath = sc.nextLine();
			WebDriver driver = new ChromeDriver();
			driver.get(url);
			String price = driver.findElement(By.xpath(xPath)).getText();
			System.out.println(price);
			driver.quit();
		}

	}


