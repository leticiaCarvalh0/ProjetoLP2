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
public abstract class Animal {
    private String nome, raça;
    private int idade;
    private Cliente cliente;

     public Animal(String nome, String raca,int idade, Cliente cliente ){
        this.nome = nome;
        this.raça=raca;
        this.idade=idade;
        this.cliente=cliente;
    }
     
     public void exibirDados(){
         System.out.println("Nome do pet: "+nome);
         System.out.println("Idade: "+idade);
         System.out.println("Dono(a): "+cliente);
     }

    public String getNome() {
        return nome;
    }

    
    public String getRaça() {
        return raça;
    }

    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCliente() {
        return cliente.getNome();
    }  
    
}
