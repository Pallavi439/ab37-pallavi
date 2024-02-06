package Seleniumprogram;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Flightwebsitegobibo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/?utm_source=bing&utm_medium=cpc&utm_campaign=IF-Brand-Ex_Ind&utm_adgroup=IF-Brand-Ex_Ind&utm_term=!SEM!IF!G!Brand-Ex_Ind!RSA!662302050!1329311850401391!!e!goibibo!c!&msclkid=b842adc34cfe10db0de2c80285b7a304");
		driver.manage().window().maximize();


		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		WebElement f_city=driver.findElement(By.xpath("(//p[contains(text(),'Enter city or airport')])[1]"));
		f_city.click();
		WebElement f1_city=driver.findElement(By.xpath("//input[@type='text']"));

		f1_city.sendKeys("B");

		List<WebElement> list_city=driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li"));
		int from_city=list_city.size();
		System.out.println(from_city);
		list_city.get(2).click();

		WebElement t1_city=driver.findElement(By.xpath("//input[@type='text']"));
		//f_city.click();
		t1_city.sendKeys("My");

		List<WebElement> list_city1=driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li"));//Element not interactableexception

		int to_city=list_city1.size();
		System.out.println(to_city);
		list_city1.get(2).click();
		
		
		//date
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		
		WebElement class1=driver.findElement(By.xpath("(//a[text()='Done']//..)[2]"));
		class1.click();
		
//		WebElement radiobtn=driver.findElement(By.xpath("(//span[@class='sc-12foipm-1 ldWNmn'])[3]"));
//		radiobtn.click();
		
//		List<WebElement> radio_btn=driver.findElements(By.xpath("//span[contains(@class,'sc-12foipm-1 ldWNmn')]"));
//	    radio_btn.get(3).click();
	    
	    WebElement searchflight=driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']"));
	    searchflight.click();
		
		

	}

}
