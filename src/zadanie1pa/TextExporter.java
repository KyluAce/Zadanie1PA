
package zadanie1pa;

/**
 *
 * @author Krzysztof
 */
public class TextExporter implements Exporter 
{
    private Data data;
    public TextExporter(String textExpo)
    {
        this.data = new TextData(textExpo);
    }
    
    @Override
    public Data EData() 
    {
        if (data == null) 
        {
            return new TextData("¯\\(°_o)/¯");
        }
        
        Data eData = data;
        data = null;
        return eData; 
    }       
}
