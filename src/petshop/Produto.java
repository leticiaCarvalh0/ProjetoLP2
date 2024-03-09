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
public class Produto {
    private int idProduto;
    private String nome;
    private double valor;
    private int quantEstoque;
    
        public Produto(int idProduto, String nome, double valor, int quantEstoque){
        this.idProduto=idProduto;
        this.nome=nome;
        this.valor=valor;
        this.quantEstoque=quantEstoque;
    }
        
        public void verificaProduto(int idProduto){
        if(quantEstoque>0){
            System.out.println("Produto disponivel em estoque!");
        }else{
            System.out.println("Produto em falta...");
        }
    }

    public int getIdProduto() {
        return idProduto;
    }


    public String getDescricao() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }
    
  
    
    
}
