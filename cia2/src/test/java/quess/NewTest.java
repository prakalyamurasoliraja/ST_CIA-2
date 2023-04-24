package quess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	@Test
	public static void f() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://www.trivago.in/");
		driver.manage().window().maximize();
		WebElement location=driver.findElement(By.xpath("//*[@id=\"input-auto-complete\"]"));
    	location.click();
    	WebElement option=driver.findElement(By.xpath("//*[@id=\"suggestion-list\"]/ul/li[2]/div/div"));
    	option.click();
    	Thread.sleep(2000);
    	WebElement cin=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[6]/time"));
    	cin.click();
    	Thread.sleep(2000);
    	WebElement cout=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[12]/time"));
    	cout.click();
    	Thread.sleep(2000);
    	WebElement guest=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div/button[2]/span/span[1]"));
    	guest.click();
    	Thread.sleep(2000);
    	WebElement pet=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/div[2]"));
    	pet.click();
    	Thread.sleep(2000);
    	WebElement apply=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[2]/div/button[2]"));
    	apply.click();
//  	Thread.sleep(20000);
  	
  //package quess;
  	//
  	//import org.openqa.selenium.By;
  	//import org.openqa.selenium.WebDriver;
  	//import org.openqa.selenium.WebElement;
  	//import org.openqa.selenium.chrome.ChromeDriver;
  	//import org.openqa.selenium.chrome.ChromeOptions;
  	//import org.openqa.selenium.support.ui.Select;
  	//import org.testng.annotations.Test;
  	//
  	//import io.github.bonigarcia.wdm.WebDriverManager;
  	//
  	//public class que2 {
  	//  @Test
//  		  public void f() throws InterruptedException
//  			{
//  			WebDriverManager.chromedriver().setup();
//  			ChromeOptions co=new ChromeOptions();
//  			co.addArguments("--remote-allow-origins");
  	//
//  			WebDriver driver=new ChromeDriver();
//  			driver.get("https://www.trivago.in/en-IN/srl/hotels-pondicherry-india?search=132-7;200-64948;dr-20230506-20230607;rc-1-2");
//  			Thread.sleep(1000);
  	//
//  			WebElement fil=driver.findElement(By.xpath("//*[@id=\"sorting-selector\"]"));
//  			fil.click();
  	//
//  			Select se=new Select(fil);
//  			se.selectByIndex(0);
//  			WebElement product1=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[1]/section/h2/button/span"));
//  			System.out.println("Product name: "+product1.getText());
  	//
//  			WebElement fil1=driver.findElement(By.xpath("//*[@id=\\\"sorting-selector\\\"]"));
//  			fil1.click();
//  			Thread.sleep(1000);
//  			Select se1=new Select(fil1);
//  			se1.selectByIndex(1);
//  			WebElement product2=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[1]/section/h2/button/span"));
//  			System.out.println("Product name: "+product2.getText());
//  			Thread.sleep(1000);
  	//
//  			WebElement fil2=driver.findElement(By.xpath("//*[@id=\\\"sorting-selector\\\"]"));
//  			fil2.click();
//  			Thread.sleep(1000);
//  			Select se2=new Select(fil2);
//  			se2.selectByIndex(2);
//  			WebElement product3=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[1]/section/h2/button/span"));
//  			System.out.println("Product price: "+product3.getText());
//  			Thread.sleep(1000);
  	//
//  			WebElement fil3=driver.findElement(By.xpath("//*[@id=\\\"sorting-selector\\\"]"));
//  			fil3.click();
//  			Thread.sleep(1000);
//  			Select se3=new Select(fil3);
//  			se3.selectByIndex(3);
//  			WebElement product4=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[1]/section/h2/button/span"));
//  			System.out.println("Product price: "+product4.getText()); 
//  			   
//  			}
  	//  }

  	
  	
  //package quess;
  	//
  	//import java.util.List;
  	//
  	//import org.openqa.selenium.By;
  	//import org.openqa.selenium.WebDriver;
  	//import org.openqa.selenium.WebElement;
  	//import org.openqa.selenium.chrome.ChromeDriver;
  	//import org.openqa.selenium.chrome.ChromeOptions;
  	//import org.testng.annotations.Test;
  	//
  	//import io.github.bonigarcia.wdm.WebDriverManager;
  	//
  	//public class que3 {
  	//  @Test
  	//  public void f() {
//  		  WebDriverManager.chromedriver().setup();
//  		  ChromeOptions co = new ChromeOptions();
//  		  co.addArguments("==remote=allow=origins=*");
//  		  WebDriver driver= new ChromeDriver(co);
//  		  driver.get("https://www.trivago.in/en-IN/srl/cheap-hotels-pondicherry-india?search=200-64948;300-254;300-658;dr-20230509-20230510;so-4");
//  		  driver.manage().window().maximize();
//  		  
//  			List<WebElement> li =  driver.findElements(By.xpath("//*[@class=\"a-size-medium a-color-base a-text-normal\"]"));
//  			for(WebElement l:li)
//  			System.out.println(l.getText()+" ");
//  		  
//  		  WebElement viewdeal =driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[2]/div[1]/div/div[2]/div[2]/button"));
//  		  viewdeal.click();
//  		  
//  		  WebElement priceofhostel=driver.findElement(By.xpath("//*[@id=\"Layer_1\"]/g[2]/polygon"));
//  		       priceofhostel.click();
//  		  
//  		  WebElement  name1=driver.findElement(By.xpath("//*[@id=\"topOfPage\"]/div[6]/div[2]/div/room-rate-list/room-rate-item[1]/div/div/div/div[2]/div/div[2]/div[1]/app-rate-price/div/div[3]/span"));
//  		  System.out.println(name1.getText());
//  		  
//  		  WebElement fil=driver.findElement(By.xpath("//*[@id=\"topOfPage\"]/div[6]/div[2]/div/room-rate-list/room-rate-item[1]/div/div/div/div[2]/div/div[2]/div[2]/button"));
//  			fil.click();
//  			
//  			WebElement select=driver.findElement(By.xpath("//*[@id=\"topOfPage\"]/div[6]/div[2]/div/room-rate-list/room-rate-item[1]/div/app-cash-free-rates-drawer/div/div[1]/app-rate-card[1]/div/div[2]/div[2]/app-select-button/button"));
//  			select.click();
//  			
//  			driver.get("https://www.holidayinn.com/hotels/us/en/pay/payment");
//  		  
//  		 
  	//  }
  	//}

}
  }
