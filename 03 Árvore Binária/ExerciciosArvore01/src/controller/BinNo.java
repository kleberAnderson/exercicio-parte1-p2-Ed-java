package controller;

public class BinNo {
	int valor;
	BinNo esq, dir;
	int nivel;
	
	public BinNo(int valor) {
		this.valor = valor;
		esq = dir = null;
		this.nivel = -1;
	}
}
