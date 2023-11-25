package Ders06;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBaseBeforeAfter;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C02_FileExistsDownload extends TestBaseBeforeAfter {
    @Test
    public void fileExistTest() throws InterruptedException {

          //https://the-internet.herokuapp.com/download adresine gidelim.
        driver.get("https://the-internet.herokuapp.com/download");
         //Sample.txt dosyasını indirelim
        driver.findElement(By.xpath("//*[text()='Sample.txt']")).click();
        Thread.sleep(1500);
        //Ardından isExist( )  methodunda dosyanın başarıyla indirilip indirilmediğini test edelim
        String samplepath="C:\\Users\\Cüneyt Soylu\\Desktop\\Sample.txt";
        Assert.assertTrue(Files.exists(Paths.get(samplepath)));
       //İndirildiğini konsolda gösterin
        System.out.println(Paths.get(samplepath));
    }
}
