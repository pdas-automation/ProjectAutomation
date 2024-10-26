package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Launchbrowser {

public static void main(String[]args) {
	 

       WebDriver driver= new FirefoxDriver();  
	//WebDriver driver=new ChromeDriver();
       
 driver.navigate().to("https://www.makemytrip.com/");  
 String title=driver.getTitle();
 System.out.println(title);
driver.navigate().refresh();
	//Thread.sleep(2000);
 driver.close();
}
}