package Drop_Down_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multi_Select_ByUsingSelectClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
	driver.manage().window().maximize();
	
	WebElement dropdown = driver.findElement(By.id("multiselect1"));
	
	Select s = new Select(dropdown);
	s.selectByIndex(0);
	Thread.sleep(2000);
	s.selectByValue("Hyundaix");
	Thread.sleep(3000);
	s.selectByVisibleText("Audi");
	//System.out.println(s.equals("Audi")); will ask with the sir 
	Thread.sleep(2000);
	WebElement First_SelectedText = s.getFirstSelectedOption();
	System.out.println(First_SelectedText.getText());
	Thread.sleep(2000);
	s.deselectByIndex(2);
	Thread.sleep(2000);
	s.deselectAll();
	Thread.sleep(2000);
	
 driver.close();
	}

}
