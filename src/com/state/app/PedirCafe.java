package com.state.app;

import com.state.maquina.MaquinaCafe;

public class PedirCafe {

	public static void main(String[] args) {
		
		MaquinaCafe maquinaCafe = new MaquinaCafe(5);
		System.out.println("Maquina de Cafe");
		
		maquinaCafe.inserirMoeda();
		maquinaCafe.devolverMoeda();
		maquinaCafe.selecionarProduto();
		System.out.println("Maquina de Cafe");
		
		maquinaCafe.inserirMoeda();
		maquinaCafe.selecionarProduto();
		maquinaCafe.inserirMoeda();
		maquinaCafe.selecionarProduto();
		maquinaCafe.devolverMoeda();
		System.out.println("Maquina de Cafe");
		
		maquinaCafe.inserirMoeda();
		maquinaCafe.inserirMoeda();
		maquinaCafe.selecionarProduto();
		maquinaCafe.inserirMoeda();
		maquinaCafe.selecionarProduto();
		maquinaCafe.inserirMoeda();
		maquinaCafe.selecionarProduto();
		System.out.println("Maquina de Cafe");

	}
}