package AtividadesJava;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float salarioBruto;
        float adicionalN;
        float horasExt;
        float desconto = 200.00F;
        float salarioLiq;


        System.out.println("Digite o salario bruto:");
        salarioBruto = ler.nextFloat();
        System.out.println("Digite o adicional noturno:");
        adicionalN = ler.nextFloat();
        System.out.println("Digite as horas extras:");
        horasExt = ler.nextFloat();
        //System.out.println("Digite os descontos:");
        //nota4 = ler.nextFloat();

        salarioLiq = (salarioBruto + adicionalN + (horasExt *5) ) - desconto;
        System.out.printf("O salario liquido é é %.2f:", Math.abs(salarioLiq));
    }
}




