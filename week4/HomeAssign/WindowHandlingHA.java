package week4.HomeAssign;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingHA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> childWindow = driver.getWindowHandles();
		
		//convert set into list
		List<String> listWindow = new ArrayList<String>(childWindow);
		
		for(int i =0; i<listWindow.size(); i++) {
			String window = listWindow.get(i);
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
		}
		
		driver.findElement(By.xpath("//a[text()='FrenchCustomer']")).click();
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		
		// / Get all window handles after opening the new window
		Set<String> allWindows = driver.getWindowHandles();
		List<String> windowList = new ArrayList<>(allWindows);

		// Switch to the latest opened window (child window)
		driver.switchTo().window(windowList.get(windowList.size() - 1));
		System.out.println("Switched to: " + driver.getTitle());

		
		driver.findElement(By.xpath("//a[text()='FrenchCustomer']")).click();
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println(driver.getTitle());
		
		
		driver.close();
		
		
	}

}
