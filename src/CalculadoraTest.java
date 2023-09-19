import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class CalculadoraTest {

	@Test
	void sumaDosEnteros() {
		Calculadora calc = new Calculadora();
		assertEquals(15, calc.sumar(8,7));
	}

}
