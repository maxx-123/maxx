package assignment1;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class PracticeOnLocators 
	{
		public static void main(String[] args) 
		{
			//Open the chrome broswer
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///D:/IT/JAVA/Practice%20Pro/PUBG/src/basic/IG1.html");
		}
	}


