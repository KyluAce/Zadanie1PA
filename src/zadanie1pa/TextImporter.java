
package zadanie1pa;

/**
 *
 * @author Krzysztof
 */
public class TextImporter implements Importer 
{
    private Data data;
    @Override
    public void IData(Data data)
    {
        this.data = data;
    }
    
    public String iText()
    {
        return ((TextData)this.data).getText();
    }
}
