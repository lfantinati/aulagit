programa {
  funcao inicio() {

    
    cadeia idiomas[4] = {"Japones" ," portugues", "ingles", " espanhol"}
    escreva("Escolha o pais:\n(0) Japao\t(1) portugal\n(2)ingles\t(3)espanha\n")
    inteiro pais

    leia(pais)
    se(pais >=0 e pais < 4){
  
     escreva("O idioma é:", idiomas[pais])
    }senao{
      escreva("Escolha um pais dentro das opções a baixo")
    }
     
    
    
  }
}
