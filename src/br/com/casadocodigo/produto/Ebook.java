package br.com.casadocodigo.produto;
import br.com.casadocodigo.livraria.Autor;

public class Ebook extends Livro implements Promocional{
    private String watermark;
    private String impresso;
    public void setWaterMark(String watermark){
        this.watermark = watermark;
    }
    public String getWaterMark(){
        return watermark;
    }
    public void setImpresso(String impresso){
        this.impresso = impresso; 
    }
    public String getImpresso (){
        return impresso;
    }
    public Ebook(Autor autor){
        super(autor);
    }
    @Override
    public boolean aplicaDesconto(double desc){
        if (desc > 0.15){
            return false;
        }else{
    		double preco = getValor();
    		setValor(preco-(preco*desc));
        	return true;
        }
    }
 
}