package Ders07;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C03_ReadExcelPractice {
    @Test
    public void test() throws IOException {
        //Belirtilen satırNo ve sutunNo değerlerini parametre olarak alıp o cell'deki datayı konsola yazdıralım
        //Sonucun konsolda yazanla aynı olduğunu doğrulayın


        int satir=3;
        int sutun=2;

        String excel="src/resources/takimlar.xlsx";
        FileInputStream fileInputStream=new FileInputStream(excel);
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        String actualData=workbook.getSheet("sayfa1").getRow(satir-1).getCell(sutun-1).toString();

        String expectedData="Real Madrid";

        Assert.assertEquals(expectedData,actualData);

        System.out.println(actualData);


    }
}
