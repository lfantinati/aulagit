package LacosDeRepeticao;
import java.util.Scanner;

public class Atividade1_lacosDeRepeticao {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num, par = 0, impar = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + " número: ");
            num = ler.nextInt();
            if (num % 2 == 0) {
                par += 1;


            } else impar += 1;
        }

        System.out.println("Total de números pares: " + par + "\n Total de número impares: " + impar);
    }
}



