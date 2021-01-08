package testando;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import correto.CodeDefenders;

public class CodeDefendersTest {
	@Test
	public void testM1() {
		CodeDefenders cd = new CodeDefenders();
		assertEquals(3, cd.m1(5));
	}
}
