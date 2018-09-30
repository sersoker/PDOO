class C
  
  private
  @@contador2=0
  @contador1=0
  
  public
  
  def incrementarContador1
    @contador1=@contador1+1
  end
  def incrementarContador2
    @@contador2=@@contador2+1
  end
  
  attr_reader:contador1,:contador2
  
end

class Main
  
objeto1=c.new()
objeto2=c.new()
objeto1.incrementarContador1
objeto1.incrementarContador2
objeto2.incrementarContador1
objeto2.incrementarContador2

puts objeto1.contador1
puts objeto1.contador2
puts objeto2.contador1
puts objeto2.contador2

end

#A.rb
module  p1
  require "b.rb"
  class A
    
  end
  
end

#B.rb
module  p2
  public class b
    @atributo1
    public 
    @Atributo2
  end
  
end
