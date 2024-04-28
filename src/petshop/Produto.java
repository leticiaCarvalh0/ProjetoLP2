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
public class Produto implements Descontavel{
    private int idProduto;
    private String nome;
    private double preco;
    private int quantidade;
    private int estoque=0;
    
        public Produto(int idProduto, String nome, double valor, int quantidade){
        this.idProduto=idProduto;
        this.nome=nome;
        this.preco=valor;
        this.quantidade=quantidade;
    }
        
        public void verificaProduto(int idProduto){
        if(quantidade>0){
            System.out.println("Produto disponivel em estoque!");
        }else{
            System.out.println("Produto em falta...");
        }
        //return quantidade<=estoque;
    }
        
        public void adicionarEstoque(int quantidade){
          estoque+=quantidade;
        }
        
        public void atualizaPreco(double novoPreco){
            preco=novoPreco;
        }
        

    public int getIdProduto() {
        return idProduto;
    }


    public String getDescricao() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public double aplicarDesconto(double precoOriginal) {
       precoOriginal=this.preco;
       return precoOriginal*0.05;//desconto de 5%
    }
    
    public void realizarVenda(Produto produto, int quantidade) {
        try {
            // Verifica se há estoque disponível
            if (produto.getEstoque() >= quantidade) {
                // Realiza a venda
                produto.setEstoque(produto.getEstoque() - quantidade);
                System.out.println("Venda realizada com sucesso!");
            } else {
                // Lança uma exceção se não houver estoque suficiente
                throw new EstoqueInsuficienteException("Estoque insuficiente para realizar a venda.");
            }
        } catch (EstoqueInsuficienteException e) {
            // Trata a exceção exibindo uma mensagem de erro
            System.out.println("Erro ao realizar venda: " + e.getMessage());
        }
    }
    
  
    
    
}
