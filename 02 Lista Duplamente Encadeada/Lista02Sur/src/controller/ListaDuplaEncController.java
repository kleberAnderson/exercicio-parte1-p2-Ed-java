package controller;

public class ListaDuplaEncController {
	private NoDuplo inicio;
	private NoDuplo fim;
	
	public void inserirInicio(int valor) {
		NoDuplo novo = new NoDuplo(valor);
		if(inicio == null) {
			inicio = fim =novo;
		} else {
			novo.proximo = inicio;
			inicio.anterior = novo;
			inicio = novo;
		}
	}
	
	public void inserirFim(int valor) {
		NoDuplo novo = new NoDuplo(valor);
		if(fim == null) {
			fim = inicio = novo;
		} else {
			fim.proximo = novo;
			novo.anterior = fim;
			fim = novo;
		}
	}
	
	public void removerNo(int valor) {
		NoDuplo novo = inicio;
		System.out.println("\nExclusão do dado " + valor);
		while(novo != null && novo.dado != valor) {
			novo = novo.proximo;
		}
		
		if(novo == null) {
			System.out.println("Valor não encontrado");
			return;
		}
		//se o elemento a ser removido estiver no inicio
		if(novo == inicio) {
			inicio = novo.proximo;
		//verificação e desligamento da refeência do dado anteirior
			if(inicio != null) {
				inicio.anterior = null;
			} else {
				fim = null;
			}
		} 
		else if (novo == fim) {
			fim = novo.anterior;
			if (fim  != null) {
				fim.proximo = null;
			}
		} 
		else {
			novo.anterior.proximo = novo.proximo;
			novo.proximo.anterior = novo.anterior;
			
		}
	}
	
	public void ImprimirFrente() {
		NoDuplo no = inicio;
		System.out.println("Dados do NoDuplo do inicio para o fim: ");
		while(no != null) {
			System.out.print(" <"+no.dado+"> ");
			no = no.proximo;
		}
	}
	
	public void ImprimirTras() {
		NoDuplo no = fim;
		System.out.println("\nDados do NoDuplo do fim para o inicio: ");
		while(no != null) {
			System.out.print(" <"+no.dado+"> ");
			no = no.anterior;
		}
	}
	public void AdicionarNaPosicao(int index, int valor) {
		System.out.println("Adição do dado 3 no índice 2: ");
		NoDuplo novo = new NoDuplo(valor);
		if(index == 0) {
			if(this.inicio == null) {
				this.inicio = novo;
				this.fim = novo;
			}else {
				inserirInicio(valor);
			}
		} else {
			NoDuplo atual = inicio;
			for(int i = 0; i < index; i++) {
				atual = atual.proximo;
			}
			NoDuplo anterior = atual.anterior;
			novo.proximo = atual;
			novo.anterior = anterior;
			anterior.proximo = novo;
			atual.anterior = novo;
		}
	}
}
