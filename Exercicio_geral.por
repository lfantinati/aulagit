
//Exercicio_01
programa {
  funcao inicio() {
    inteiro numero

    escreva("Digite o numero 2 ou Digite o numero -3 : ")
    leia (numero)

    se numero % 2 == 0 e numero >= 0 ) //par positivo
    {
      escreva("Numero ", numero, " É Par positivo!")

    }
    se numero % 2 == 0 e numero < 0 ) //par e negativo
    {
      escreva("Numero ", numero, " É Par e negativo!")

    }
    se numero % 2 != 0 e numero >= 0 ) //impar e positivo
    {
      escreva("Numero ", numero, " É impar e positivo!")

    }
    se numero % 2 != 0 e numero <0 ) //impar e negativo
    {
      escreva("Numero ", numero, " É impar e negativo!")

    }

  }
}


//Exercicio 2
programa {
  funcao inicio() {
   inteiro Item
   inteiro Quantidade
   real Valor
   Item = 0
   Quantidade = 0
   Valor = 0 
   escreva("########## ##### #########   Menu Marketplace   ########## ######## ##########\n")

   escreva ("\n Digite o item 1 para Cachorro-quente 10.00 R$ ")
   escreva ("\n Digite o item 2 para X-Salada 15.00 R$ ")
   escreva ("\n Digite o item 3 para X-Bacon 18.00 R$ ") 
   escreva ("\n Digite o item 4 para Bauru 12.00 R$ ") 
   escreva ("\n Digite o item 5 para Refrigerante 8.00 R$ ") 
   escreva ("\n Digite o item 6 para suco de laranga 13.00 R$ ")
   escreva("\n")
   escreva ( "\nInforme o Item desejado: ")
   leia(Item)
   // caso 1 

   se (Item == 1){
      escreva ("Digite a quantidade: ")
      leia(Quantidade)
      Valor = (10.00 * Quantidade)
      escreva ("\n Produto : ", Item)
      escreva ("\n Valor total do produto: ", Valor, " R$")
   }
   se (Item == 2){
      escreva ("Digite a quantidade: ")
      leia(Quantidade)
      Valor = (15.00 * Quantidade)
      escreva ("\n Produto : ", Item)
      escreva ("\n Valor total do produto: ", Valor, " R$")
   }
   // caso 3
      se (Item == 3){
      escreva ("Digite a quantidade: ")
      leia(Quantidade)
      Valor = (18.00 * Quantidade)
      escreva ("\n Produto : ", Item)
      escreva ("\n Valor total do produto: ", Valor, " R$")
   }

   // caso 4
      se (Item == 4){
      escreva ("Digite a quantidade: ")
      leia(Quantidade)
      Valor = (12.00 * Quantidade)
      escreva ("\n Produto : ", Item)
      escreva ("\n Valor total do produto: ", Valor, " R$")
   }
   // caso 5
      se (Item == 5){
      escreva ("Digite a quantidade: ")
      leia(Quantidade)
      Valor = (8.00 * Quantidade)
      escreva ("\n Produto : ", Item)
      escreva ("\n Valor total do produto: ", Valor, " R$")
   }

   // caso 6
      se (Item == 6){
      escreva ("Digite a quantidade: ")
      leia(Quantidade)
      Valor = (13.00 * Quantidade)
      escreva ("\n Produto : ", Item)
      escreva ("\n Valor total do produto: ", Valor, " R$")
   }



//exercicio 03

programa {
  
  funcao inicio() {
    inteiro  idade

    escreva ("\n Informe sua Idade: ")
    leia(idade)

    se (idade >= 65){
      escreva("A pessoa está apta a votar e o voto é facultativo.")
    }
    senao se {
      (idade >= 18 e idade < 65 ){
        escreva("A pessoa está apta a votar e o voto é Obrigatorio!.")
      }
    senao se {
      (idade >= 16 e idade < 18 ){
        escreva("A pessoa está apta a votar e o voto é facultativo")
      }
    senao se {
      (idade >= 18 e idade < 65 ){
        escreva("A pessoa está apta a votar ")
      }

    }
  }
}

//exercicio 04
programa {

  inclua biblioteca Matematica

  funcao inicio() {

    real salario

    escreva("Digite seu salário para a vericação de imposto de renda:")
    leia(salario)
    salario = Matematica.arredondar(salario, 2)

    se(salario <= 2000.00)
      escreva("Isento de imposto.")
    senao se(salario >= 2000.01 e salario <= 3000.00)
      escreva("O imposto é de: \nR$", (salario * (8/100)))
    senao se(salario >= 3000.01 e salario <= 4500.00)
      escreva("O imposto é de: \nR$", (salario * (18/100)))
    senao
      escreva("O imposto é de: \nR$", (salario * (28/100)))
  }
}

// exercicio 5
programa {
  funcao inicio() {
    
 cadeia palavra,tipo,tipo2

 escreva("Qual tipo de animal: Vertebrado ou Invertebrado ")
 leia(palavra)




se(palavra == "vertebrado"){

     escreva("Escolha Ave ou Mamifero ")
     leia(tipo)

            se(tipo == "ave"){
            escreva("Escolha carnivoro ou onivoro ")
            leia(tipo2)

                  se(tipo2 == "carnivoro"){

                  escreva("Seu animal é Águia")
                  }senao{
                  escreva("Seu animal é Pomba")
                  }


     }senao{
//mamifero

     escreva("Escolha herbivoro ou onivoro")
     leia(tipo2)

             se(tipo2 =="herbivoro"){

             escreva("Seu animal é Vaca")
             }senao{
             escreva("Seu animal é homem")
             }

        }  


  
}senao{
//invertebrado

escreva("Escolha Inseto ou anelideo ")
leia(tipo)

se(tipo == "Inseto"){
escreva("Escolha hematofago ou herbivoro ")
leia(tipo2)

se(tipo2=="hematofago"){

escreva("Seu animal é pulga")

}senao{
  //herbivoro
  escreva("Seu animal é lagarta")
}

}senao{
  //anelideo
  escreva("Escolha hematofago ou herbivoro ")
leia(tipo2)

se(tipo2=="herbivoro"){
escreva("Seu animal é minhoca")
}senao{
escreva("Seu animal é sanguessuga")
}


}


}

  }
}
