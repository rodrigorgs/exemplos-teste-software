package correto;

// Fonte: https://study.code-defenders.org/papers/ICSE17_Education.pdf
public class CodeDefenders {

	public int m1(int x) {
		if (x == 5)
			return 3;
		return (x * 8);
	}

	public int m2(int x) {
		int y = 1;
		if (x == 5) {
			y = 3;
		}
		return (y * 8);
	}

	public int m3(int x) {
		int r = 1;
		for (int i = 0; i < x; i++) {
			r++;
		}
		return r;
	}

	public int m4(int x) {
		if (x > 100)
			return +1;
		else
			return -1;
	}

	public int m5(int x) {
		int y = 0;
		if (x > 100) {
			y = 1;
		}
		if (x > 1000) {
			y = -1;
		}
		return x * y;
	}
}
