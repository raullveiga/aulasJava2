package com.ecommerce.produto;


public class App 
{
    public static void main( String[] args )
    {
    	Produto produto = new Produto();
    	
    	produto.Inserir("Batata");
    	
    	
    	produto.Alterar(new Produto());
    	
        System.out.println("Produto: " + produto.getNome() + " - id: " + produto.getCodigo());
    }
}
