package Jitendra.Selenium;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragndrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://jqueryui.com/droppable/");
		//d.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		d.switchTo().frame(0);
		WebElement draggable=d.findElement(By.xpath("//*[@id=\"draggable\"]"));
		Thread.sleep(1000);
	    WebElement droppable=d.findElement(By.xpath("//*[@id=\"droppable\"]"));
	    Thread.sleep(1000);
	    Actions action=new Actions(d);
	    action.dragAndDrop(draggable, droppable).build().perform();
	   d.switchTo().defaultContent();
	    System.out.println("Drag and drop is done");
	    
	    Thread.sleep(5000);
	    
	    d.close();
	
	}

}