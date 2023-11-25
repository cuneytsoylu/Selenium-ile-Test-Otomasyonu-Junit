package Ders02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_BeforeClassAfterClass {
   static WebDriver driver;
    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterClass
    public static void tearDown() {
       // driver.quit();
    }


    @Test
    public void test() {
        //amazon sayfasina gidelim
        driver.get("https://www.amazon.com.tr");
    }
    @Test
    public void Test1() {
        //facebook sayfasina gidelim
        driver.get("https://www.facebook.com");

    }
}
