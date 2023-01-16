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
