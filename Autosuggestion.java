package Seleniumprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("India");
		Thread.sleep(1000);
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count=list.size();
		
		list.get(count-4).click();
		
		
		

	}

}
