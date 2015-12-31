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
public class TextData implements Data {

    public TextData(String text) {
        this.text = text;
    }
    
    public String getText() {
        return text;
    }
    
    private String text;
    
}
