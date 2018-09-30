# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class BadConsequence
  def initialize()
    @texto
    @nivel
    @nVisible
    @nHidden
    @texto
    @death
  end
  def initialize (texto,nivel,nVisible,nHidden)
    @texto=texto
    @nivel=nivel
    @nVisible=nVisible
    @nHidden=nHidden
  end
  def initialize(texto,death)
    @texto=texto
    @death=death
  end
  
  def getText()
    @texto
  end
  
att_reader nivel,texto
end
