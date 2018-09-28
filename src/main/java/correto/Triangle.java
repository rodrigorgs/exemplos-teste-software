package correto;

public class Triangle {
	static final int INVALID = 0;
	static final int SCALENE = 1;
	static final int ISOSCELES = 2;
	static final int EQUILATERAL = 3;

	public int Type_Area(int a, int b, int c) {
		int type;

		if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (b + c <= a) || (a + c <= b)) {
			type = INVALID;
		} else {
			type = SCALENE;

			if (a == b || b == c)
				type = ISOSCELES;

			if (a == b && b == c) {
				type = EQUILATERAL;
			}
		}
		return type;
	}
}
