package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class TestBaseBeforeAfter {

   protected WebDriver driver;
protected String tarih;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

LocalDateTime date=LocalDateTime.now();
DateTimeFormatter formatter=DateTimeFormatter.ofPattern("YYYYMMDDHHmmss");
tarih=date.format(formatter);


    }
    @After
    public void tearDown(){
       // driver.quit();
    }

}
