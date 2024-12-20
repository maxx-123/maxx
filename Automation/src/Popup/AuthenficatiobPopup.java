package Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenficatiobPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();Thread.sleep(6000);
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
