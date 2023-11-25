package Ders04;

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

public class C01_Iframe {
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
    // ● Bir metod olusturun: iframeTest
    @Test
    public void IframeTest() throws InterruptedException {

        // ● https://the-internet.herokuapp.com/iframe adresine gidin.
        driver.get("https://the-internet.herokuapp.com/iframe");
        //    ○ “An IFrame containing….” textinin erisilebilir oldugunu test edin ve konsolda yazdirin.
        WebElement iframeText=driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(iframeText.isDisplayed());
        System.out.println(iframeText.getText());
        //    ○ Text Box’a “Merhaba Dunya!” yazin.
        WebElement iframeTextBox=driver.findElement(By.xpath("//*[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframeTextBox);
        WebElement textBox=driver.findElement(By.xpath("//p"));
        textBox.clear();
        Thread.sleep(1000);
        textBox.sendKeys("Merhaba Dunya");
        //    ○ TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur oldugunu
        //      dogrulayin ve konsolda yazdirin

       // driver.switchTo().parentFrame();//===> 1ust seviyedeki frame e gecis yapar
        driver.switchTo().defaultContent();// En ust seviyedeki frame cikmak icin kullanilir
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).getText());

    }
}
