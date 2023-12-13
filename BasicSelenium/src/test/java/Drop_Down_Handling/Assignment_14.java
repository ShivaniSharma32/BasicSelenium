package Drop_Down_Handling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_14 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	WebDriver driver	=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("admin");
	driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("manager");
	driver.findElement(By.cssSelector("[for='keepLoggedInCheckBox']")).click();
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	
	driver.findElement(By.xpath("//div[contains(@class,'popup_menu_button popup_menu_button_setting')]")).click();
	//driver.findElement(By.xpath("//div[@class='menuTable']/div[2]")).click();......use this xpath as well.
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[contains(text(),'Manage system')]/..")).click();
	
	Thread.sleep(2000);
	WebElement dropdown = driver.findElement(By.id("userGroupNamingCodeSelect"));
	Select s = new Select(dropdown);
	System.out.println(s.isMultiple());
	Thread.sleep(2000);
	s.selectByValue("17");
	
	List<WebElement> options = s.getOptions();
	for(WebElement wb:options)
	{
		System.out.println(wb.getText());
	}
	
	Thread.sleep(2000);
	driver.findElement(By.id("logoutLink")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("DiscardChangesButton")).click();
	Thread.sleep(2000);
	driver.close();

	}

}
/**/