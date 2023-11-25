package Ders07;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {
    @Test
    public void readExcelTest() throws IOException {
        //- Dosya yolunu bir String degiskene atayalim
        String excel="src/resources/takimlar.xlsx";
        //- FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fis=new FileInputStream(excel);
        // - Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        Workbook workbook= WorkbookFactory.create(fis);
        //- Sheet objesi olusturun
        Sheet sheet=workbook.getSheet("Sayfa1");
        //- Row objesi olusturun
        Row row=sheet.getRow(3);
        //- Cell objesi olusturun
        Cell cell=row.getCell(2);
        //- 3. index'deki satirin 2. index'indeki datanin Norvec oldugunu test edin
String expecteddata="Norvec";
String actualData=cell.toString();
Assert.assertEquals(expecteddata,actualData);
        System.out.println(actualData);

    }
}
