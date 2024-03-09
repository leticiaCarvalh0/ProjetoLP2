/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

/**
 *
 * @author letic
 */
public class Cliente {
    private String nome, cpf, telefone, email;
    
      public  Cliente(String nome, String cpf, String telefone, String email){
        this.nome=nome;
        this.cpf=cpf;
        this.telefone=telefone;
        this.email=email;
    }
      
     /*public String toString(){
        return nome; 
     }*/

    public String getNome() {
        return nome;
    }


    public String getCpf() {
        return cpf;
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
