package Ders04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WindowHandlePractice {
    WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @After
    public void tearDown() {
        // driver.quit();
    }

    @Test
    public void windowHandleTest() throws InterruptedException {
        //1- Amazon Sayfasina girelim
        driver.get("https://www.amazon.com.tr/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='sp-cc-rejectall-link']")).click();
        String amazonWindowHandle= driver.getWindowHandle();
        System.out.println(amazonWindowHandle);
        //2- Url'nin amazon içerdiğini test edelim
        String actualURL=driver.getCurrentUrl();
        String expectedURL="amazon";
        Assert.assertTrue(actualURL.contains(expectedURL));
        //3- Yeni bir pencere açıp bestbuy anasayfasına gidelim.(https://www.bestbuy.com)
        Thread.sleep(1000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.bestbuy.com");
        String bestBuyWindowHandle= driver.getWindowHandle();
        //4- title'in Best Buy içerdiğini test edelim
        String actualTitle=driver.getTitle();
        String expectedTitle="Best Buy";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        //5- İlk sayfaya dönüp sayfada java aratalım
        Thread.sleep(1000);
        driver.switchTo().window(amazonWindowHandle);
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("java" + Keys.ENTER);
        //6- Arama sonuclarının java içerdiğini test edelim
        WebElement actulaText= driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        String actualResult=actulaText.getText();
        String expectedResult="java";
        Assert.assertTrue(actualResult.contains(expectedResult));

        //7- Yeniden bestbuy sayfasına gidelim
        Thread.sleep(1000);
        driver.switchTo().window(bestBuyWindowHandle);
        //8- Logonun görünürlüğünü test edelim
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='logo']")).isDisplayed());
    }
}
