/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author sersoker
 */
public class BadConsequence {
    private String text;
    private int levels;
    private int nVisibleTreasures ;
    private int nHiddenTreasures;
    private boolean death;
    private ArrayList <TreasureKind> specificHiddenTreasures = new ArrayList();
    private ArrayList <TreasureKind> specificVisibleTreasures = new ArrayList();
    
    public BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible, 
                        ArrayList<TreasureKind> tHidden){
    }
    
    public BadConsequence(String text, int levels ,int nvisibleTreasures, int nHiddenTreasures) {
        this.text = text;
        this.levels=levels;
        this.nVisibleTreasures = nvisibleTreasures;
        this.nHiddenTreasures = nHiddenTreasures;
    }

    public BadConsequence(String text, boolean death) {
        this.text = text;
        this.death = death;
    }

    public String getText() {
        return text;
    }
    
    public int getLevels(){
        return levels;
    }

    public int nHidden(){
        return nHiddenTreasures;
    }

    public int nVisible(){
        return nVisibleTreasures;
    }

    
    public String toString(){
    String cad = "Text = " + text + 
            "Level = "+ Integer.toString(levels)+
            "VisibleTreasures = "+ Integer.toString(nVisibleTreasures)+
            "HiddenTreasures = "+ Integer.toString(nHiddenTreasures)+
            "Death = "+ death;

    for(TreasureKind e:specificHiddenTreasures){
            cad = cad + e.toString();
        }
   
    for(TreasureKind e:specificVisibleTreasures){
            cad = cad + e.toString();
        }
        
    return cad;
    }
    
    boolean pierdeTipo (TreasureKind tipo){
    boolean oculto = true;
    boolean visible = true;
        for(TreasureKind t: specificHiddenTreasures){
            if (t!=tipo)
                oculto=false;
        }
        for(TreasureKind t: specificVisibleTreasures){
            if (t!=tipo)
                visible=false;
        }    
        
        if (oculto||visible)
                return true;
        else
                return false;
    }
}
