package Aula02.src.apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Aula02.src.negocio.Livro;
import Aula02.src.negocio.Autor;

public class PrincipalLivraria {
    public static void main(String[] args) {
        // Declaração de variáveis
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        Livro objLivro = new Livro();

        // Entrada de dados
        try {
            System.out.print("Digite o título do livro: ");
            objLivro.setTitulo(leitor.readLine());

            System.out.print("Digite o nome do autor do livro: ");
            objLivro.setObjAutor(new Autor(leitor.readLine()));

            System.out.print("Digite o gẽnero do livro: ");
            objLivro.setGenero(leitor.readLine());
        } catch (Exception erro) {}

        // Saída de dados
        System.out.println("Nome do livro: " + objLivro.getTitulo());
        System.out.println("Autor do livro: " + objLivro.getObjAutor().getNome());
        System.out.println("Gẽnero do livro: " + objLivro.getGenero());

    }

}
