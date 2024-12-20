package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://google.com");
	String title=driver.getTitle();
	System.out.println(title);
	driver.close();
}
}

