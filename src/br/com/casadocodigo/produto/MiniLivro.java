package br.com.casadocodigo.produto;
import br.com.casadocodigo.livraria.Autor;

public class MiniLivro extends Livro {
	public boolean aplicaDesconto(double desc){
		return false;
	}
	public MiniLivro(Autor autor){
		super(autor);
	}
}
