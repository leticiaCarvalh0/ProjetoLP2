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
public class Cliente extends Pessoa{
    private String endereco;
    public Cliente(String nome, String cpf, String telefone, String email, String endereco) {
        super(nome, cpf, telefone, email);
        this.endereco=endereco;
    }
    
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Endereco: "+endereco);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    
    
    
    
    
}
