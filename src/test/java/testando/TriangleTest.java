package testando;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import correto.Triangle;

public class TriangleTest {

	@Test
	public void testEquilatero() {
		assertEquals(Triangle.EQUILATERAL,
				Triangle.Type_Area(3, 3, 3));
		assertEquals(Triangle.ISOSCELES,
				Triangle.Type_Area(3, 3, 1));
		assertEquals(Triangle.ISOSCELES,
				Triangle.Type_Area(3, 5, 5));
		assertEquals(Triangle.ISOSCELES,
				Triangle.Type_Area(3, 5, 3));
		assertEquals(Triangle.SCALENE,
				Triangle.Type_Area(3, 4, 5));
		assertEquals(Triangle.INVALID,
				Triangle.Type_Area(0, 4, 5));
		assertEquals(Triangle.INVALID,
				Triangle.Type_Area(3, 0, 5));
		assertEquals(Triangle.INVALID,
				Triangle.Type_Area(3, 4, 0));
		assertEquals(Triangle.INVALID,
				Triangle.Type_Area(3, 4, 10));
		assertEquals(Triangle.INVALID,
				Triangle.Type_Area(3, 10, 5));
		assertEquals(Triangle.INVALID,
				Triangle.Type_Area(10, 4, 5));
	}
}
