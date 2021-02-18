package entornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComplexTest {

	@Test
	void testSumar() {
		Complex prueba = new Complex(3, 30);
		Complex prueba1 = new Complex(4, 40);
		
		Complex resultado = prueba.sumar(prueba1);
		Complex esperado = new Complex(7, 70);
		assertEquals(resultado, esperado);
	}

	@Test
	void testRestar() {
		Complex prueba = new Complex(4,40);
		Complex prueba1 = new Complex(2,20);
		
		Complex resultado = prueba.restar(prueba1);
		Complex esperado = new Complex(2,20);
		assertEquals(resultado, esperado);
	}

	@Test
	void testMultiplicarComplex() {
		Complex prueba = new Complex(4,40);
		Complex prueba1 = new Complex(2,2);
		
		Complex resultado = prueba.multiplicar(prueba1);
		Complex esperado = new Complex(-72,88);
		assertEquals(resultado, esperado);
	}

	@Test
	void testMultiplicarDouble() {
		Complex prueba = new Complex(40, 30);
		
		Complex resultado = prueba.multiplicar(20);
		Complex esperado = new Complex(800, 600);
		assertEquals(resultado, esperado);
	}

	@Test
	void testDividir() {
		Complex prueba = new Complex(20,70);
		Complex prueba1 = new Complex(2,2);
		
		Complex resultado = prueba.dividir(prueba1);
		Complex esperado = new Complex(22.5,12.5);
		assertEquals(resultado, esperado);
	}

	@Test
	void testEqualsObject() {
		
	}

}
