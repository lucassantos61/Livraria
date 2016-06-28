
public class RegistroVendas {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Lucas Ferrira");

		LivroImpresso livroFisisco = new LivroImpresso(autor);
		livroFisisco.SetNome("Desbravando o C");
		livroFisisco.setValor(59.9);

		Ebook ebook = new Ebook(autor);
		ebook.SetNome("Desbravando o C");
		ebook.setValor(29.9);
		if(livroFisisco.aplicaDesconto10()){
			System.out.println("Valor agora �: "+livroFisisco.getValor());
		}
		carrinho carroCompras = new carrinho();
		carroCompras.adiciona(livroFisisco);
		carroCompras.adiciona(ebook);
		System.out.println("Livro fisico:"+livroFisisco.getValor());
		System.out.println("Ebook :"+ebook.getValor());
		System.out.println("Total das compras : " + carroCompras.getTotal());
	}

}
