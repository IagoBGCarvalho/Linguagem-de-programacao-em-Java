package Aula02.src.apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Aula02.src.negocio.Estante;
import Aula02.src.negocio.Produto;

public class PrincipalControleDeEstoque {
    public static void main(String[] args) {
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        Produto objProduto = new Produto();

        // Entradad de dados
        try {
            System.out.print("Digite o nome do produto: ");
            objProduto.setNome(leitor.readLine());

            System.out.print("Digite o número da estante: ");
            objProduto.setObjEstante(new Estante(Integer.parseInt(leitor.readLine())));

            System.out.print("Digite a quantidade: ");
            objProduto.setQuantidade(Integer.parseInt(leitor.readLine()));
        } catch (Exception erro) {}

        // Saída de dados
        System.out.println("O nome do produto é: " + objProduto.getNome());
        System.out.println("O número da estante é: " + objProduto.getObjEstante().getNumero());
        System.out.println("A quantidade é: " + objProduto.getQuantidade());
    }

}
