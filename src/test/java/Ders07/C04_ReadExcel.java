package Ders07;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C04_ReadExcel {
    @Test
    public void test() throws IOException {

        //-Dosya yolunu bir String degiskene atayalim
//-FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
//-Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        String excel="src/resources/takimlar.xlsx";
        FileInputStream fileInputStream=new FileInputStream(excel);
        Workbook workbook= WorkbookFactory.create(fileInputStream);
//-Takim A  sutununu yazdiralim

        String takimA="";
        for (int i = 0; i <10 ; i++) {
            takimA=workbook.getSheet("sayfa1").getRow(i).getCell(1).toString();
            System.out.println(takimA);

        }

    }
}


