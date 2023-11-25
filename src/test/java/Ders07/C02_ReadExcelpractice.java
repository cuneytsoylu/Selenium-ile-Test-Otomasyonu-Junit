package Ders07;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_ReadExcelpractice {
    @Test
    public void test() throws IOException {
        //- Dosya yolunu bir String degiskene atayalim
        String excel="src/resources/takimlar.xlsx";
//- FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fis=new FileInputStream(excel);
// - Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        Workbook workbook= WorkbookFactory.create(fis);
//- Sheet objesi olusturun
//- Row objesi olusturun
//- Cell objesi olusturun
String actualData=workbook.getSheet("sayfa1").getRow(4).getCell(1).toString();
        System.out.println(actualData);

    }
}
