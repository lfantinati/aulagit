programa {
  funcao inicio() {
    
    
    inteiro numero[10], soma = 0, qnt = 0
    real media = 0.0

    para(inteiro i =0; i < 10; i++){
       escreva("Digite o ", i + 1, "º Numero: ")
       leia(numero[i])

       qnt++
       soma += numero[i]
        media = soma / qnt
       escreva("Soma: ", soma)
      
       se(soma == 10 ){
       escreva("TOP, "soma)
      }
    }
     
  }

  
}






