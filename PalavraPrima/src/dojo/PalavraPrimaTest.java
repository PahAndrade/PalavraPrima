package dojo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalavraPrimaTest {

	@Test
	public void testConverteLetraAMinusculo(){
		int valor = PalavraPrima.converteEmNumero("a");
		assertEquals(1, valor);
	}
	@Test
	public void testConverteLetraBMinusculo(){
		int valor = PalavraPrima.converteEmNumero("b");
		assertEquals(2, valor);
	}
	@Test
	public void testConverteLetraAMaiusculo(){
		int valor = PalavraPrima.converteEmNumero("A");
		assertEquals(27, valor);
	}
	@Test
	public void testConverteLetrZMinusculo(){
		int valor = PalavraPrima.converteEmNumero("z");
		assertEquals(26, valor);
	}
	@Test
	public void testConverteLetrZMaiusculo(){
		int valor = PalavraPrima.converteEmNumero("Z");
		assertEquals(52, valor);
	}
	@Test
	public void test2EhNumeroPrimo(){
		boolean resultadoTeste = PalavraPrima.ehPrimo (2);
		assertEquals(false, resultadoTeste);
	}
	@Test
	public void test26EhNumeroPrimo(){
		boolean resultadoTeste = PalavraPrima.ehPrimo (26);
		assertEquals(true, resultadoTeste);
	}

}