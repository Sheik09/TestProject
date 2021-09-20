package Base;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {	
	public static WebDriver driver;
	
	static public  void InitialiseBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\New Drive\\chromedriver.exe");
	       
        driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://arc.emids.com/");
	}
	
	static public void swithtoframe() {
		WebElement se= driver.findElement(By.xpath("//body/iframe"));
		driver.switchTo().frame(se);
	}
	
	static public void closeBrowser() {
		driver.quit();
	}
	
	

  static public void switchtochield() {
	
	String p = driver.getWindowHandle();
    Set<String> sep = driver.getWindowHandles();
    Iterator<String> Iterator = sep.iterator();
    while (Iterator.hasNext()) {
        String child = Iterator.next();

        if (!p.equals(child)) {
            driver.switchTo().window(child);
            driver.findElement(By.xpath("//button[@onclick=\"window.location.href='/Learn/CourseCoverPage/83418'\"]")).click();
            
            driver.switchTo().window(p);
            
                              }
        
                      }
	
       }
}