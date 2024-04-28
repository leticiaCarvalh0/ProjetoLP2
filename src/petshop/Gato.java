/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author letic
 */
public class Gato extends Animal implements Vacinavel{
    private Set<String> vacinasRecebidas;
    public Gato(String nome, String raca, int idade, Cliente cliente) {
        super(nome, raca, idade, cliente);
    }
    
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("E um(a) gato(a)!");
    }

   @Override
    public void vacinar(String vacina) {
        if(vacinasRecebidas==null){
            vacinasRecebidas = new HashSet<>();
        }
        vacinasRecebidas.add(vacina);
        System.out.println("Gato(a) "+ this.getNome() +"vacinado contra "+vacina);
    }

    @Override
    public boolean estaVacinado(String vacina) {
        return vacinasRecebidas != null && vacinasRecebidas.contains(vacina);
    }
}
