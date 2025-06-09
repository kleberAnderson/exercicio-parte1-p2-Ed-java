package view;

import controller.ListaDuplaEncController;

public class Principal {

	public static void main(String[] args) {
		ListaDuplaEncController noDuplo = new ListaDuplaEncController();
		noDuplo.inserirInicio(5);
		noDuplo.inserirInicio(2);
		noDuplo.inserirInicio(1);
		noDuplo.inserirFim(4);
		
		
		noDuplo.ImprimirFrente();
		noDuplo.ImprimirTras();
		
		noDuplo.removerNo(5);
		
		noDuplo.AdicionarNaPosicao(2, 3);
		noDuplo.ImprimirFrente();
	}

}
