package br.com.fiap.produto;

public class Produto {

	private int peso;
	private int altura;
	
	//Vazio
	public Produto() {
		super();
	}

	//Cheio
	public Produto(int peso, int altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
	
}
