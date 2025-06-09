package week4.HomeAssign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ajio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ChromeOptions options = new ChromeOptions();
//        options.addArguments("--incognito");
//        ChromeDriver driver = new ChromeDriver(options);
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64)");

        ChromeDriver driver = new ChromeDriver(options);


		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		
	}

}
