package entornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComplexTest2 {

	@Test
	void testRestar() {
		Complex prueba = new Complex(2,20);
		Complex prueba1 = new Complex(2,20);
		
		Complex resultado = prueba.restar(prueba1);
		Complex esperado = new Complex(0,0);
		assertEquals(resultado, esperado);
	}
	
	@Test
	void testRestar2() {
		Complex prueba = new Complex(2,20);
		Complex prueba1 = new Complex(5,50);
		
		Complex resultado = prueba.restar(prueba1);
		Complex esperado = new Complex(-3,-30);
		assertEquals(resultado, esperado);
	}

	@Test
	void testDividir() {
		Complex prueba = new Complex(2,70);
		Complex prueba1 = new Complex(2.5,75);
		
		Complex resultado = prueba.dividir(prueba1);
		Complex esperado = new Complex(0.9331853496115428,0.004439511653718091);
		assertEquals(resultado, esperado);
	}
	
	@Test
	void testDividir2() {
		Complex prueba = new Complex(50,75);
		Complex prueba1 = new Complex(100,7);
		
		Complex resultado = prueba.dividir(prueba1);
		Complex esperado = new Complex(0.5498059508408797,0.7115135834411385);
		assertEquals(resultado, esperado);
	}

}
