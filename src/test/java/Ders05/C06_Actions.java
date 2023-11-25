package Ders05;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

public class C06_Actions extends TestBaseBeforeAfter {
    @Test
    public void test() throws InterruptedException {
        //1- https://www.facebook.com adresine gidelim
        driver.get("https://www.facebook.com");
        //2- Yeni hesap olustur butonuna basalim
        WebElement accountCreate= driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        Actions actions=new Actions(driver);
        actions.click(accountCreate).perform();
        Thread.sleep(1000);
        //3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
        actions.sendKeys("cuneyt").sendKeys(Keys.TAB).sendKeys("soylu").sendKeys(Keys.TAB).sendKeys("05555555555").sendKeys(Keys.TAB)


                .sendKeys("555555Qq/").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("12").sendKeys(Keys.TAB).sendKeys("Jul")
                .sendKeys(Keys.TAB).sendKeys("1992").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.RIGHT)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }
}
