public abstract class Livro implements Produto{
    private String nome;
    private String Descricao;
    private double Valor;
    private String isbn;
    private Autor autor;
     
    public void SetNome (String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setDesc(String Descricao){
        this.Descricao = Descricao;
    }
    public String getDesc(){
        return Descricao;
    }
    public void setValor(double Valor){
        this.Valor  = Valor;
    }
    public double getValor(){
        return Valor;
    }
    public void setISBN (String isbn){
        this.isbn = isbn;
    }
    public String getISBN (){
        return isbn;
    }
    public void setAutor (Autor autor){
        this.autor = autor;
    }
    public Autor getAutor(){
        return autor;
    }
     
    void mostraDetalhes(){
        System.out.println("Nome do Livro :"+getNome());
        System.out.println("Descrição do Livro :"+getDesc());
        System.out.println("Valor :"+getValor());
        System.out.println("ISBN :"+getValor());
    }
    public Livro(Autor autor){
        this.autor = autor;
        this.isbn = "000-000-000-00";
    }

 
}