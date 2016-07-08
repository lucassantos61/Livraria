package br.com.casadocodigo.produto;
import br.com.casadocodigo.livraria.Editora;
public class RevistaQuadrinhos extends Revista{
	private String formato;
	private String ano;
	private String Edicao;
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
	public String getEdicao() {
		return Edicao;
	}
	public void setEdicao(String edicao) {
		Edicao = edicao;
	}
	public RevistaQuadrinhos(Editora editora){
		super(editora);
	}
}
