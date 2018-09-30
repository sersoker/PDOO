# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class Monster
  def initialize()
    @name
    @combatLevel
  end
  def initialize(nombre,nivelCombate)
    @name=nombre
    @combatLevel=nivelCombate
  end
  
  att_reader name, combatLevel
end
