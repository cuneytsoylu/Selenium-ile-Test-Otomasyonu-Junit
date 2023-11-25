package Ders01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_Practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //https://www.heroku.com/home adresine gidiniz
        driver.get("https://www.heroku.com/home");

        // Sign up butonuna basiniz
        WebElement signUp=driver.findElement(By.linkText("Sign up"));
        signUp.click();

       // driver.findElement(By.linkText("Sign up")).click();
        //Firstname textbox,Lastname textbox,company  elementlerini locate ediniz
        WebElement firstName= driver.findElement(By.id("first_name"));
        WebElement lastName= driver.findElement(By.id("last_name"));
        WebElement email= driver.findElement(By.id("email"));
        WebElement company= driver.findElement(By.name("company"));

        Thread.sleep(1000);
        firstName.sendKeys("Cuneyt");
        Thread.sleep(1000);
        lastName.sendKeys("Soylu");
        Thread.sleep(1000);
        email.sendKeys("email@gmail.com");
        Thread.sleep(1000);
        company.sendKeys("ccs");


    }
}
