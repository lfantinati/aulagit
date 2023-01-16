package Java_Poo;

public class Produto {
    private double preco;
    private String nome;
    private int quantidade;
    private String cor;
    private String funcionalidade;


    public Produto() {
        this.nome = nome;
        this.quantidade = quantidade;
        this.cor = cor;
        this.preco = preco;
        this.funcionalidade = funcionalidade;
    }

    String getNome(){
        return nome;
    }
    void setNome(String nome){
        this.nome = nome;
    }
    double getPreco(){
        return preco;
    }
    void setPreco(double preco){
        this.preco = preco;
    }
    int getQuantidade(){
        return quantidade;
    }
    void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    String getCor(){
        return cor;
    }
    void setCor(String cor){
        this.cor = cor;
    }
    String getFuncionalidade(){
        return funcionalidade;
    }
    void setFuncionalidade(String funcionalidade){
        this.funcionalidade = funcionalidade;
    }
}