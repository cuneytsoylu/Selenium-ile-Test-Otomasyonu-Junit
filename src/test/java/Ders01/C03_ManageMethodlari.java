package Ders01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        //Chromedriver i setup ediniz
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        // "www.amazon.com.tr" adresine gidiniz
        driver.get("https://www.amazon.com.tr");
        //Sayfanin konumunu  ve boyutlarini yazdirin
        System.out.println("Sayfanin konumu : "+driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutu : "+driver.manage().window().getSize());
        //Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
        //Simge durumunda 2 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(2000);
        driver.manage().window().maximize();
        //Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        //Sayfayi fullscreen yapin
        Thread.sleep(1000);
        driver.manage().window().fullscreen();
        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Sayfanin fullscreen konumu : "+driver.manage().window().getPosition());
        System.out.println("Sayfanin fullscreen boyutu : "+driver.manage().window().getSize());
        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(20,20));
        driver.manage().window().setSize(new Dimension(800,400));
        //Sayfanin istenilen konum boyutta ayarlandigini test ediniz
        System.out.println("Sayfanin istenilen konumu : "+driver.manage().window().getPosition());
        System.out.println("Sayfanin istenilen boyutu : "+driver.manage().window().getSize());
        //Sayfayi kapatiniz
        driver.close();
    }


}
