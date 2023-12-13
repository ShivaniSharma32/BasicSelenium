package AllWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isDisplayed_isSelected_isEnabled_Method {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://sso.godaddy.com/");
        WebElement checkbox_text= driver.findElement(By.xpath("//label[contains(text(),'Keep me signed')]"));
        boolean Displayed = checkbox_text.isDisplayed();
          System.out.println("KeepMeSignedDisplayed : "+ Displayed);
          
          WebElement checkbox = driver.findElement(By.xpath("//input[@id='remember-me']"));
          boolean Selected = checkbox.isSelected();
          System.out.println("KeepMeSignedSelected : "+ Selected);
          
          boolean Enabled = checkbox.isEnabled();
          System.out.println("KeepMeSignedEnabled : "+ Enabled);
          
	}

}
