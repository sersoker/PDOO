package pruebasclase;

import java.util.ArrayList;
public class equipoAtletas {
    
    public static int numEquipos=0;
    private ArrayList <atletas> listaAtletasEquipo = new ArrayList();
    private Entrenador entrenador;

    public equipoAtletas(Entrenador entrenador) {
        this.entrenador = entrenador;
        numEquipos++;
    }
    
    public void meterAtleta(atletas a){
        listaAtletasEquipo.add(a);
    }
    
    public Entrenador getEntrenador(){
        return entrenador;
    }
    
    public int NumeroEquipos(){
       return numEquipos;       
    }
    
    public void muestrAtletas(){
        for (atletas a :listaAtletasEquipo)
              System.out.println(a.nombreAtleta);
    }
    
    public void muestraEntrenador(){
      System.out.println(entrenador);
    }
    
    public void numeroEquipos(){
          System.out.println(numEquipos);
    }
}
