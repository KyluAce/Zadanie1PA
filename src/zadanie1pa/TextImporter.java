/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie1pa;

/**
 *
 * @author Krzysztof
 */
public class TextImporter implements Importer 
{
    
    @Override
    public void IData(Data data) {
        this.data = data;
    }
    
    public String iText() {
        return ((TextData)this.data).getText();
    }
    
    private Data data;
    
    
}
