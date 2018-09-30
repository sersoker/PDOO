
public class main
           
        e= new Entrenador("pepe")
        a1= new atletas("juan");
        a2= new atletas("juan2")
        a3= new atletas("juan3")
        
        equipo = equipoAtletas.new(e)
        equipo.meterAtleta(a1)
        equipo.meterAtleta(a2)
        equipo.meterAtleta(a3)
        
        #muestra el numero de equipos
        equipo.NumeroEquipos()
        #muestra entrenador del equipo
        equipo.muestraEntrenador()
        #Muestra los jugadores del equipo
        equipo.muestrAtletas()
        
            
end

 class Entrenador 
     @nombre;

    def initialize (nombre) 
        @nombre = nombre
    end
        
end

class atletas 
    @nombreAtleta;

    def initialize (nombreAtleta) 
        @nombreAtleta = nombreAtleta
    end
    
end

class equipoAtletas 
    
    @@numEquipos=0
    @listaAtletasEquipo = Array.new()
    @entrenador

	attr_reader:numEquipos,:entrenador
	
    def initialize( entrenador) {
        @entrenador = entrenador
        @@numEquipos=@@numEquipos+1;
    end
    
    def void meterAtleta( a){
        listaAtletasEquipo.push(a)
    }end
        
    def muestrAtletas(){
        listaAtletasEquipo.each do |a|
              puts a.nombreAtleta
    end
    
    def muestraEntrenador(){
      puts entrenador
    end
    
    def numeroEquipos(){
          puts @@numEquipos;
   end

end