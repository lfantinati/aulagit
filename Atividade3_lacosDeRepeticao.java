package LacosDeRepeticao;

import java.util.Scanner;

public class Atividade3_lacosDeRepeticao {
    public static void main(String[] args) {
        int numero;
        int soma = 0;
        int contador = 0;
        Scanner leia = new Scanner(System.in);

        do {
            System.out.println("\nDigite um número: ");
            numero = leia.nextInt();

            if (numero > 0)
                soma = soma + numero;




        } while (numero != 0);

        System.out.println("A soma dos números positivos é : "+ soma);
        contador ++;
    }
}
