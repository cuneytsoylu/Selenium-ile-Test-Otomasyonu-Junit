package Ders05;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

public class C07_Faker extends TestBaseBeforeAfter {
    @Test
    public void fakerTest() throws InterruptedException {
        //1- https://www.facebook.com adresine gidelim
        driver.get("https://www.facebook.com");
        //2- Yeni hesap olustur butonuna basalim
        WebElement accountCreate= driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        Actions actions=new Actions(driver);
        actions.click(accountCreate).perform();
        Thread.sleep(1000);
        //3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
        Faker faker=new Faker();
        String email=faker.internet().emailAddress();
       actions.sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).
               sendKeys(email).sendKeys(Keys.TAB).sendKeys(email).sendKeys(Keys.TAB).sendKeys(faker.internet().password()).sendKeys(Keys.TAB)
               .sendKeys(Keys.TAB).sendKeys(faker.number().digit()).sendKeys(Keys.TAB).sendKeys("Oct").sendKeys(Keys.TAB).sendKeys("1990").sendKeys(Keys.TAB).sendKeys(Keys.TAB)
               .sendKeys(Keys.RIGHT)
               .sendKeys(Keys.TAB)
               .sendKeys(Keys.TAB)
               .sendKeys(Keys.TAB)
               .sendKeys(Keys.TAB)
               .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();


    }
}
