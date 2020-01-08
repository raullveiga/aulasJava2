package com.ecommerce.produto;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Random;

public class Produto {
	
	private Integer codigo = 0;
	
	private String nome;
	
	private String descricao;
	
	private BigDecimal precoCompra;
	
	private BigDecimal precoVenda;
	
	private Integer qtdEstoque;
	
	private boolean ativo;
	
	private Calendar dataCadastro;
	
	
	public Produto() {}
	
	public Produto(String nome, String descricao, BigDecimal precoCompra, BigDecimal precoVenda, Integer qtdEstoque, boolean ativo, Calendar dataCadastro)
	{
		this.nome = nome;
		this.descricao = descricao;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
		this.qtdEstoque = qtdEstoque;
		this.ativo = ativo;
		this.dataCadastro = dataCadastro;
	}
	
	
	
	public int getCodigo() {
		if (this.codigo == 0)
			this.codigo = new Random().nextInt(100);
		return this.codigo;
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco_compra() {
		return precoCompra;
	}

	public void setPreco_compra(BigDecimal preco_compra) {
		this.precoCompra = preco_compra;
	}

	public BigDecimal getPreco_venda() {
		return precoVenda;
	}

	public void setPreco_venda(BigDecimal preco_venda) {
		this.precoVenda = preco_venda;
	}

	public Integer getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(Integer qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	
	public void Inserir(String nome) {
		setNome(nome);

		System.out.println(this.nome + " cadastrado com sucesso");
	}

	public void Alterar(Produto produto) {
		setNome(produto.nome);
		setDescricao(produto.descricao);
	}
	
	}
