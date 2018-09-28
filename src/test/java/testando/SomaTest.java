package testando;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;


import correto.Calculadora;

public class SomaTest {
	@Test
	public void testaSoma() {
		int resultado = Calculadora.soma(2,  3);
		assertThat(resultado, is(5));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testaDivisaoPorZero() {
		Calculadora.divide(2,  0);
	}
}
