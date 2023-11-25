package Ders08;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utilities.TestBaseBeforeAfter;

import java.io.File;
import java.io.IOException;

public class C02_GetScreenShotWE extends TestBaseBeforeAfter {
    @Test
    public void test() throws InterruptedException, IOException {
        //Amazon sayfasına gidelim
        driver.get("https://www.amazon.com.tr");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='sp-cc-rejectall-link']")).click();
        //Iphone aratalım
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Iphone", Keys.ENTER);
        //Arama sonuc yazısının resmini alalım
        WebElement aramaSonucu=driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));

        File aramasonucuWE=aramaSonucu.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(aramasonucuWE,new File("target/WEScreenShot/WESS"+tarih+".jpeg"));


    }
}
