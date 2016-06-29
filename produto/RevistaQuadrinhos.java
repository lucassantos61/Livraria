package br.com.casadocodigo.produto;
import br.com.casadocodigo.livraria.Editora;
public class RevistaQuadrinhos extends Revista{
	private String formato;
	private String ano;
	private String Edição;
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
	public String getEdição() {
		return Edição;
	}
	public void setEdição(String edição) {
		Edição = edição;
	}
	public RevistaQuadrinhos(Editora editora){
		setEditora(editora);
	}
}
