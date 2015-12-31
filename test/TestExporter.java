
import zadanie1pa.Data;
import zadanie1pa.Exporter;
import zadanie1pa.TextData;
import zadanie1pa.TextExporter;
import org.junit.Test;
import org.junit.Assert;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krzysztof
 */
public class TestExporter
{
    @Test
    public void exporter() {
        String textToBeExported = "Ala ma kota";
        Exporter exporter = new TextExporter(textToBeExported);
        Data exportedData = exporter.EData();
        String exportedText = ((TextData)exportedData).getText();
        Assert.assertEquals(textToBeExported, exportedText);
        exportedData = exporter.EData();
        exportedText = ((TextData)exportedData).getText();
        textToBeExported = "";
        Assert.assertEquals(textToBeExported, exportedText);
    }
    
}
