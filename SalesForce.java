package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Gopinath");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("S");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("gopin9353@gmail.com");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("GS pvt Ltd");
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("9500339662");
		WebElement jobtitle = driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select text=new Select(jobtitle);
		text.selectByVisibleText("IT Manager");
		WebElement employee = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select value=new Select(employee);
		value.selectByValue("250");
		WebElement country = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select text2=new Select(country);
		text2.selectByVisibleText("India");
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		//driver.close();
	}

}
