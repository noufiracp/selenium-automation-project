package urbanbasepkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class urbanbaseclass {
	public static ChromeDriver driver;
	String baseurl="https://turtle.in/";
	@BeforeTest
	public void setvalues()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	

}
