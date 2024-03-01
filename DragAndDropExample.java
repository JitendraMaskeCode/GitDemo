package Jitendra.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {
	 public static void main(String[] args) throws InterruptedException {
	        // Set the path to the chromedriver executable
	       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Create a new instance of the ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Navigate to the website with drag-and-drop functionality
	        driver.get("https://jqueryui.com/droppable/");

	        // Switch to the iframe containing the draggable and droppable elements
	        driver.switchTo().frame(0);

	        // Locate the draggable element
	        WebElement draggableElement = driver.findElement(By.id("draggable"));

	        // Locate the droppable element
	        WebElement droppableElement = driver.findElement(By.id("droppable"));

	        // Create Actions class for drag-and-drop
	        Actions actions = new Actions(driver);
	        
	        Thread.sleep(1000);
	        // Perform drag-and-drop
	        actions.dragAndDrop(draggableElement, droppableElement).build().perform();
	        Thread.sleep(1000);
	        // Switch back to the default content
	        driver.switchTo().defaultContent();
	        Thread.sleep(1000);
	        // Close the browser
	        //driver.quit();
	    }
}


