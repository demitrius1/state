package com.state.maquina;

public class MaquinaCafe {

	final static int MAQUINA_VAZIA = 0;
	final static int SEM_MOEDA = 1;
	final static int TEM_MOEDA = 3;
	final static int PRODUTO_VENDIDO = 4;
	
	int state = MAQUINA_VAZIA;
	int count = 0;

	public MaquinaCafe(int count) {
		this.count = count;
		if (count > 0)
			state = SEM_MOEDA;
	}

	public void inserirMoeda() {
		if (state == TEM_MOEDA) {
			System.out.println("Existe uma moeda inserida");
		} else if (state == SEM_MOEDA) {
			state = TEM_MOEDA;
			System.out.println("Moeda inserida");
		} else if (state == MAQUINA_VAZIA) {
			System.out.println("Maquina vazia");
		} else if (state == PRODUTO_VENDIDO) {
			System.out.println("Pegue o seu cafe");
		}
	}

	public void devolverMoeda() {
		if (state == TEM_MOEDA) {
			System.out.println("Moeda devolvida");
			state = SEM_MOEDA;
		} else if (state == SEM_MOEDA) {
			System.out.println("Moeda nao foi inserida");
		} else if (state == PRODUTO_VENDIDO) {
			System.out.println("Cafe já foi selecionado");
		} else if (state == MAQUINA_VAZIA) {
			System.out.println("Maquina vazia, moeda nao foi inserida");
		}
	}

	public void selecionarProduto() {
		if (state == PRODUTO_VENDIDO) {
			System.out.println("Cafe foi selecionado, para outro cafe precisa inserir outra moeda");
		} else if (state == SEM_MOEDA) {
			System.out.println("Moeda nao inserida");
		} else if (state == MAQUINA_VAZIA) {
			System.out.println("Voce selecionou mas a maquina esta vazia");
		} else if(state == TEM_MOEDA) {
			System.out.println("Aguarde...");
			state = PRODUTO_VENDIDO;
		}
	}

}