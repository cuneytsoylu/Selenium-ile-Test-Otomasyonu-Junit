package Ders01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethodlari {
    public static void main(String[] args) {
        //Chromedriver i setup ediniz
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        // "www.amazon.com.tr" adresine gidiniz
        driver.get("https://www.amazon.com.tr/");
        //sayfayi maximum boyuta getiriniz
        driver.manage().window().maximize();
        //sayfanin basligini yazdiriniz
        System.out.println("Sitenin basligi : "+ driver.getTitle());
        //sayfanin URL adresini yazdiriniz
        System.out.println("Sayfanin URL adresi :"+driver.getCurrentUrl());
        //sayfanin kaynak kodlarini yazdiriniz
       // System.out.println("Sayfanin kaynak kodlari : "+driver.getPageSource());
        //Kaynak kodlarin icinde "Gateway" kelimesinin oldugunu test ediniz
        String actualData=driver.getPageSource();
        String expectedData="Gateway";

        if (actualData.contains(expectedData)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        //sayfanin window handle kodunu yazdiriniz

        System.out.println("Window Handle : "+driver.getWindowHandle());

        //sayfayi kapatalim
        driver.close();
    }
}
