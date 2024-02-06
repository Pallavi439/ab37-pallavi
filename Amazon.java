package Seleniumprogram;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
				EdgeDriver driver = new EdgeDriver();
				driver.get("https://www.amazon.in");
				driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				WebElement e = driver.findElement(By.id("nav-link-accountList"));
				Actions a = new Actions(driver);
				a.moveToElement(e).perform();
				
				WebElement e1 = driver.findElement(By.linkText("Sign in"));
				e1.click();
				driver.findElement(By.id("ap_email")).sendKeys("9970398616");
				driver.findElement(By.id("continue")).click();
				
				driver.findElement(By.id("ap_password")).sendKeys("password");
				driver.findElement(By.id("signInSubmit")).click();
				
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
				WebElement shoes =driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[30]"));
				shoes.click();
				Set<String> selected_shoe =driver.getWindowHandles();
				System.out.println(selected_shoe);
				Iterator<String> pcid=	selected_shoe.iterator();
				String pid=	pcid.next();//parent id alone
				String cid=	pcid.next();//child id alone
				driver.switchTo().window(cid);
				Thread.sleep(3000);
				driver.close();
				
				WebElement Add_Cart = driver.findElement(By.id("add-to-cart-button"));
				Add_Cart.click();
				//Thread.sleep(2000);
				WebElement Proceed_Buy = driver.findElement(By.id("sc-buy-box-ptc-button"));
				Proceed_Buy.click();
				
				//driver.findElement(By.xpath("(//input[@class='a-button-input'])[4]")).click();
				
				WebElement Use_Address = driver.findElement(By.id("shipToThisAddressButton"));
				Use_Address.click();
				
				//Thread.sleep(5000); 
				WebElement Select_Debit = driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']"));
				Select_Debit.click();	
			
				
				//Thread.sleep(2000);
				WebElement Card_Details = driver.findElement(By.linkText("Enter card details"));
				Card_Details.click();
				
				WebElement First_frame =driver.findElement(By.name("ApxSecureIframe"));
				driver.switchTo().frame(First_frame);
				
				
				WebElement Card_no = driver.findElement(By.name("addCreditCardNumber"));
				Card_no.sendKeys("987654324");
				driver.close();
				
				
			}

	}



