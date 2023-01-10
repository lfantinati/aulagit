package AtividadesJava;
import java.util.*;
public class AtividadeGeralJava {
    public static class Exercicio1 {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            double salario;
            double abono;



            System.out.println("Digete o salario:");
            salario = ler.nextDouble();
            System.out.println("Digite o Abono :");
            abono = ler.nextDouble();
            System.out.printf("Novo salrio é %.2f", Math.abs(salario+abono));
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////
    public static class Exercicio2 {
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
        }
    }
    //////////////////////////////////////////////////////////////////////////////////////
    public static class Exercicio3 {
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
    //////////////////////////////////////////////////////////////////////////////////
    public static class Exercicio4 {
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
}
