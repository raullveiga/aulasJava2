package com.ecommerce.petshop;

public class App {
	public static void main(String[] args) {
		
		Petshop petshop = new Petshop();
		Produto produto = new Produto();
		Cliente cliente = new Cliente();
		
		produto.Cadastrar("polypet");
		System.out.println(petshop.getPetshopId());
		
		
	}
}
