package Ders04;

public class C00_Info {
/*  - driver.switchTo() methodu ile geçilebilecek 3 farklı yapı vardır:
    1) alert
    2) iframe
    3) window (sonraki konu)

- Bir websitesi içinde farklı bir websitesi olabilir (embedded).

            - Iframe genellkikle bir web sayfasına doküman, video veya interaktif medya gibi
    başka bir kaynaktan içerik eklemek için kullanılır.

- <iframe> tag'ı bir inline frame belirtir.

            - iframe tagı'ı bulunan web sayfalarında locate işlemi yapabilmek için iframe'i handle etmek gerekir.

            - Diğer bir deyişle, bir web sayfasında doğruluğundan emin olduğumuz bir locate işlemi varsa
    ancak bu düzgün çalışmıyorsa, SAYFADA IFRAME TAG'I BULUNUP BULUNMADIĞINI KONTROL ETMEMİZ GEREKİR.
    Bu durumda, önce iframe'i locate edip switchTo() method'u ile geçiş yapmamız gerekir.

- Bir web sayfasında iframe varsa switchTo() method'unu kullanmak gerekir.
    switchTo() method'u ile iframe'e geçmenin 3 yolu vardır:

            1) index ile
        driver.switchTo().frame(index of the iframe);   //index 0'dan başlar

    2) id veya name value ile
        driver.switchTo().frame("id of the frame");

    3) WebElement ile
        driver.switchTo().frame(WebElement of the iframe);

- iframe'den çıkmak için 2 komut vardır:

            1) driver.switchTo( ).parentFrame( ); ===> 1 ust seviyedeki frame'e cikartir

            2) driver.switchTo( ).defaultContent( ); ===> En ustteki frame'e cikmak icin kullanilir

            - Birden fazla iframe varsa gecislerde dikkatli olmak lazim.
    Gecisler her zaman basit olamayabilir*/
}
