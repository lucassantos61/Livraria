package br.com.casadocodigo.produto;
import br.com.casadocodigo.livraria.Editora;
public class RevistaQuadrinhos extends Revista{
	private String formato;
	private String ano;
	private String Edi��o;
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getEdi��o() {
		return Edi��o;
	}
	public void setEdi��o(String edi��o) {
		Edi��o = edi��o;
	}
	public RevistaQuadrinhos(Editora editora){
		setEditora(editora);
	}
}
