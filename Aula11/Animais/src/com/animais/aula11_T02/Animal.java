package com.animais.aula11_T02;

public abstract class Animal {
	private String nome;
	private int idade;
	
	public Animal(int idade, String nome) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public abstract void emiteSom();
	public abstract void movimento(boolean status);

}
