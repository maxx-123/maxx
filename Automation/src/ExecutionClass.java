import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecutionClass {
@Test
public void demo()
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://Localhost/login.do");
DemoLoginPage d=new DemoLoginPage(driver);
driver.login("virat","Anushka");Thread.sleep(5000);
driver.login("admin","manager");
}
}
