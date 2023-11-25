package Ders03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C04_DropownPractice {
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
    public void amazonTest() throws InterruptedException {
        //https://www.amazon.com.tr/ adresine gidiniz
        driver.get("https://www.amazon.com.tr/");
        //Cerezleri "kabul etmeden devam et" secenegine tiklayiniz
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/span/form/div[1]/a")).click();
        //Arama kutusunun yanindaki kategori menusunun kategori sayisinin 40 oldugunu test ediniz
        List<WebElement> ddm=driver.findElements(By.xpath("//option"));
        System.out.println(ddm.size());

        for (WebElement w:ddm
             ) {
            System.out.println(w.getText());
        }

        int actualDropDown=ddm.size();
        int expectedDropDDown=40;
        Assert.assertNotEquals(expectedDropDDown,actualDropDown);


        //Kategori menusunden Kitaplar seceneginin secin
        WebElement ddmlist=driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        Select select=new Select(ddmlist);
        select.selectByVisibleText("Kitaplar");
        //arama kutusuna Java yazin ve aratin
        WebElement searchBox=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("Java", Keys.ENTER);

        //bulunan sonuc sayisinin yazdirin
        WebElement sonucText=driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(sonucText.getText());
        //Sonucun Java kelimesini icerdigini test edin
        String actualText=sonucText.getText();
        String expectedText="Java";
        Assert.assertTrue(actualText.contains(expectedText));
    }



}
