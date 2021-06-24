package SeleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyBoardActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kotla\\eclipse-workspace\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://demo.guru99.com/test/newtours/");
		WebElement we = d.findElement(By.xpath("//a[@href = \"http://demo.guru99.com/telecom/index.html\"]"));
		Actions builder = new Actions(d);
		Action a = builder.contextClick().build();
		a.perform();
		
		
		
		
		

	}

}
