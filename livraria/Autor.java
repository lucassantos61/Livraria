package br.com.casadocodigo.livraria;
public class Autor {
    private String nome;
    private String cpf;
    private String email;
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public String getNome(){
        return this.nome;
    }
     
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void mostraAutor() {
        System.out.println("Nome Autor :" + getNome());
        System.out.println("Cpf Autor :" + getCpf());
        System.out.println("E-mail :" + getEmail());
        System.out.println("--");
 
    }
}