package br.com.casadocodigo.produto;

public interface Promocional {
	 public boolean aplicaDesconto(double desc);
	 default boolean aplicaDesconto10(){
		 return aplicaDesconto(0.1);
	 }
}
