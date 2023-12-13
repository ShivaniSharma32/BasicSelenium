
// All Webdriver Methods -------

package practice;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;

import io.github.bonigarcia.wdm.WebDriverManager;;
public class WebDriverMethods {


	public static void main(String[] args) throws InterruptedException {

		//Method 1- get url
	/*WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");*/
		
		// Method 2- get title
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String title = driver.getTitle();
		System.out.println(title);*/
		
		
	//Method 3- getCurrentUrl
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//Mehtod 4- getPagesource
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String source = driver.getPageSource();
		System.out.println(source);*/
		
		//Method 5- manage
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
	    Options opt = driver.manage();
		Window win = opt.window();
		win.maximize();
		
	OR
		//Another way to call manage method--
		
		/*driver.manage().window().maximize();*/
		
	// for minimize --(only visible in latest version of selenium)
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
	    Options opt = driver.manage();
		Window win = opt.window();
		win.minimize(); (for latest version)*/
		
		//Method 6- close and quit
		/*driver.close();
		driver.quit();*/
		
		//Method 7- navigate
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();*/
		
		// Fullscreen 
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().fullscreen();*/
		
		
		
		

	}

}
