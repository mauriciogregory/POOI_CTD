package com.animais.aula11_T02;

public class Cavalo extends Animal{
	public Cavalo(int idade, String nome) {
		super(idade, nome);
	}
	
	public void emiteSom() {
		System.out.println("Som do cavalo bllelblble");
	}
	
	public void movimento(boolean status) {
		if(status) {
			System.out.println("Em movimento, galopando e correndo...");
		} else {
			System.out.println("Parado...");
		}
	}
}
