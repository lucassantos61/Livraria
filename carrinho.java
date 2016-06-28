public class carrinho{
	private double total;

	public void adiciona(Produto produto) {
		System.out.println("Adicionado:" + produto);
		
		this.total += produto.getValor();
	
	}

	public double getTotal() {
		return total;
	}
}