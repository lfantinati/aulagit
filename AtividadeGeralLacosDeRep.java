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

/////////////////////////////////////////////////////////////

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
////////////////////////////////////////////////////////////////////

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


///////////////////////////////////////////////////////////////////////////
