import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;

public class DemoLoginPage {
private WebElement unTbx;
private WebElement pwdTbx;
private WebElement LoginBtn;
DemoLoginPage(WebDriver driver){
	unTbx=driver.findElement(By.id("username"));
	pwdTbx=driver.findElement(By.name("pwd"));
	LoginBtn=driver.findElement(By.xpath("//div[text()='Login ')"]");
}
public void Login(String un,String pwd) {
	unTbx.sendKeys(un);
	pwdTbx.sendKeys(pwd);
	LoginBtn.click();
}

}
