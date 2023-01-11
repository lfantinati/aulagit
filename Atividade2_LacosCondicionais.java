package Lacos_Condicionais;
 import java.util.Scanner;

public class Atividade2_LacosCondicionais {
    public static void main(String[] args) {

        Scanner ler =new Scanner(System.in);
        float produto, quantidade;


        System.out.println("--Digite 1 para Cachorro-quente --\n");
        System.out.println("--Digite 2 para X-Salada --\n");
        System.out.println ("--Digite 3 para X-Bacon--\n");
        System.out.println("--Digite 4 para Bauru--\n");
        System.out.println("--Digite 5 para Refrigerante--\n");
        System.out.println("--Digite 6 Suco de laranja--\n");
        produto = ler.nextFloat();

        System.out.println("Quantidade");
        quantidade = ler.nextFloat();

        switch ((int) produto)
        {
            case 1:
                System.out.printf("Cachorro-quente\n"+" Valor total é:%.2f",Math.abs(quantidade * 10.00));
                break;
            case 2:
                System.out.printf("X-Salada\n"+" Valor total é:%.2f",Math.abs(quantidade * 15.00));
                break;
            case 3:
                System.out.printf("X-bacon\n"+" Valor total é:%.2f",Math.abs(quantidade * 18.00));
                break;

            case 4:
                System.out.printf("Bauru\n"+" Valor total é:%.2f",Math.abs(quantidade * 12.00));
                break;

            case 5:
                System.out.printf("Refrigerante\n"+" Valor total é:%.2f",Math.abs(quantidade * 8.00));
                break;

            case 6:
                System.out.printf("Suco de laranja\n"+" Valor total é:%.2f",Math.abs(quantidade * 13.00));
                break;


        }


    }
}
