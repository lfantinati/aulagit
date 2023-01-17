package Heranca_poli;



public class PessoaJuridica extends PessoaFisica{

    private int cnpj;
    private int conta;

    public PessoaJuridica(int cpf, String nome, int rg, int cnpj, int conta) {
        super(cpf, nome,rg);
        this.cnpj = cnpj;
        this.conta = conta;

    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }



    @Override
    public void visualizar() {

        super.visualizar();
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("A conta da Pessoa juridica: " + this.conta);


    }
}





