package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Compra;
import negocio.Produto;
import negocio.Tipo;

public class PrincipalAmazon {
	
	public static void main(String[] args) {
		// Declaração de variáveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Produto objProduto = new Produto();
		Compra objCompra = new Compra();
		
		// Entrada de dados
		try {
			
			System.out.print("Digite o nome do produto: ");
			objProduto.setNome(leitor.readLine());
			
			System.out.print("Digite o tipo do produto: ");
			objProduto.setObjTipo(new Tipo(leitor.readLine()));
			
			System.out.print("Digite o preço do produto: ");
			objProduto.setPreco(Double.parseDouble(leitor.readLine()));
			
			objCompra.setObjProduto(objProduto);
			
			System.out.print("Digite a quantidade de produtos: ");
			objCompra.setQuantidade(Integer.parseInt(leitor.readLine()));
			
			System.out.print("Digite a data da compra: ");
			objCompra.setData(leitor.readLine());
			
			System.out.print("Digite o cartão de crédito da compra: ");
			objCompra.setCarta(leitor.readLine());
			
		} catch (Exception erro) {}
		
		// Saída de dados
		System.out.println("Nome do produto: " + objCompra.getObjProduto().getNome());
		System.out.println("Tipo do produto: " + objCompra.getObjProduto().getObjTipo().getDescricao());
		System.out.println("Data da compra: " + objCompra.getData());
		System.out.println("Valor total da compra: " + objCompra.getObjProduto().getPreco() * objCompra.getQuantidade());
	}

}
