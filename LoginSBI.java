package Seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSBI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
			driver.manage().window().maximize();
			WebElement login = driver.findElement(By.xpath("(//a[.='CONTINUE TO LOGIN'])[1]"));
			login.click();

	}

}}
