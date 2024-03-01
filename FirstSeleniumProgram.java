package Jitendra.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		String title = d.getTitle();
		System.out.println(title);
		
		if(title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")){
			System.out.println("Title Verified successfully");
		}else {
			System.out.println("Title Not Verified successfully");
		}
		
		d.close();
	}
}
