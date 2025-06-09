package view;

import java.io.IOException;

import model.Lista;

public class Principal {
	public static void main(String[] args) throws Exception {
		Lista cont = new Lista();

		try {
			cont.addFirst(0);
			cont.addLast(1);
			cont.addLast(2);
			cont.addLast(5);
			cont.addLast(3);
			System.out.println("Elementos da lista pos adição:");
			for(int i = 0; i < cont.size(); i++) {
				int valor = cont.get(i);
				System.out.print(" <"+valor+"> ");
			}
			
			cont.remove(3);
			
			System.out.println("\nElementos da lista pos remoção do valor de 5 por índice (3):");
			for(int i = 0; i < cont.size(); i++) {
				int valor = cont.get(i);
				System.out.print(" <"+valor+"> ");
			}
			System.out.println("\nBusca de um elemento por índice (3)");
			System.out.print(" <"+cont.get(3)+"> ");
			
			cont.inverter();
			System.out.println("\nLista invertida:");
			for(int i = 0; i < cont.size(); i++) {
				int valor = cont.get(i);
				System.out.print(" <"+valor+"> ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
}
