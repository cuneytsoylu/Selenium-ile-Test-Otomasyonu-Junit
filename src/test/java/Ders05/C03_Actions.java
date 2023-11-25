package Ders05;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

public class C03_Actions extends TestBaseBeforeAfter {
    @Test
    public void actionsTest() throws InterruptedException {
        //https://www.amazon.com.tr/ sayfasina gidelim
        driver.get("https://www.amazon.com.tr/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='sp-cc-rejectall-link']")).click();
        //Hesaplar menusunden  liste olusturun linkine tıklayalım
        WebElement hesaplar= driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
        WebElement listeolustur= driver.findElement(By.xpath("(//*[@class='nav-text'])[1]"));
        Actions actions=new Actions(driver);
        actions.moveToElement(hesaplar).click(listeolustur).perform();

        //Arama kutusuna actions method’larine kullanarak  Iphone 15 Plus yazdirin ve Enter’a basarak arama  yaptirin
        WebElement searchBox= driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        actions.click(searchBox).keyDown(Keys.SHIFT).sendKeys("i").keyUp(Keys.SHIFT).sendKeys("phone").sendKeys(" ").sendKeys("15")
                .sendKeys(" ").keyDown(Keys.SHIFT).sendKeys("p").keyUp(Keys.SHIFT).sendKeys("lus").sendKeys(Keys.ENTER).perform();
        //Aramanin gerceklestigini test edin
        String actualdata=driver.getTitle();
        String expecteddata="Iphone 15 Plus";
        Assert.assertTrue(actualdata.contains(expecteddata));

    }
}
