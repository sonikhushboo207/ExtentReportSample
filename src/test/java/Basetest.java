import org.openqa.selenium.chrome.ChromeDriver;

public class Basetest {
	public static ChromeDriver driver;
	
	public static void initDriver()
	{
	
	driver= new ChromeDriver();
	System.setProperty("webdriver.driver.chrome", "G:\\ChromeWebDriver\\chromedriver-win64\\chromedriver.exe");
	
	
	
	

}
}
