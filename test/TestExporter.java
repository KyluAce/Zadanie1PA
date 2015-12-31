
import zadanie1pa.Data;
import zadanie1pa.Exporter;
import zadanie1pa.TextData;
import zadanie1pa.TextExporter;
import org.junit.Test;
import org.junit.Assert;


/**
 *
 * @author Krzysztof
 */
public class TestExporter
{
    @Test
    public void TestExporter()
    {
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
