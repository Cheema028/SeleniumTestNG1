
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;  

public class LaunchChrome {
	
	WebDriver driver;
	
    @BeforeMethod
    public void setUp(){
        
     System.setProperty("webdriver.chrome.driver", "D:\\Tools\\Selenium\\chromedriver.exe");  
         
     WebDriver driver=new ChromeDriver();  
       
     driver.navigate().to("https://www.google.com/");  

}
    
    @Test
	public void googleTitleTest() {
	
	 String title = driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals(title,"Google");
	
}

    @AfterMethod 
    public void tearDown() {
	
	driver.quit();
	
	
	
}


}
