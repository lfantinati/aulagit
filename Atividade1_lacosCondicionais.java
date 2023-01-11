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
