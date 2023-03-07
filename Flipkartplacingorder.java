package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartplacingorder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\chromepath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("ipad");
		driver.findElement( By.xpath("//button[@type='submit']")).click();
		
			Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@title=\"Tablets with Call Facility\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[text()='APPLE iPad (9th Gen) 64 GB ROM 10.2 inch with Wi-Fi Only (Space Grey)']")).click();
		Thread.sleep(6000);

		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);

		driver.findElement(By.xpath("(//form//button)[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("gurunathvinod24@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[text()='CONTINUE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("1212");
		}

		
		
		
		
		
	}
	}

}
