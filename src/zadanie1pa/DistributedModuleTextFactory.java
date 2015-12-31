
package zadanie1pa;

public class DistributedModuleTextFactory implements DistributedModuleFactory {
    
    public DistributedModuleTextFactory(String text) {
        this.text = text;
    }

    @Override
    public Data Data() {
        return new TextData(text);
    }

    @Override
    public Exporter Exporter() {
        return new TextExporter(text);
    }

    @Override
    public Importer Importer() {
        return new TextImporter();
    }
    
    private String text;
    
}
