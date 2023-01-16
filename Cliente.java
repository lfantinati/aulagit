package Java_Poo;

public class Cliente {

    private String nome;
    private static int idade;
    private String sexo;
    private int fone;
    private String cidade;

    public Cliente() {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.fone = fone;
        this.cidade = cidade;
    }

    String getNome(){
        return nome;
    }
    void setNome(String nome){
        this.nome = nome;
    }
    int getIdade(){
        return idade;
    }
    void setIdade(int idade){
        this.idade = idade;
    }
    String getSexo(){
        return sexo;
    }
    void setSexo(String sexo){
        this.sexo = sexo;
    }
    int getFone(){
        return fone;
    }
    void setFone(int fone){
        this.fone = fone;
    }
    String getCidade(){
        return cidade;
    }
    void setCidade(String cidade){
        this.cidade = cidade;
    }

}
