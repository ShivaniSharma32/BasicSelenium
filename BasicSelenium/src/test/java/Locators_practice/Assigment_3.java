package Locators_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assigment_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String actualtitle="actiTIME - Login";
		if(actualtitle.equals(title))
		{
			System.out.println("Navigated to Application successfully");
		}
		else
		{
			System.out.println("Naviagtion failed");
		}
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//label[@id='keepLoggedInLabel']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
	    String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		String URL="https://demo.actitime.com/user/submit_tt.do";
		
		if(URL.equals(currentURL))
		{
			System.out.println("Login successfully");
		}
		else
		{
			System.out.println("login failed");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		Thread.sleep(2000);
	    String AfterlogoutURL = driver.getCurrentUrl();
		System.out.println(AfterlogoutURL);
		String URL1="https://demo.actitime.com/login.do";
		
		if(URL1.equals(AfterlogoutURL))
		{
			System.out.println("Logout successfully");
		}
		else
		{
			System.out.println("logout failed");
		}
		Thread.sleep(2000);
	}
	

}
