package Ders06;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C01_FileExist {
    @Test
    public void Test() {
        System.out.println(System.getProperty("user.dir"));//C:\Users\Cüneyt Soylu\IdeaProjects\JUnitFramework

        String anaDizin=System.getProperty("user.home");//
        System.out.println(anaDizin);//C:\Users\Cüneyt Soylu

    //    String file="C:\\Users\\Cüneyt Soylu\\Desktop\\test-metin.txt";
        String file="C:/Users/Cüneyt Soylu/Desktop/test-metin.txt";

        Assert.assertTrue(Files.exists(Paths.get(file)));
    }

}
