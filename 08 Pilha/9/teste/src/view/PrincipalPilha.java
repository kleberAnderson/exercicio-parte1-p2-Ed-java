package view;

import model.Pilha;

public class PrincipalPilha {

	public static void main(String[] args) {
		Pilha pilha = new Pilha(5);
		
		//isEmpty
		if(pilha.isEmpty()) {
			System.out.println("Pilha vazia!\n");
		} else {
			System.out.println("Pilha Não Vazia!\n");
		}
		
		//push
		pilha.push(5);
		pilha.push(32);
		pilha.push(2);
		pilha.push(90);
		pilha.push(7);
		
		pilha.mostrar();
		//pop
		System.out.println("\nRemovendo da pilha ==> "+pilha.pop());
		System.out.println("\nRemovendo da pilha ==> "+pilha.pop());
		//peek
		System.out.println("\nExibindo elemento sem remover ==> "+pilha.peek());
		
		//isEmpty
				if(pilha.isEmpty()) {
					System.out.println("\nPilha vazia!");
				} else {
					System.out.println("\nPilha Não Vazia!");
				}
		//size
		System.out.println("\nTamanho da Pilha ==> "+pilha.size());
		pilha.mostrar();
		
	}
}
