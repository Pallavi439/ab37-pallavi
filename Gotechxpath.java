package Seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gotechxpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/x-path/#1");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("windows.scrollby, (0,250)");
        Thread.sleep(1000);
		WebElement product=driver.findElement(By.xpath("//nav[@class='tree-nav default']/ul/li/span"));
		product.click();
		
		
		
	}

}
