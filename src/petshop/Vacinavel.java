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
public interface Vacinavel {
    
    public void vacinar(String vacina);
        
    public boolean estaVacinado(String vacina);
}
