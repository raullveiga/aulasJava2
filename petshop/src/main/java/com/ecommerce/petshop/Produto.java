package com.ecommerce.petshop;

import java.util.Random;

public class Produto {

	private int produtoId;

	private String nome;

	private String tipo;

	private String marca;

	private Integer qtd;

	public Produto() {

	}

	public Produto(int produtoId, String nome, String tipo, String marca, Integer qtd) {
		this.produtoId = produtoId;
		this.nome = nome;
		this.tipo = tipo;
		this.marca = marca;
		this.qtd = qtd;
	}

	public int getProdutoId() {
		if (this.produtoId == 0)
			this.produtoId = new Random().nextInt(100);
		return this.produtoId;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

	public void Cadastrar(String nome) {
		setNome(nome);

		System.out.println(this.nome + " cadastrado com sucesso");
	}

	public void Atualizar(Produto produto) {
		setNome(produto.nome);
		setTipo(produto.tipo);
	}

}
