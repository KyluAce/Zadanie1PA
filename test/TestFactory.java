
import org.junit.Assert;
import org.junit.Test;
import zadanie1pa.Data;
import zadanie1pa.DistributedModuleFactory;
import zadanie1pa.DistributedModuleTextFactory;
import zadanie1pa.Exporter;
import zadanie1pa.Importer;
import zadanie1pa.TextData;
import zadanie1pa.TextExporter;
import zadanie1pa.TextImporter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krzysztof
 */
public class TestFactory 
{
     @Test
    public void factory()
    {
        final String textToForFactory = "Ali kot zjadl dolara";
        DistributedModuleFactory factory = new DistributedModuleTextFactory(textToForFactory);
        Data dataFromFactory = factory.Data();
        String textFromModule = ((TextData)dataFromFactory).getText();
        Assert.assertEquals(textToForFactory, textFromModule);
        Exporter exporter = factory.Exporter();
        textFromModule = ((TextData)((TextExporter)exporter).EData()).getText();
        Assert.assertEquals(textToForFactory, textFromModule);
        Importer importer = factory.Importer();
        Assert.assertTrue(importer instanceof TextImporter);
    }
}
