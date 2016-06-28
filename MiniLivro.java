
public class MiniLivro extends Livro {
	public boolean aplicaDesconto(double desc){
		return false;
	}
	public MiniLivro(Autor autor){
		super(autor);
	}
}
