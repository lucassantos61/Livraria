package br.com.casadocodigo.produto;
import br.com.casadocodigo.exception.*;
import br.com.casadocodigo.livraria.Autor;

public abstract class Livro implements Produto {
	private String nome;
	private String Descricao;
	private double Valor;
	private String isbn;
	private Autor autor;

	public void SetNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setDesc(String Descricao) {
		this.Descricao = Descricao;
	}

	public String getDesc() {
		return Descricao;
	}

	public void setValor(double Valor) {
		this.Valor = Valor;
	}

	public double getValor() {
		return Valor;
	}

	public void setISBN(String isbn) {
		this.isbn = isbn;
	}

	public String getISBN() {
		return isbn;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Autor getAutor() {
		return autor;
	}

	void mostraDetalhes() {
		System.out.println("Nome do Livro :" + getNome());
		System.out.println("Descrição do Livro :" + getDesc());
		System.out.println("Valor :" + getValor());
		System.out.println("ISBN :" + getISBN());
	}

	public Livro(Autor autor) {
		if (autor == null) {
			throw new AutorNuloException("O autor do Livro não pode ser NULL !!!!");
		}
		this.autor = autor;
		this.isbn = "000-000-000-00";
	}
	
	@Override
	public String toString(){
		return "Nome :"+nome+"\n"+
				"Descrição :"+Descricao+"\n"+
				"Valor :"+Valor+"\n"+
				"ISBN :"+isbn+"\n"+
				"Autor : "+autor.getNome();
	}
	

}