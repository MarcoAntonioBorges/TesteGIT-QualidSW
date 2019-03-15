package br.com.fiap.produto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testeproduto {

	@Test
	public void testeGet() {
		Produto prod = new Produto(20, 20);
		
		int retorno = prod.getPeso();
		
		int retornoEsperado = 20;
		
		assertEquals(retorno, retornoEsperado);
		
	}
}
