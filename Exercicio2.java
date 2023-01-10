package AtividadesJava;

import java.util.*;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float media;


        System.out.println("Digite a nota1");
        nota1 = ler.nextFloat();
        System.out.println("Digite a nota2");
        nota2 = ler.nextFloat();
        System.out.println("Digite a nota3");
        nota3 = ler.nextFloat();
        System.out.println("Digite a nota4");
        nota4 = ler.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) /4;
        System.out.printf("Media final é %.1f", Math.abs(media));
        //System.out.println("Média final é:" + media);
        //media = ler.nextFloat();



    }
}