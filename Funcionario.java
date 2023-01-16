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
