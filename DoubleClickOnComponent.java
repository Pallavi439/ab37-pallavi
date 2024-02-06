package Seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickOnComponent 
{
	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement e1=driver.findElement(By.linkText("Mobiles"));
		Actions a1=new Actions(driver);
		a1.doubleClick(e1).perform();

		
	}

}