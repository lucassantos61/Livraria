package br.com.casadocodigo.produto;

public class carrinho {
	private double total;
	private Produto[] produtos = new Produto[10];
	private int i  = 0;

	public void adiciona(Produto produto) {
		try {

			System.out.println("Adicionado: " + produto);
			this.produtos[i] = produto;
			i++;
			this.total += produto.getValor();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Carrinho cheio");
		} catch (NullPointerException e) {
			System.out.println("Array não foi instaciado");
		}
	}
	public void mostraCarrinho(){
		Produto produtos[] = getProdutos();
		for (Produto produto : produtos){
			try{
				if (produto != null){
					System.out.println(produto.getValor());
				}
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Carrinho cheio");
			} catch (NullPointerException e) {
				System.out.println("Array não foi instaciado");
			}
		}
	}
	public double getTotal() {
		return total;
	}
	
	public Produto[] getProdutos() {
		return produtos;
	}
	
}