package LacosDeRepeticao;

import java.util.Scanner;

public class Atividade2_lacosDeRepeticao {

    public static void main(String[] args) {

        int idmaior = 0,idmenor =0, idade, contador = 1;
        Scanner leia = new Scanner(System.in);

        while (contador < 12) {
            System.out.println("Digite uma idade " + contador);
            idade = leia.nextInt();
            if (idade < 21 && idade > 0){
                idmenor = idmenor +1;

            }else if (idade > 50) {
                idmaior = idmaior +1;

            }




            contador++;
        }
        System.out.println("Idade menor que 21 anos é :" +idmenor);
        System.out.println("idade maior que 50 anos é:"+idmaior);
        System.out.println("\t\t__Fim do programa__");
    }
}
















