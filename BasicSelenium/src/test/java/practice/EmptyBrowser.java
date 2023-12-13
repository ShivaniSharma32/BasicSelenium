package practice;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;;
public class EmptyBrowser {

	public static void main(String[] args) {
		
		//Case-1
		
/*	String key = "webdriver.chrome.driver";
	String value = "./chromedriver.exe";
	System.setProperty(key, value);
	 WebDriver driver = new ChromeDriver();*/
		
		
		//case-2
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		
		//launcing empty Internet Explorer
		/*WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver();*/
		
		//launcing empty Firefox
		/*WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();*/
		
		//launching empty edge 
		/*WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver()*/;
	}

}
