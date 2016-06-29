package br.com.casadocodigo.produto;
public class carrinho{
	private double total;
	private Produto[] produtos = new Produto[10];
	public void adiciona(Produto produto) {
		int i = 0;
		try{
			
			System.out.println("Adicionado: " +produto);
			this.produtos[i] = produto;
			i++;
			this.total +=produto.getValor();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Excption no indice :"+i);
		}catch(NullPointerException e){
			System.out.println("Array não foi instaciado");
		}
		}

	public double getTotal() {
		return total;
	}
}