package Ders06;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseBeforeAfter;

public class C03_FileExixtsUpload extends TestBaseBeforeAfter {
    @Test
    public void test() {
//https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");
//Dosyasec butonuna basalim
        WebElement dosyaSec= driver.findElement(By.xpath("//*[@id='file-upload']"));
//Yuklemek istediginiz dosyayi secelim.
        String yuklenecekDosya="C:\\Users\\Cüneyt Soylu\\Desktop\\Sample.txt";
        dosyaSec.sendKeys(yuklenecekDosya);
//Upload butonuna basalim.
        driver.findElement(By.xpath("//*[@id='file-submit']")).click();
//“File Uploaded!” textinin goruntulendigini test edelim.
        Assert.assertTrue(driver.findElement(By.xpath("//h3")).isDisplayed());
    }
}
