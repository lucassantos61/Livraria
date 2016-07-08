package br.com.casadocodigo.produto;
import java.util.HashMap;
import java.util.Map;


public class GerenciadorDeCupom {
	private Map<String,Double> cupom;
	
	public GerenciadorDeCupom(){
		this.cupom = new HashMap();
		cupom.put("CUP91", 10.0);
		cupom.put("CUP158", 15.0);
		cupom.put("CUP14", 5.99);
		cupom.put("CUP52", 10.0);
		
		/*this.cupom  = new HashSet<String>(); 
				cupom.addAll(Arrays.asList("CUP74","CUP158","CUP14","CUP52","CUP21","CUP221"
				,"CUP91","CUP327","CUP410","CUP275","CUP484","CUP207","CUP96","CUP119"
				,"CUP174","CUP291","CUP1","CUP115","CUP222","CUP272"));*/
		
	}
	
	/*public boolean ValidaCupom(String cupom){
		return this.cupom.containsKey(cupom);
	}*/
	public Double ValidaCupom(String cupom){
		return this.cupom.get(cupom);
	}
	
}
