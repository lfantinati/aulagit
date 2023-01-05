
programa {
  funcao inicio() {
    
		
		inteiro vetorInteiros[10] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}, j, i, copia, tm

		
		tm = 10

		
		para(i = 0; i < tm - 1; i++){
      		para(j = 0; j < tm - 1 - i; j++){
		        se(vetorInteiros[j] < vetorInteiros[j+1]){
		          copia = vetorInteiros[j]
		          vetorInteiros[j] = vetorInteiros[j+1]
		          vetorInteiros[j+1] = copia
		        }
      		}
    		}
    		
		escreva("\nVetor de Numeros Inteiros Ordenados: \n")
		
		para(inteiro indice=0; indice < tm; indice ++){
			escreva(indice + 1, "º Numero: ", vetorInteiros[indice], "\n")
		}
  }
}