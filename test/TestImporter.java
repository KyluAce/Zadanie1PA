
import org.junit.Assert;
import org.junit.Test;
import zadanie1pa.Data;
import zadanie1pa.Importer;
import zadanie1pa.TextData;
import zadanie1pa.TextImporter;


/**
 *
 * @author Krzysztof
 */
public class TestImporter
{
    
    @Test
    public void importer()
    {
        String textToBeImported = "Ala zgubila dolara";
        Data dataToSendToImporter = new TextData(textToBeImported);
        Importer importer = new TextImporter();
        importer.IData(dataToSendToImporter);
        String dataSavedInImporter = ((TextImporter)importer).iText();
        Assert.assertEquals(textToBeImported, dataSavedInImporter);
    }
}
