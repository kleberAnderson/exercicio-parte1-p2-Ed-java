package controller;

public class BArvore {
	private BinNo raiz;

	public void inserirNo(BinNo novoNo) {
		raiz = inserir(raiz, novoNo);
	}

	private BinNo inserir(BinNo atual, BinNo novoNo) {
		if(atual == null)
			return novoNo;
		else if (novoNo.valor < atual.valor)
			atual.esq = inserir(atual.esq, novoNo);
		else
			atual.dir = inserir(atual.dir, novoNo);
		return atual;
	}
	
	public void exibir() {
		System.out.println("Exibir elementos de árvore: ");
		exibirArvore(raiz);
	}

	private void exibirArvore(BinNo atual) {
		if(atual != null) {
			exibirArvore(atual.esq);
			System.out.println(atual.valor);
			exibirArvore(atual.dir);
		}
	}
	
	public void contarArvore() {
		System.out.println("Qtd de Elementos de uma árvore binária ==> " + contar(raiz));
	}

	private int contar(BinNo raiz) {
		if(raiz == null) {
			return 0;
		}
		int esq = contar(raiz.esq);
		int dir = contar(raiz.dir);
		return 1 + esq + dir;
	}
	
	public void encontrarValor(int valor) {
		System.out.println("Busca do valor ==> "+valor);
		BinNo atual = raiz;
		
		while(atual != null) {
			System.out.println("==> "+atual.valor);
			if(valor == atual.valor) {
				System.out.println("Valor encontrado!");
				return;
			} else if(valor < atual.valor) {
				atual = atual.esq;
			} else {
				atual = atual.dir;
			}
		}
		System.out.println("Valor não encontrado!");
	}
	
	public void nivel() {
		IncrementarNivel(raiz, 0);
	}

	private void IncrementarNivel(BinNo atual, int i) {
		if(atual != null) {
			atual.nivel = i;
			IncrementarNivel(atual.esq, i + 1);
			IncrementarNivel(atual.dir, i + 1);
		}
	}
	
	public void exibirNiveis() {
		exibirNumNivel(raiz);
	}

	private void exibirNumNivel(BinNo raiz) {
		if(raiz != null) {
			exibirNumNivel(raiz.esq);
			System.out.println(" valor ==> "+ raiz.valor + " nível ==> "+ raiz.nivel);
			exibirNumNivel(raiz.dir);
		}
	}
	public void remover(int valor) {
		System.out.println("Remover valor ("+valor+")");
        raiz = removerRec(raiz, valor);
    }

    private BinNo removerRec(BinNo atual, int valor) {
        if (atual == null) return null;

        if (valor < atual.valor) {
            atual.esq = removerRec(atual.esq, valor);
        } else if (valor > atual.valor) {
            atual.dir = removerRec(atual.dir, valor);
        } else {
            // Caso 1 e 2: sem filho ou 1 filho
            if (atual.esq == null)
                return atual.dir;
            else if (atual.dir == null)
                return atual.esq;

            // Caso 3: dois filhos
            atual.valor = menorValor(atual.dir);
            atual.dir = removerRec(atual.dir, atual.valor);
        }
        return atual;
    }
    private int menorValor(BinNo raiz) {
        int min = raiz.valor;
        while (raiz.esq != null) {
            raiz = raiz.esq;
            min = raiz.valor;
        }
        return min;
    }
}
