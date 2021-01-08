package correto;

public class BuscaBinaria {
	// retorna a posição do elemento elem no vetor v
	// se não encontrar, retorna -1
	// se o elemento aparecer mais de uma vez, retorna alguma das posições
	public static int busca(int[] v, int elem) {
		int esq = 0, dir = v.length - 1, meio = 0;
		
		if (v.length == 0) {
			return -1;
		}
		
		while (esq <= dir) {
			meio = esq + (dir - esq) / 2;
			if (elem < v[meio]) {
				dir = meio - 1;
			} else if (elem > v[meio]) {
				esq = meio + 1;
			} else {
				break;
			}
		}
		
		if (v[meio] == elem) {
			return meio;
		} else {
			return -1;
		}
	}
}
