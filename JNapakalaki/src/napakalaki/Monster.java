/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author sersoker
 */
public class Monster {
    private String name;
    private int combatLevel;
    private Prize price;
    private BadConsequence bc;

    public Monster(String name, int combatLevel, Prize price, BadConsequence bc) {
        this.name = name;
        this.combatLevel = combatLevel;
        this.price = price;
        this.bc = bc;
    }
    
    public String getName(){
        return name;
    }
    
    public int getCombatLevel(){
        return combatLevel;
    }
    
    public String toString(){
    return "Name = " + name + 
            " Combat level = "+ Integer.toString(combatLevel);
    }
        
    public boolean soloNivel(){
       if (bc.getLevels()>0&&bc.nHidden()==0&&bc.nVisible()==0)
        return true;
       else
        return false;
    }
   
    public int buenRolloNivel(){
        return price.getLevel();
    }
    
    public boolean perdida(TreasureKind tipo){
        return bc.pierdeTipo(tipo);
    }
}
