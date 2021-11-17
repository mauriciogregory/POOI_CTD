package com.animais.aula11_T02;

public class Preguica extends Animal {
	public Preguica(int idade, String nome) {
		super(idade, nome);
	}
	
	public void emiteSom() {
		System.out.println("Som da preguiça com sono!!!");
	}
	
	public void movimento(boolean status) {
		if(status) {
			System.out.println("Em movimento, devagar e em frente...");
		} else {
			System.out.println("Parado, dormindo....");
		}
	}
}
