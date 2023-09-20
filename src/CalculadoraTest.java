import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void sumarDosEnteros() {
		Calculadora calc = new Calculadora();
		assertEquals(15, calc.sumar(8,7));
	}
	
	@Test
	void restarDosEnteros() {
		Calculadora calc = new Calculadora();
		assertEquals(48, calc.restar(88,40));
	}
	
	@Test
	void multiplicarDosEnteros() {
		Calculadora calc = new Calculadora();
		assertEquals(56, calc.multiplicar(8,7));

	}

	@Test
	void elevarAlCuadrado() {
		Calculadora calc = new Calculadora();
		assertEquals(27, calc.cuadrado(3));

	}

	@Test
	void ejecutarHola() {
		Calculadora calc = new Calculadora();
		assertEquals("Hola", calc.hola());

	}
}
