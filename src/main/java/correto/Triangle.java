package correto;

public class Triangle {
	public static final int INVALID = 0;
	public static final int SCALENE = 1;
	public static final int ISOSCELES = 2;
	public static final int EQUILATERAL = 3;

	public static int Type_Area(int a, int b, int c) {
		int type;

		if (a <= 0 ||
				b <= 0 ||
				c <= 0 ||
				(a + b <= c) ||
				(b + c <= a) ||
				(a + c <= b)) {
			type = INVALID;
		} else {
			type = SCALENE;

			if (a == b || b == c || a == c)
				type = ISOSCELES;

			if (a == b && b == c) {
				type = EQUILATERAL;
			}
		}
		return type;
	}
}
