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