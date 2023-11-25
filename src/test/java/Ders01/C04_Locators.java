package Ders01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_Locators {
    public static void main(String[] args) throws InterruptedException {
        //Chromedriver i setup ediniz
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // "www.amazon.com.tr" adresine gidiniz
        driver.get("https://www.amazon.com.tr");

        //Amazonda notebook aratalim.
        Thread.sleep(2000);
        WebElement cerezler=driver.findElement(By.id("sp-cc-rejectall-link"));
        cerezler.click();
        Thread.sleep(2000);
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("notebook" + Keys.ENTER);

        //Amazon sayfasindaki taglarin a olanlarinin sayisini yazdiralim
        List<WebElement> tag=driver.findElements(By.tagName("a"));
        System.out.println("Tag a olanlarin sayisi : "+tag.size());

        List<WebElement> label=driver.findElements(By.tagName("label"));
        System.out.println("Tag i label olanlarin sayisi : "+label.size());

        //sayfayi kapatiniz
        driver.close();
    }
}
