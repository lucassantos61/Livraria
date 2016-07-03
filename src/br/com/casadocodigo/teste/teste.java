package br.com.casadocodigo.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.Editora;
import br.com.casadocodigo.produto.Livro;
import br.com.casadocodigo.produto.LivroImpresso;
import br.com.casadocodigo.produto.Revista;
import br.com.casadocodigo.produto.carrinho;

public class teste {
	public static void main(String[] Args) {
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rodrigo.turini@caelum.com.br");
		autor.setCpf("111.111.111-11");

		Livro fisico = new LivroImpresso(autor);
		fisico.SetNome("Desbravando Orientação a objetos");
		fisico.setValor(59.90);
		fisico.setDesc("Livro introdutorio sobre Java");

		Editora editora = new Editora();
		editora.setNomeFantasia("Abril");
		editora.setCNPJ("111.111.111-11");
		editora.setRazaoSocial("Abril edições de revistas");
		
		Revista revista = new Revista(editora);
		revista.setNome("PlayBoy");
		revista.setValor(20.90);
		revista.setDescricao("Revista de conteudo adulto");
		System.out.println("Produto do carrinho \n");
		carrinho compras = new carrinho();
		Produto.aplicaDesconto(0.15);
		compras.adiciona(fisico);
		compras.adiciona(revista);
		compras.mostraCarrinho();
		System.out.println("Total em $ :"+compras.getTotal());
	}
}
