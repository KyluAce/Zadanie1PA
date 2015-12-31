
package zadanie1pa;

/**
 *
 * @author Krzysztof
 */
public class TextData implements Data
{
    private String text;
    public TextData(String text)
    {
        this.text = text;
    }
    
    public String getText()
    {
        return text;
    }
}
