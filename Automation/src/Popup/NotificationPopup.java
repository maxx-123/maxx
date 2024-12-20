package Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notification","-incognitio","--start-maximized");
		WebDriver driver=new ChromeDriver(opt);Thread.sleep(6000);
		driver.get("https://www.irctc.co.in/nget/train-search");
		
	}

}
