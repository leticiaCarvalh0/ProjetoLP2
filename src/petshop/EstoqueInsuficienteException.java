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
class EstoqueInsuficienteException extends Exception{
    // Construtor que recebe uma mensagem de erro como parâmetro
    public EstoqueInsuficienteException(String mensagem) {
        // Chama o construtor da superclasse (Exception) passando a mensagem de erro
        super(mensagem);
    }
}

