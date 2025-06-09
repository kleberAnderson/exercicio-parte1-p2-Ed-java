package controller;

public class NoDuplo {
	int dado;
	NoDuplo proximo;
	NoDuplo anterior;

	NoDuplo(int valor) {
		this.dado = valor;
		this.proximo = null;
		this.anterior = null;
	}

}
