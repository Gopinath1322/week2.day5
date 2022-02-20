package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opencart {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("Gopi1324");
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Gopinath");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("s");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("gopin9353@gmail.com");
		WebElement country = driver.findElement(By.xpath("//select[@id='input-country']"));
		Select text=new Select(country);
		text.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("13242211");
		
	}

}
