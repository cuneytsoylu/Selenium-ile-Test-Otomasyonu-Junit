package Ders01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_Practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //Facebook sayfasina gidin ve sayfa basliginin(title) "facebook" oldugunu dogrulayin
        //Sayfa basligi dogru degilse basligi yazdirin
        driver.get("https://www.facebook.com");
        if (driver.getTitle().contains("facebook")){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("Actual baslik :"+driver.getTitle());
        }
        //Sayfa URL inin "facebook" kelimesi icerdigini dogrulayin,icermiyorsa "actual" URL i yazdirin
        if (driver.getCurrentUrl().contains("facebook")){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("Actual URL :"+driver.getCurrentUrl());
        }
        //"https://www.walmart.com/ sayfasina gidin
        driver.navigate().to("https://www.walmart.com/");
        //Sayfanin basliginin "Walmart.com" icerdigini dogrulayin
        if (driver.getTitle().contains("Walmart.com")){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("Actual baslik :"+driver.getTitle());
        }
        //Tekrar "facebook" sayfasina donun
        driver.navigate().back();
        //Sayfayi yenileyin
        Thread.sleep(1000);
        driver.navigate().refresh();
        //Sayfayi maximize yapin
        Thread.sleep(1000);
        driver.navigate().refresh();
        //Browser i kapatin
        driver.close();
    }
}
