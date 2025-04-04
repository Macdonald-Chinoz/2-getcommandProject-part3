package part3GetCommands;

import org.openqa.selenium.WebDriver;//this lib is for when you launch WebDriver
import org.openqa.selenium.chrome.ChromeDriver;//this lib is when you launch Chrome directly
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;

/*
 * The things to accomplish here are:
 * 1-How to launch browsers in webDriver
 * 2-How to open URL
 * 3-How to capture title of the page
 * 4-how to capture page-source of the page
 */
public class LaunchBrowser {

	public static void main(String[] args) {
		
		//1-How to launch/start browsers in webDriver
		//Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver-win64\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver(); //this way launches it directly
		WebDriver driver=new ChromeDriver();//alternate way to launch

		//2-How to open URL
		//call driver the call get meta
		driver.get("https:frontend.nopcommerce.com/");//get meta is the one that allows travel to website 
		
		//3-How to capture title of the page
		System.out.println("Title of webpage is:"+driver.getTitle());
		
		System.out.println("Current URL of webpage is:"+driver.getCurrentUrl());
		
		//4-how to capture page-source of the page
		System.out.println(driver.getPageSource());
		
		//how to launch in other browsers//change location and it can launch
		//FireFox
		//System.setProperty("webdriver.gecko.driver","C:\\Automation\\chromedriver-win64\\chromedriver.exe");
		//WebDriver driver=new FirefoxDriver();//FirefoxDriver driver=new FirefoxDriver();//alt way
		//driver.get("https:frontend.nopcommerce.com/");
		
		//Edge Browser
		//System.setProperty("webdriver.edge.driver","C:\\Automation\\chromedriver-win64\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();//EdgeDriver driver=new EdgeDriver();//alt way
		//driver.get("https:frontend.nopcommerce.com/");
		
		/* Using Web-Driver Manager */
		/* when coding on Maven Project
		 * import Web-Driver Manager dependency code from mvn depository site and paste in pom.xml
		 * Now you can you use the drivers without specifying locations/path
		 * such as :
		 * Chrome Browser
		 * WebDriverManager.chromedriver().setup();
		 * WebDriver driver=new ChromeDriver();
		 * driver.get("https:frontend.nopcommerce.com/");
		 * 
		 * Firefox Browser
		 * WebDriverManager.firefoxdriver().setup();
		 * WebDriver driver=new FirefoxDriver();
		 * driver.get("https:frontend.nopcommerce.com/");
		 * 
		 * Edge Browser
		 * WebDriverManager.edgedriver().setup();
		 * WebDriver driver=new EdgeDriver();
		 * driver.get("https:frontend.nopcommerce.com/");
		 *  */
		
	}
	
}
