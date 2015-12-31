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
public class TextExporter implements Exporter {

    public TextExporter(String textExpo){
        this.data = new TextData(textExpo);
    }
    
    @Override
    public Data EData() {
        if (data == null) {
            return new TextData("");
        }
        
        Data eData = data;
        data = null;
        return eData; 
    }   
    private Data data;    
}
