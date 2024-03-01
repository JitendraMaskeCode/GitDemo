package Jitendra.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://www.deltadental.com/");
		WebDriverWait ww= new WebDriverWait(d, Duration.ofSeconds(5));
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//d.manage().window().maximize();
		//ww.until(ExpectedConditions.visibilityOfElementLocated("/html/body/section[1]/div/div/div[1]/header/div[2]/div/div/div[1]/div/nav/ul/li[2]/a")));
		

	}

}
