/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * @author sersoker
 */

public class PruebaNapakalaki {


public static void main (String[] args){
       
    ArrayList <Monster> monstruos = new ArrayList();
    
/*3 Byakhees de bonanza*/
   BadConsequence badConsequence = 
            new BadConsequence("Pierdes tu armadura visible y otra oculta",
                    0,new ArrayList(Arrays.asList(TreasureKind.armor)),
                    new ArrayList(Arrays.asList(TreasureKind.armor)));
   Prize pri = new Prize(2,1);  
    
   monstruos.add(new Monster("3 Byakhees de bonanza", 8, pri,badConsequence));   
    
/*Chibithulhu*/
    badConsequence = 
            new BadConsequence("Embobados con el lindo primigenio te descartas de tu casco visible",
                    0,new ArrayList(Arrays.asList(TreasureKind.helmet)),new ArrayList());
    pri = new Prize(1,1);
    
    monstruos.add(new Monster("Chibithulhu", 2, pri,badConsequence));

/*El sopor de Dunwich*/
    badConsequence = 
               new BadConsequence("El primordial bostezo contagioso, Pierdes el calzado visible.",
                       0,new ArrayList(Arrays.asList(TreasureKind.shoe)),new ArrayList());
    pri = new Prize(1,1);
    monstruos.add(new Monster("El sopor de Dunwich", 2,pri,badConsequence));
    
/*Angeles de la noche ibicenca*/    
    badConsequence = 
            new BadConsequence("Te atrapan para llevarte de fiesta y te dejan caer en mitad del vuelo. Descarta 1 mano visible y 1 mano oculta",
                    0,new ArrayList(Arrays.asList(TreasureKind.oneHand))
                    ,new ArrayList(Arrays.asList(TreasureKind.oneHand)));
     pri = new Prize(4,1);
    
    monstruos.add(new Monster("Ángeles de la noche ibicenca", 14, pri,badConsequence));

/*El gorron en el umbral*/
    badConsequence = 
            new BadConsequence("Pierdes todos tus tesoros visibles",0,6,0);
    pri = new Prize(3,1);
    
    monstruos.add(new Monster("El gorron en el umbral", 10, pri,badConsequence)); 

/*H.P. Munchcraft*/
    badConsequence =
            new BadConsequence("Pierdes la armadura visible",0,
                    new ArrayList(Arrays.asList(TreasureKind.armor)),
                    new ArrayList());
    pri = new Prize(2,1);
    
    monstruos.add(new Monster("H.P. Munchcraft",6,pri,badConsequence));
    
/*Bichgooth*/
   badConsequence =
            new BadConsequence("Sientes bichos bajo la ropa. Pierdes la armadura visible",0,
                    new ArrayList(Arrays.asList(TreasureKind.armor)),
                    new ArrayList());
    pri = new Prize(1,1);
    
    monstruos.add(new Monster("Bichgooth",2,pri,badConsequence));
 
/*El rey de rosa*/
    badConsequence = 
            new BadConsequence("Pierdes 5 niveles y 3 tesoros visibles",5,3,0);
    pri = new Prize(4,2);
    
    monstruos.add(new Monster("El rey de rosa", 13, pri,badConsequence));     
    
 /*La que redacta en las tinieblas*/
   badConsequence = 
            new BadConsequence("Toses los pulmones y pierdes 2 niveles",2,0,0);
   pri = new Prize(1,1);
    
   monstruos.add(new Monster("La que redacta en las tinieblas", 2, pri,badConsequence));     

/*Los hondos*/
   badConsequence = 
            new BadConsequence("Estos monstruos resultan bastante superficiales"
                    + " y te aburren mortalmente. Estas muerto",true);
   pri = new Prize(2,1);
    
   monstruos.add(new Monster("Los hondos", 8, pri,badConsequence));
   
/*Semillas Cthulhu*/
   badConsequence = 
            new BadConsequence("Pierdes 2 niveles y 2 tesoros oculto.",2,0,2);
   pri = new Prize(2,1);
    
   monstruos.add(new Monster("Semillas Cthulhu", 4, pri,badConsequence));  

/*Dameargo*/
   badConsequence =
            new BadConsequence("Te intentas escaquear. Pierdes una mano visible",0,
                    new ArrayList(Arrays.asList(TreasureKind.oneHand)),
                    new ArrayList());
    pri = new Prize(2,1);
    
    monstruos.add(new Monster("Dameargo",1,pri,badConsequence));

 /*Pollipolipo volante*/
   badConsequence = 
            new BadConsequence("Da mucho asquito.Pierdes 3 niveles.",3,0,0);
   pri = new Prize(1,1);
    
   monstruos.add(new Monster("Pollipolipo volante", 3, pri,badConsequence)); 

/*Yskhtihyssg-Goth*/
  badConsequence = 
            new BadConsequence("No le hace gracia que pronuncien mal su nombre. Estas muerto",
                    true);
   pri = new Prize(3,1);
    
   monstruos.add(new Monster("Yskhtihyssg-Goth", 12, pri,badConsequence));

/*Familia feliz*/
  badConsequence = 
            new BadConsequence("La familia te atrapa. Estas muerto",
                    true);
   pri = new Prize(4,1);
    
   monstruos.add(new Monster("Familia feliz", 1, pri,badConsequence));

/*Roboggoth*/
   badConsequence =
            new BadConsequence("La quinta directiva primaria te obliga a perder 2 niveles y un tesoro 2 manos visible",2,
                    new ArrayList(Arrays.asList(TreasureKind.bothHand)),
                    new ArrayList());
    pri = new Prize(2,1);
    
    monstruos.add(new Monster("Roboggoth",8,pri,badConsequence));
    
/*El espia*/
    badConsequence = 
            new BadConsequence("Te asustas en la noche. Pierdes un casco visible",
                    0,new ArrayList(Arrays.asList(TreasureKind.helmet)),new ArrayList());
    pri = new Prize(1,1);
    
    monstruos.add(new Monster("El espia", 5, pri,badConsequence));
   
/*El Lenguas*/
   badConsequence = 
            new BadConsequence("Menudo susto te llevas. Pierdes 2 niveles y 5 tesoros visibles",2,5,0);
    pri = new Prize(1,1);
    
    monstruos.add(new Monster("El Lenguas", 20, pri,badConsequence));     

/*Bicefalo*/
   badConsequence = 
            new BadConsequence("Te faltan manos para tantas cabezas. Pierdes 3 niveles y tus tesoros visibles de las manos tesoros visibles",3,6,0);
    pri = new Prize(1,1);
    
    monstruos.add(new Monster("Bicefalo", 20, pri,badConsequence));     
 
    
    for(Monster m: monstruos){
        if( m.getCombatLevel()>10)
            System.out.println("Nivel de combate superior a 10 "+m.toString());
     }
    
    for(Monster m: monstruos){
        if(m.soloNivel())
            System.out.println("Solo Pierden nivel "+m.toString());
     }
     
    for(Monster m: monstruos){
        if(m.buenRolloNivel()>1)
            System.out.println("Buen rollo nivel>1  "+m.toString());
     }
     
    for(Monster m: monstruos){
        if(m.buenRolloNivel()>1)
            System.out.println("Buen rollo nivel>1  "+m.toString());
     }
    TreasureKind Objeto;
    Objeto=TreasureKind.helmet;
     for(Monster m: monstruos){
        if(m.perdida(Objeto))
            System.out.println("Te hace perder este tipo de objeto  "+m.toString());
     }
    
}
   
}
