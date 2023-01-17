package Heranca_poli;

public class HerancaGeral_poli {


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

}

///////////////////////////////////////////////////////////

package Heranca_poli;



public class PessoaFisica extends Cliente{

    private String nome;
    protected int rg;

    public PessoaFisica(int cpf, String nome, int rg) {
        super(cpf);
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    @Override
    public void visualizar() {

        super.visualizar();
        System.out.println("O nome da pessoa física: " + this.nome);
        System.out.println("RG da pessoa Fisica: " + this.rg);

    }
}

//////////////////////////////////////////////////////////////////////

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


/////////////////////////////////////////////////////////


package Heranca_poli;



public class TestaClienteGeral {
    public static void main(String[] args) {


        PessoaJuridica aut1 = new PessoaJuridica(37245897,"Lucas", 448785645, 25612548-001, 4745);

        aut1.visualizar();

    }

}



///////////////////////////////////////////////////////////////////





