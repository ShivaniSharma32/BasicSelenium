package Mouse_Action_Handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SomeMethodsOfMouseAction_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		Thread.sleep(3000);
		
	
		WebElement trg = driver.findElement(By.xpath("//p[text()='Drop here']"));
		Actions ac= new Actions(driver);
          // ac.dragAndDrop(src, trg).perform();   // drag and drop
		//ac.clickAndHold(src).moveToElement(trg).release().perform();    //clickAndHold
		//ac.clickAndHold(src).release(trg).perform();       //Release
		ac.moveToElement(src).clickAndHold().moveToElement(trg).clickAndHold().release().perform();
		Thread.sleep(3000);
	
		driver.close();

	}

}
