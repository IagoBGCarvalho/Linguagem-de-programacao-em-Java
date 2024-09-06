package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Cilindro;
import negocio.Cubo;
import negocio.Solido;

public class PrincipalGeometria {
	public static void main(String[] args) {
		//Declaração de variaveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		Solido objSolido = null;
		
		//Entrada de dados
		try {
			System.out.print("Digite <CU> para cubo ou " + " <CIL> para cilindro:");
			
			if (leitor.readLine().equalsIgnoreCase("CU")) {
				objSolido = new Cubo();
				System.out.print("Digite a aresta: ");
				((Cubo) objSolido).setAresta(Double.parseDouble(leitor.readLine()));
			} else { 
				objSolido = new Cilindro();
				System.out.print("Digite o raio: ");
				((Cilindro) objSolido).setRaio(Double.parseDouble(leitor.readLine()));
				
				System.out.print("Digite a altura: ");
				((Cilindro) objSolido).setAltura(Double.parseDouble(leitor.readLine()));
			} 
			
		} catch (Exception erro) {}
		
		//Saida de dados
		System.out.println("Área total do Sólido: " + objSolido.calcularArea());
		System.out.println("Volume do Sólido: " + objSolido.calcularVolume());
	}

	}