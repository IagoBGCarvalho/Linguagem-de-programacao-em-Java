package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Imovel;
import negocio.Novo;
import negocio.Usado;

public class PrincipalImobiliaria {
	public static void main(String[] args) {
		// Declaração de variáveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Imovel objImovel = null;
		String tipo = "";
		
		// Entrada de dados
		try {
			do {
				System.out.print("Digite <N> para novo ou <U> para usado: ");
				tipo = leitor.readLine();
			} while ((! tipo.equalsIgnoreCase("N")) && (! tipo.equalsIgnoreCase("U")));
			
			if (tipo.equalsIgnoreCase("N")) {
				objImovel = new Novo();
			} else {
				objImovel = new Usado();
			}
			
			System.out.print("Digite o endereço: ");
			objImovel.setEndereco(leitor.readLine());
			
			System.out.print("Digite a metragem: ");
			objImovel.setMetragem(Double.parseDouble(leitor.readLine()));
			
			System.out.print("Digite o valor: ");
			objImovel.setValor(Double.parseDouble(leitor.readLine()));
			
			if (tipo.equalsIgnoreCase("N")) {
				System.out.print("Digite o adicional: ");
				((Novo) objImovel).setAdicional(Double.parseDouble(leitor.readLine()));
			} else {
				System.out.print("Digite a depreciação: ");
				((Usado) objImovel).setDepreciacao(Double.parseDouble(leitor.readLine()));
			}
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		// Saída de dados
		System.out.println("Endereço: " + objImovel.getEndereco());
		System.out.println("Metragem: " + objImovel.getMetragem());
		System.out.println("Valor: " + objImovel.getValor());
	}

}
