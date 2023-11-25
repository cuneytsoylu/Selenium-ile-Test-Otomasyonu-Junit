package Ders03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C03_Dropdown {
    WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @After
    public void tearDown() {
        // driver.quit();
    }

    //https://the-internet.herokuapp.com/dropdown adresine gidin
    //Index kullanarak Option 1 i secin ve yazdirin
    //Value kullanarak Option 2 i secin ve yazdirin
    //Visible Text kullanarak Option 1 i  ve Option 2 i secin ve yazdirin
    //Tum dropdown degerleri yazddirin
    //Dropdown un boyutunu bulun, Dropdown da 4 oge varsa konsolda true, degilse false yazdirin


    @Test
    public void dropdowntest() throws InterruptedException {
        //https://the-internet.herokuapp.com/dropdown adresine gidin
        driver.get("https://the-internet.herokuapp.com/dropdown");
        Thread.sleep(1000);
        //Index kullanarak Option 1 i secin ve yazdirin
        WebElement ddmList=driver.findElement(By.cssSelector("#dropdown"));
        Select select=new Select(ddmList);
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());
        System.out.println("===============================");
        //Value kullanarak Option 2 i secin ve yazdirin
        Thread.sleep(1000);
        select.selectByValue("2");
        System.out.println(select.getFirstSelectedOption().getText());
        System.out.println("===============================");
        //Visible Text kullanarak Option 1 i  ve Option 2 i secin ve yazdirin
        select.selectByVisibleText("Option 1");
        System.out.println(select.getFirstSelectedOption().getText());
        System.out.println("===============================");
        Thread.sleep(2000);
        select.selectByVisibleText("Option 2");
        System.out.println(select.getFirstSelectedOption().getText());
        System.out.println("===============================");
        //Tum dropdown degerleri yazddirin
        List<WebElement> tumddm=driver.findElements(By.xpath("//option"));
        for (WebElement w:tumddm) {
            System.out.println(w.getText());
        }

        //Dropdown un boyutunu bulun, Dropdown da 4 oge varsa konsolda true, degilse false yazdirin
        System.out.println("Dropdowndaki eleman sayisi =" +tumddm.size());
        if (tumddm.size()==4){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }


    }
}
