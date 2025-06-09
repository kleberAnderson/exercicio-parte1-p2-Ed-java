package view;

import controller.BArvore;
import controller.BinNo;

public class Main {

	public static void main(String[] args) {
		BArvore arv = new BArvore();
		arv.inserirNo(new BinNo(14));
		arv.inserirNo(new BinNo(16));
		arv.inserirNo(new BinNo(12));
		arv.inserirNo(new BinNo(11));
		arv.inserirNo(new BinNo(17));
		arv.inserirNo(new BinNo(15));
		arv.inserirNo(new BinNo(10));
		arv.inserirNo(new BinNo(13));
		
		arv.exibir();
		//Exercício 1:
		System.out.println();
		arv.nivel();
		arv.exibirNiveis();
		System.out.println();
		//Exercício 2:
		arv.contarArvore();
		System.out.println();
		//Exercício 3:
		arv.encontrarValor(13);
		System.out.println();
		
		arv.remover(15);
		arv.exibir();
		
	}

}
