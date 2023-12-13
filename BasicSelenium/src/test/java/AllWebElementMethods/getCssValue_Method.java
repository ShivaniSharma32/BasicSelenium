package AllWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getCssValue_Method {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://sso.godaddy.com/");
       WebElement Logo = driver.findElement(By.xpath("//figcaption[contains(text(),'GoDaddy')]"));
       String Logo_Color = Logo.getCssValue("Color");
       System.out.println(Logo_Color);
       String Logo_font = Logo.getCssValue("font");
       System.out.println(Logo_font);

	}

}
