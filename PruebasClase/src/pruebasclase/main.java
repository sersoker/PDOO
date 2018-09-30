package pruebasclase;

public class main{
    public static void pruebasclase (String[] args){
        
        Entrenador e= new Entrenador("pepe");
        atletas a1= new atletas("juan");
        atletas a2= new atletas("juan2");
        atletas a3= new atletas("juan3");
        
        equipoAtletas equipo = new equipoAtletas(e);
        equipo.meterAtleta(a1);
        equipo.meterAtleta(a2);
        equipo.meterAtleta(a3);
        
        //muestra el numero de equipos
        equipo.NumeroEquipos();
        //muestra entrenador del equipo
        equipo.muestraEntrenador();
        //Muestra los jugadores del equipo
        equipo.muestrAtletas();
        
        

    }
}