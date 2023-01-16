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

