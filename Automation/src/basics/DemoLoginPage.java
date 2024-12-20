package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoLoginPage {
	@FindBy(id="username")
	private WebElement unTbx;
	@FindBy(name="pwd")
	private WebElement pwdTbx;
	@FindBy(xpath("//div[text()='Login ')]");
	private WebElement LoginBtn;
	DemoLoginPage(WebDriver driver){
		unTbx=driver.findElement(By.id("username"));
		pwdTbx=driver.findElement(By.name("pwd"));
		LoginBtn=driver.findElement(By.xpath("//div[text()='Login ')]");
	}
				

	public void Login(String un,String pwd) {
		unTbx.sendKeys(un);
		pwdTbx.sendKeys(pwd);
		LoginBtn.click();
	}

	}
	
