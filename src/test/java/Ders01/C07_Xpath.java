package Ders01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_Xpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna basiniz
        WebElement addElement=driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElement.click();
        //Delete butonu nun gorunur oldugunu test edin
        WebElement deleteButon=driver.findElement(By.xpath("//*[text()='Delete']"));
        if (deleteButon.isDisplayed()){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }
        //Delete butonuna basiniz
        Thread.sleep(1000);
        deleteButon.click();
        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin
        if (driver.findElement(By.xpath("//*[text()='Add/Remove Elements']")).isDisplayed()){
            System.out.println("TEST PASSED YAZI GORUNDU");
        }else {
            System.out.println("TEST FAILED YAZI GORUNMUYOR");
        }

        //Browser i kapatalim
        driver.close();

    }
}
