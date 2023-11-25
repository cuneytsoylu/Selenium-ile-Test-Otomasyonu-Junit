package Ders03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Assertios {
    WebDriver driver;
    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.youtube.com");

    }

    @After

    public void tearDown() {
        // driver.quit();
    }
    //https://www.youtube.com adresine gidin
    //Asagidadki adlari lullanarak 4 test methou olusturun ve gerekli testleri yapin
    //titleTest => Sayfa basliginin "YouTube" oldugunu test edin
    //imageTest => yotube resminin goruntulendigini test edin
    //SearchBox in erisilebilir oldugunu test edin
    //wrongTitleTest => Sayfa basliginin "youtube" olmadigini test edin
    @Test
    public void titleTest() {
        String actualTitle=driver.getTitle();
        String expectedTitle="YouTube";
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    @Test
    public void imageTest() {
        WebElement icon= driver.findElement(By.xpath("(//*[@class='yt-spec-icon-shape'])[5]"));
        Assert.assertTrue(icon.isDisplayed());
    }

    @Test
    public void searchBoxTest() {
        WebElement searcbox= driver.findElement(By.xpath("(//*[@id='search'])[2]"));
        Assert.assertTrue(searcbox.isEnabled());
    }

    @Test
    public void wrongTitleTest() {
        String actualTitle=driver.getTitle();
        String expectedTitle="youtube";
        Assert.assertFalse(actualTitle.contains(expectedTitle));
    }
}
