package Ders05;

import org.junit.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C02_TestBaseBeforeClassAfterClass extends TestBaseBeforeClassAfterClass {
    @Test
    public void test() {
        driver.get("https://www.amazon.com.tr/");
    }
}
