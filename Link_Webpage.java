package Seleniumprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Webpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> list=driver.findElements(By.tagName("a4559"));
		System.out.print(list.size());
		for(int i=0;i<list.size();i++)
		{
		System.out.print(list.get(i).getText());
		}
		

	}

}
