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

package Java_Poo;

public class TestaCliente {
    public static void main(String[] args) {

        Cliente c = new Cliente();
        c.setNome("Luciano Fantinati");
        c.setIdade(30);
        c.setSexo("Masculino");
        c.setFone(912345678);
        c.setCidade("Carapicuiba-SP");
        System.out.println(c.getNome());
        System.out.println("idade "+ c.getIdade()+ " anos");
        System.out.println("Sexo " + c.getSexo());
        System.out.println("Telefone (11)" +c.getFone());
        System.out.println("Cidade " + c.getCidade());

    }
}


///////////////////////////////////////////////////////

package Java_Poo;

public class Funcionario {

    private String nome;
    private static int id;
    private String sexo;
    private String setor;
    private String cargo;

    public Funcionario() {
        this.nome = nome;
        this.id = id;
        this.sexo = sexo;
        this.setor = setor;
        this.cargo = cargo;
    }

    String getNome(){
        return nome;
    }
    void setNome(String nome){
        this.nome = nome;
    }
    int getId(){
        return id;
    }
    void setId(int id){
        this.id = id;
    }
    String getSexo(){
        return sexo;
    }
    void setSexo(String sexo){
        this.sexo = sexo;
    }
    String getSetor(){
        return setor;
    }
    void setSetor(String setor){
        this.setor = setor;
    }
    String getCargo(){
        return cargo;
    }
    void setCargo(String cargo){
        this.cargo=cargo;
    }

}

package Java_Poo;

public class TestaFuncionario {

    public static void main(String[] args) {

        Funcionario f = new Funcionario();
        f.setNome("Marcos");
        f.setId(17719);
        f.setSexo("Masculino");
        f.setSetor("Backend");
        f.setCargo("Segurança");
        System.out.println("Nome do Funcionario: "+f.getNome());
        System.out.println("Id: "+ f.getId());
        System.out.println("Sexo: " + f.getSexo());
        System.out.println("O Setor: " +f.getSetor());
        System.out.println("o Cargo:  " + f.getCargo());
    }
}


////////////////////////////////////////////////////

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

package Java_Poo;

        import java.util.*;
public class TestaProduto {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.setNome("Cadeira gamer scorpion-X");
        p.setPreco(1.200);
        p.setQuantidade(10);
        p.setCor("Preto e Vermelho");
        p.setFuncionalidade(" com porta copos e ajustes eletricos.");
        System.out.println("Nome do produto: "+p.getNome());
        System.out.printf("\nO preço do produto $ %.3f", Math.abs(p.getPreco()));
        System.out.println("\nCor do produto: " + p.getCor());
        System.out.println("A Quantidade :" +p.getQuantidade());
        System.out.println("A Funcionalidade:" + p.getFuncionalidade());
    }
}

//////////////////////////////////////////////////////////