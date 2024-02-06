package Seleniumprogram;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
public class Rightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		

				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.google.com");
				driver.manage().window().maximize();
				WebElement gmail = driver.findElement(By.linkText("Gmail"));
				
				Actions a1 = new Actions(driver);
				a1.contextClick(gmail).perform();
				Robot r1=new Robot();
				r1.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(2000);
				r1.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(2000);
				r1.keyPress(KeyEvent.VK_ENTER);	

			}

		}
	}

}
