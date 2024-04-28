/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

/**
 *
 * @author 11151024600
 */
public abstract class Pessoa {
     private String nome, cpf, telefone, email;
     
      public  Pessoa(String nome, String cpf, String telefone, String email){
        this.nome=nome;
        this.cpf=cpf;
        this.telefone=telefone;
        this.email=email;
    }
      
      public void exibirInformacoes(){
          System.out.println("Nome: "+nome);
          System.out.println("CPF: "+cpf);
          System.out.println("Telefone: "+telefone);
          System.out.println("Email: "+email);
          System.out.println("--------------------------------------------------------------");
      }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
      
      
}
