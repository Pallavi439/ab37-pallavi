package Seleniumprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart_Linktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The number of links is : " + links.size());

		for (int i = 0; i <= links.size() - 1; i++) {
			WebElement a = links.get(i);
			String text_message = a.getText();
			System.out.println(text_message);

	}

	}
}
