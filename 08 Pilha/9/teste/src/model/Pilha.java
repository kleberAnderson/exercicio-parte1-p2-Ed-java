package model;

public class Pilha{
	private Integer[] elementos;
	private int topo;
	
	public Pilha(int capacidade) {
		elementos = new Integer[capacidade];
		topo = -1;
	}
	public void push(int elemento) {
		if(isFull()) {
			throw new IllegalStateException("Pilha cheia!");
		}
		topo++;
		elementos[topo] = elemento;
	}
	public boolean isFull() {
		return topo == elementos.length - 1;
	}
	public Integer pop() {
		if(isEmpty()) {
			throw new IllegalStateException("A pilha está vazia");
		}
		Integer elementoRemovido = elementos[topo];
		elementos[topo] = null;
		topo--;
		return elementoRemovido;
	}
	public boolean isEmpty() {
		return topo == -1;
	}
	public int size() {
		return elementos.length;
	}
	public int peek() {
		return elementos[0];
	}
	public void mostrar() {
		for (int i = topo ; i >= 0; i--) {
			System.out.println("==> "+ elementos[i]);
		}
	}
}
