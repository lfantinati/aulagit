package AtividadesJava;

import java.util.*;
public class Exercicio4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        float num1;
        float num2;
        float num3;
        float num4;
        float diferenca;



        System.out.println("Digite o 1 numero:");
        num1 = ler.nextFloat();
        System.out.println("Digite o 2 numero:");
        num2 = ler.nextFloat();
        System.out.println("Digite o 3 numero:");
        num3 = ler.nextFloat();
        System.out.println("Digite o 4 numero:");
        num4 = ler.nextFloat();

        diferenca = ((num1 * num2) - (num3 * num4 ));
        System.out.printf("O salario liquido é..%.2f:", diferenca);
    }



}
