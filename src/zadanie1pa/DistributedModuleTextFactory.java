
package zadanie1pa;

/**
 *
 * @author Krzysztof
 */

public class DistributedModuleTextFactory implements DistributedModuleFactory
{
    private String text;
    public DistributedModuleTextFactory(String text)
    {
        this.text = text;
    }

    @Override
    public Data Data()
    {
        return new TextData(text);
    }

    @Override
    public Exporter Exporter()
    {
        return new TextExporter(text);
    }

    @Override
    public Importer Importer()
    {
        return new TextImporter();
    }   
}
