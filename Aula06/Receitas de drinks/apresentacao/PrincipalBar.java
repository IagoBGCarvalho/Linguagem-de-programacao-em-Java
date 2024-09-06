package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Caipirinha;
import negocio.Drink;
import negocio.DryMartini;
import negocio.Mixer;
import negocio.MoscowMule;
import negocio.OldFashion;

public class PrincipalBar {
	public static void main(String[] args) throws Exception {
		//Declaração de variaveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Mixer objMixer = null;
		
		//Entrada de dados
		System.out.println("+=================+");
		System.out.println("| Menu de Bar | ");
		System.out.println("+=================+");
		System.out.println("| 1 - Caipirinha  |");
		System.out.println("| 2 - Dry Martini |");
		System.out.println("| 3 - Old Fashion |");
		System.out.println("| 4 - Moscow Mule |");
		System.out.println("+=================+");
		System.out.println("Digite sua opção: ");
		switch (Integer.parseInt(leitor.readLine())) {
		case 1:
			objMixer = new Caipirinha();
			break;
		case 2: objMixer = new DryMartini();
			break;
		case 3:
			objMixer = new OldFashion();
			break;
		case 4:
			objMixer = new MoscowMule();
			break;
		}
		objMixer.misturar();
		((Drink) objMixer).beber();
	}
}