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
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
      Cliente cli1 = new Cliente("Ana Silva", "123.456.789-10", "000000000", "anasilva@mail.com", "Rua 1, Numero 2 Bairro 3");
      Cliente cli2 = new Cliente("Paulo", "236.159.427-15", "98829-7299", "paulo@mail.com", "Rua 5, Numero 3, Bairro 7");
      
      //Animal a1 = new Animal("Bob", "pooodle", 3, cli2) {};
      //Animal a2 = new Animal("apolo", "Golden Retriever", 5, cli1) {};
      
      
      
      Produto p1 = new Produto(1, "Racao para cahorro", 50.00, 100);
      Produto p2 = new Produto(1, "Racao para gato", 50.00, 0);
      List<Produto> listaProduto = new ArrayList<>();
      listaProduto.add(p1);
      listaProduto.add(p2);
      
      p1.verificaProduto(1);
      p2.verificaProduto(2);
      
      
      //Servico s1 = new Servico(1, "Banho", 40.00, a2, listaProduto);
      //Servico s2 = new Servico(2, "Tosa", 20.00, a1, listaProduto);
      
        //System.out.println("Nome do cliente: "+a1.getCliente());
      
        
        
        
    }
    
}
