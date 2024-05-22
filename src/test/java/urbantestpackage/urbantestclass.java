package urbantestpackage;

import org.testng.annotations.Test;

import urbanbasepkg.urbanbaseclass;
import urbanexcelutilitiespkg.urbanexcelutilityclass;
import urbanpagepackage.urbanpageclass;

public class urbantestclass extends urbanbaseclass {
	@Test(priority=1)     //click on the login icon
	public void lognicon() throws InterruptedException   //clicking the login icon
	{
		
		urbanpageclass ob = new urbanpageclass(driver);

		 ob.iconclick();
			Thread.sleep(2000);
	}

	
	
	
@Test(priority = 2)     //login to site
	public void logintosite()throws Exception
	{

	urbanpageclass ob = new urbanpageclass(driver);

        String Excel = "/Users/cpnoufira/Desktop/urbanmonkey.xlsx";

        String Sheet = "Sheet1";

        int rowcount = urbanexcelutilityclass.getrowcount(Excel, Sheet);
        
        for (int i=1;i<=rowcount;i++)

        {
                    String Username=urbanexcelutilityclass.getcellvalue(Excel, Sheet, i, 0);
                    System.out.println("username---"+Username);
                    String Password=urbanexcelutilityclass.getcellvalue(Excel, Sheet, i, 1);
                    System.out.println("password---"+Password);
                    
                  
                   ob.valuepass(Username, Password);
                   
            	 Thread.sleep(1000);

                 ob.loginclick();
                                
        }
	}
@Test(priority = 3)  //add products to cart
public void pdctclick() throws InterruptedException
{
	urbanpageclass ob = new urbanpageclass(driver);
	ob.saleclick();
	Thread.sleep(3000);
	driver.navigate().to("https://turtle.in/collections/sale-2");     //back to sale page
	
}
@Test(priority=4)    //add second pdt to cart
public void secondpdtclick() throws InterruptedException
{
	urbanpageclass ob = new urbanpageclass(driver);
	ob.secondpdtclick();
	Thread.sleep(3000);
}

@Test(priority=5)   //add personel details and checkout
public void checkoutclickk() throws InterruptedException
{
	urbanpageclass ob = new urbanpageclass(driver);
	ob.checkoutclick();
	ob.personel();
	Thread.sleep(3000);
	
	
}
@Test(priority=6)   //back to home page
public void backtohome()
{
	urbanpageclass ob = new urbanpageclass(driver);
	ob.back();
}
@Test(priority=7)   //logout
public void logout()
{
	urbanpageclass ob = new urbanpageclass(driver);
	ob.logoutclick();
}
}


	


