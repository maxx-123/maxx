package assignment1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FireFoxScenario 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/downloads/");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_CONTROL);Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_1);Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_MINUS);Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_2);Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_S);Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_A);Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_M);Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_P);Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_L);Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_E);Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);Thread.sleep(2000);
		
	}
}