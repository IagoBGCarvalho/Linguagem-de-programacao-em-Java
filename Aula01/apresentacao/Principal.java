package Aula01.src.apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Aula01.src.negocio.Pessoa;

public class Principal {

    public static void main(String[] args) {
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        Pessoa objeto1 = new Pessoa("Iago", "Asa Sul", "99999");
        Pessoa objeto2 = new Pessoa();

        // Entrada de dados
        try {
            System.out.print("Digite o nome: ");
            objeto2.setNome(leitor.readLine());

            System.out.print("Digite o endereço: ");
            objeto2.setEndereco(leitor.readLine());

            System.out.print("Digite o telefone: ");
            objeto2.setTelefone(leitor.readLine());
        } catch (Exception erro) {}

        // Saída de dados
        System.out.println();
        System.out.println("Primeira pessoa: \n" + "Nome: " + objeto1.getNome() + ", Endereço: " + objeto1.getEndereco() + ", Telefone: " + objeto1.getTelefone());
        System.out.println();
        System.out.println("Segunda pessoa: \n" + "Nome: " + objeto2.getNome() + ", Endereço: " + objeto2.getEndereco() + ", Telefone: " + objeto2.getTelefone());
    }

}
