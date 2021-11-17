package com.animais.aula11_T02;

public class Cachorro extends Animal {
	public Cachorro(int idade, String nome){
			super (idade, nome);
		}
	
	public void emiteSom() {
		System.out.println("Au au au au ");
	}
	
	public void movimento(boolean status) {
		if(status) {
			System.out.println("Correndo...");
		} else {
			System.out.println("Parado...");
		}
	}
}
