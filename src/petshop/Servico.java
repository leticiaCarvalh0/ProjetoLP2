/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author letic
 */
public class Servico {
    private int idServico;
    private String descricao;
    private double valor;
    private Animal animal;
    private List<Produto> listaProduto = new ArrayList<Produto>();
       
    public Servico(int idServico, String descricao, double valor, Animal animal, List listaProduto){
        this.idServico=idServico;
        this.descricao=descricao;
        this.valor=valor;
        this.animal = animal;
        this.listaProduto = new ArrayList<Produto>();
    }

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

   
    
    public void cancelaServico(){
        
    }
    
}
