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
public class Servico implements Descontavel{
    private int idServico;
    private String descricao;
    private double valor;
    private Animal animal;
    private List<Servico> listaservicos = new ArrayList<Servico>();
    private boolean agendado;
    
    public Servico(int idServico, String descricao, double valor, Animal animal, boolean agendado,List listaservicos){
        this.idServico=idServico;
        this.descricao=descricao;
        this.valor=valor;
        this.animal = animal;
        this.agendado=false;
        this.listaservicos = new ArrayList<Servico>();
    }
    
    public void agendaServico(){
       if(!agendado){ 
           System.out.println("O servico de "+descricao+" foi agendado");
           agendado=true;
       }else{
           System.out.println("O servico de "+descricao+" ja esta agendado");
       }
    }
 
    public void cancelaServico(){
        if(agendado){
            System.out.println("O servico de "+descricao+" foi cancelado");
    }else{
            System.out.println("Nao ha nenhum servico de "+descricao+" agendado para cancelar");
        }       
    } 
    
    public boolean isAgendado(){
        return agendado;
    }
    
    public static void listaServicos(List<Servico> servicos){
        for(Servico servico : servicos){
            if(servico.isAgendado()){
                System.out.println("Tipo: "+servico.getDescricao()+"Valor: "+servico.getValor());
            }
        }
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

    @Override
    public double aplicarDesconto(double precoOriginal) {
        precoOriginal=this.valor;
       return precoOriginal*0.9;//desconto de 10%
    }
    
}
