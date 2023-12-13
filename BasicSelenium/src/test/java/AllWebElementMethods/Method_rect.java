package AllWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Method_rect {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://sso.godaddy.com/");
        WebElement SignInButton = driver.findElement(By.xpath("//button[@id='submitBtn']"));
        Rectangle Rect = SignInButton.getRect();
       
        System.out.println(Rect.getHeight());
        System.out.println(Rect.getWidth());
        System.out.println(Rect.getX());
        System.out.println(Rect.getY());
        Thread.sleep(2000);
        driver.close();
        

	}

}
