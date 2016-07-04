package br.com.casadocodigo.produto;

import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class carrinho {
	private double total;
	private List<Produto> produtos;
	private int i  = 0;
	public carrinho(){
		this.produtos = new ArrayList<>();
	}
	public void adiciona(Produto produto) {
		this.produtos.add(produto);
		this.total +=produto.getValor();
	}
	public void remove(Produto produto) {
		this.produtos.remove(produto);
		this.total -=produto.getValor();
	}
	public void mostraCarrinho(){
		List<Produto> produtos = new ArrayList<>();
		produtos = getProdutos();
		for (Produto produto : produtos){
			try{
				if (produto != null){
					System.out.println(produto.toString());
				}
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Ops !! Carrinho fora de controle");
			} catch (NullPointerException e) {
				System.out.println("Array não foi instaciado");
			}
		}
	}
	public double getTotal() {
		return total;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
}