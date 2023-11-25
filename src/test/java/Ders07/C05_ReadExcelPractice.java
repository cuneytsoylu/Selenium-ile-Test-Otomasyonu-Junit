package Ders07;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C05_ReadExcelPractice {
    @Test
    public void test() throws IOException {
        //-Dosya yolunu bir String degiskene atayalim
//-FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
//-Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        String excel="src/resources/takimlar.xlsx";
        FileInputStream fileInputStream=new FileInputStream(excel);
        Workbook workbook= WorkbookFactory.create(fileInputStream);
//-sayfa 2'ye gidip satir sayisinin 17, kullanilan satir sayisinin ise 5 oldugunu test edin

        int SonSatir=workbook.getSheet("sayfa2").getLastRowNum();
        System.out.println(SonSatir);
        int expectedLatRow=17;
        Assert.assertEquals(expectedLatRow,SonSatir+1);

        int kullanilanSatirSayisi=workbook.getSheet("sayfa2").getPhysicalNumberOfRows();
        System.out.println(kullanilanSatirSayisi);
        int expectedkullanilanSatirSayisi=5;
        Assert.assertEquals(expectedkullanilanSatirSayisi,kullanilanSatirSayisi);

    }
}
