package testando;
import static org.junit.Assert.*;
import org.junit.Test;
import correto.Mes;

public class MesTest {
	@Test
	public void mesValido() {
		assertTrue(Mes.ehValido(5));
	}
	@Test
	public void mesInvalido() {
		assertFalse(Mes.ehValido(20));
	}
}
