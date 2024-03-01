package Jitendra.Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.deltadental.com/");
		d.manage().window().maximize();
		Thread.sleep(5000);
		JavascriptExecutor j= (JavascriptExecutor)d;
		j.executeScript("window.scrollBy(0,2000)");
		
		//j.executeScript("arguments[0].scrollIntoView(true);",element);

	}

}
