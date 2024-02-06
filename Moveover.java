package Seleniumprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Moveover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions ac=new Actions(driver);
		//List<WebElement> lang=driver.findElements(By.xpath(""));
		ac.moveToElement(driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']/span/span[2]"))).build().perform();
		
		

	}

}
