programa {
  funcao inicio() {
    inteiro numero[10], soma = 0, qnt = 0
    real media = 0.0

    para(inteiro i =0; i < 10; i++){
      escreva("Digite o ", i + 1, "� Numero: ")
      leia(numero[i])

      qnt++
      soma += numero[i]
      media = soma / qnt
    }

    escreva("Elementos nos �ndices �mpares: ")
    para(inteiro i = 0; i < 10; i++){
      se(i % 2 != 0){
        escreva(numero[i], " ")
      }
    }

    escreva("\n")
    escreva("Elementos pares: ")
    para(inteiro i = 0; i < 10; i++){
      se(numero[i] % 2 == 0){
        escreva(numero[i], " ")
      }
    }

    escreva("\n")
    escreva("Soma: ", soma)
    escreva("\n")
    escreva("M�dia: ", media)
  }
}