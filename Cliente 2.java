package Heranca_poli;


public class Cliente {
    private int cpf;

    public Cliente(int cpf) {
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void visualizar() {

        System.out.println("\n\n**");
        System.out.println("os dados do cliente:");
        System.out.println("**");
        System.out.println("CPF número do CPF: " + this.cpf);

    }
}
