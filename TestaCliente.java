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
