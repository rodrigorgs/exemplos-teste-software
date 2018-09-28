package incorreto;

// Testes automatizados de software - um guia prático
// Maurício Aniche
// Editora Casa do Código

import java.util.ArrayList;
import java.util.List;

class Usuario {
	String nome;

	public Usuario(String nome) {
		super();
		this.nome = nome;
	}
}

class Lance {
	Usuario usuario;
	double valor;
	
	public double getValor() {
		return valor;
	}

	public Lance(Usuario usuario, double valor) {
		super();
		this.usuario = usuario;
		this.valor = valor;
	}
}

class Leilao {
    private String descricao;
    private List<Lance> lances;
    
    public List<Lance> getLances() {
		return lances;
	}
    
	public String getDescricao() {
		return descricao;
	}

	public Leilao(String descricao) {
        this.descricao = descricao;
        this.lances = new ArrayList<Lance>();
	}
}

class Avaliador {
	private double maiorDeTodos = Double.NEGATIVE_INFINITY;
	private double menorDeTodos = Double.POSITIVE_INFINITY;
	public void avalia(Leilao leilao) {
		for(Lance lance : leilao.getLances()) {
			if(lance.getValor() > maiorDeTodos) {
				maiorDeTodos = lance.getValor();
			}
			else if(lance.getValor() < menorDeTodos) {
				menorDeTodos = lance.getValor();
			}
		}
	}
	public double getMaiorLance() { return maiorDeTodos; }
	public double getMenorLance() { return menorDeTodos; }
}

