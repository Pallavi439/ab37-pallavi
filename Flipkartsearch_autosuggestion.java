package Seleniumprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartsearch_autosuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//div[@class='_2SmNnR']/input")).sendKeys("Mouse");
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li)"));
		int count=list.size();
		list.get(count-4).click();

	}

}
