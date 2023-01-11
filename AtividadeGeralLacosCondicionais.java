package Lacos_Condicionais;

import java.util.Scanner;

class Atividade1_lacosCondicionais {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int a,b,c;
        int soma;
        System.out.println("Digite o numero A");
        a = ler.nextInt();
        System.out.println("Digite o numero B");
        b = ler.nextInt();
        System.out.println("Digite o numero C");
        c = ler.nextInt();


        soma = a + b ;

        if (soma > c ) {
            System.out.println( a +"+"+ b +"="+soma+">"+c+ "\n");
            System.out.println("A Soma de A + B é maior do que C " );
        }
        else if(soma < c ){
            System.out.println( a +"+"+ b +"="+soma+"<"+c+ "\n");
            System.out.println("A Soma de A + B é menor do que C " );
        }else {
            System.out.println( a +"+"+ b +"="+soma+"="+c+ "\n");
            System.out.println("A Soma de A + B é igual a C " );
        }



    }
}

//////////////////////////////ATIVIDADE2/////////////////////////////////////

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

////////////////////////////////ATIVIDADE3///////////////////////////////////

package Lacos_Condicionais;

        import java.util.Scanner;

public class Atividade3_lacosCondicionais {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num;

        System.out.println("Digite um numero: ");
        num = ler.nextInt();

        if (num % 2 == 0) {

            System.out.println(" O numero: " + num + " è Par e positivo\n");

        }else if (num % 2 >= 0) {

            System.out.println(" O numero: " + num + " è impar e positivo\n");
        }else {

            System.out.println("O numero: " + num + " è impar e negativo\n");
        }

    }

}

///////////////////////////////////////////////////////////////////////////////////////