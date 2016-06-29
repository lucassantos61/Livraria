																																																																														package br.com.casadocodigo.produto;
import br.com.casadocodigo.livraria.Editora;

public class Revista implements Produto,Promocional{
	private String nome;
	private String descricao;
	private double valor;
	private Editora editora;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public boolean aplicaDesconto(double desc) {
		if (desc > 0.15) {
			return false;
		} else {
			setValor(getValor() - (getValor() * desc));
			return true;
		}
	}
}
