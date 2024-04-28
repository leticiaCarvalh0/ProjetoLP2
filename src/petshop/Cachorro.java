
package petshop;

import java.util.HashSet;
import java.util.Set;


public class Cachorro extends Animal implements Vacinavel{
    private Set<String> vacinasRecebidas;
    public Cachorro(String nome, String raca, int idade, Cliente cliente) {
        super(nome, raca, idade, cliente);
    }
    
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("E um(a) cachorro(a)!");
    }

    @Override
    public void vacinar(String vacina) {
        if(vacinasRecebidas==null){
            vacinasRecebidas = new HashSet<>();
        }
        vacinasRecebidas.add(vacina);
        System.out.println("Cachorro(a) "+ this.getNome() +"vacinado contra "+vacina);
    }

    @Override
    public boolean estaVacinado(String vacina) {
        return vacinasRecebidas != null && vacinasRecebidas.contains(vacina);
    }
    
}
