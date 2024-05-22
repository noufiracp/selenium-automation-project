package urbanpagepackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class urbanpageclass {
	ChromeDriver driver;


	@FindBy(xpath="//*[@id=\"SiteHeader\"]/div[1]/div/div[3]/div/div/a[1]")
	WebElement loginicon;
	 
@FindBy(xpath="//*[@id=\"CustomerEmail\"]")
	 WebElement email;
	  
	@FindBy(xpath="//*[@id=\"CustomerPassword\"]")
	  WebElement password;
	
	@FindBy(xpath="//*[@id=\"customer_login\"]/p[1]/button")
	WebElement loginbutton;
	
	@FindBy(xpath = "//*[@id=\"SiteHeader\"]/div[1]/div/div[2]/ul/li[1]/a")
	WebElement sale;
	
	
	
	
@FindBy(xpath="//*[@id=\"CollectionAjaxContent\"]/div/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/div/a/div[1]/div[3]/img")
	WebElement firstproduct;

@FindBy(xpath="//*[@id=\"ProductSelect-template--16826906214656__main-8248688509184-option-0\"]/div[4]/label")
WebElement firstsize;

@FindBy(xpath="//*[@id=\"CollectionAjaxContent\"]/div/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div/a/div[1]/div[3]/img")
WebElement secondpdt;

@FindBy(xpath="//*[@id=\"ProductSelect-template--16826906214656__main-8246980673792-option-0\"]/div[3]/label")
WebElement secondpdtsize;

@FindBy(xpath="//*[@id=\"AddToCartForm-template--16826906214656__main-8246980673792\"]/button/span")
WebElement secondadd;
	
	@FindBy(xpath="//*[@id=\"AddToCartForm-template--16826906214656__main-8248688509184\"]/button")
	WebElement addtocart;
	
	
	
	@FindBy(xpath="//*[@id=\"SiteHeader\"]/div[1]/div/div[3]/div/div/a[2]/span/svg")
	WebElement carticon;
	
@FindBy(xpath="//*[@id=\"CartDrawerForm\"]/div[2]/div[3]/button")
WebElement checkout;

@FindBy(xpath="//*[@id=\"shipping-address1\"]")
WebElement address;

@FindBy(xpath="//*[@id=\"TextField2\"]")
WebElement apartment;

@FindBy(xpath="//*[@id=\"TextField3\"]")
WebElement city;

@FindBy(xpath="//*[@id=\"Select1\"]")
WebElement statedropdown;

@FindBy(xpath="//*[@id=\"TextField4\"]")
WebElement pincode;

@FindBy(xpath="//*[@id=\"TextField5\"]")
WebElement phone;

@FindBy(xpath="//*[@id=\"MainContent\"]/div[3]/div/div[1]/div[2]/span[6]/span[2]")
WebElement logout;
	
	public urbanpageclass(ChromeDriver driver)
	{
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
	}
	
	public void iconclick()
	{
		loginicon.click();
	}
public void valuepass(String eml,String pswd)
	{
		
		email.sendKeys(eml);
		password.sendKeys(pswd);
		
		}
	public void loginclick()
	{
		loginbutton.click();
	}
	public void saleclick() throws InterruptedException
	{
		sale.click();
	firstproduct.click();
		firstsize.click();
	addtocart.click();
		
		Thread.sleep(2000);

	}
	public void secondpdtclick()
	{
		secondpdt.click();
		secondpdtsize.click();
		secondadd.click();
	}
	public void carticonclick() throws InterruptedException
	{
		carticon.click();
		Thread.sleep(3000);
	}
	public void checkoutclick()
	{
		checkout.click();
	}
	public void personel()
	{
		address.sendKeys("abcdefgh");
		apartment.sendKeys("manjooran ");
		city.sendKeys("kochi");
		Select state=new Select(statedropdown);
		state.selectByValue("KL");
		pincode.sendKeys("682030");
		phone.sendKeys("9878787878");
	}
	public void back()
	{
		driver.navigate().to("https://turtle.in/");
	}
	public void logoutclick()
	{
		loginicon.click();
		logout.click();
		
	}

}
	
