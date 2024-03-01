package Jitendra.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com/");
		//d.switchTo().frame(0);
		WebElement we=d.findElement(By.xpath("//*[@id=\"email\"]"));
		
		Actions a= new Actions(d);
		a.contextClick(we).build().perform();
		a.doubleClick();
		
	}
}
