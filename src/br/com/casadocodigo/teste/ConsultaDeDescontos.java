package br.com.casadocodigo.teste;
import br.com.casadocodigo.produto.GerenciadorDeCupom;
import br.com.casadocodigo.produto.LivroImpresso;
import br.com.casadocodigo.produto.Livro;
import br.com.casadocodigo.livraria.Autor;
public class ConsultaDeDescontos {
	public static void main(String [] args){
		Autor autor = new Autor();
		autor.setNome("Lucas Ferreira dos santos");
		Livro fisico = new LivroImpresso(autor);
		fisico.SetNome("Desbranvando Orientação a objetos");
		fisico.setValor(59.90);
		System.out.println("Valor sem desconto : "+fisico.getValor());
		GerenciadorDeCupom gerenciador = new GerenciadorDeCupom();
		

		Double desconto = gerenciador.ValidaCupom("CUP91");
		if (desconto != null){
			System.out.println("cupom valido !!!");
			System.out.println("Valor :"+desconto);
			
		}else{
			System.out.println("Cupom invalido !!!");
		}
		/*if(gerenciador.ValidaCupom("CUP221")){
			System.out.println("cupom valido !!!");
			fisico.aplicaDesconto10();
		}else{
			System.out.println("Cupom invalido !!!");
		}*/
		System.out.println("Valor com desconto : "+fisico.getValor());
	}
}
