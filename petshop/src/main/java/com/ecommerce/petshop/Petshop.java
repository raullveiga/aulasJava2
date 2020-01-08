package com.ecommerce.petshop;

import java.util.Random;

public class Petshop {

	private int petshopId = 0;

	private String nome;

	private Integer cnpj;

	private Integer tel;

	private String endereco;

	private Integer qtdAnimal;

	public Petshop() {

	}

	public Petshop(String nome, Integer cnpj, Integer tel, String endereco, Integer qtdAnimal) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.tel = tel;
		this.qtdAnimal = qtdAnimal;
	}

	public int getPetshopId() {
		if (this.petshopId == 0)
			this.petshopId = new Random().nextInt(100);
		return this.petshopId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}

	public Integer getTel() {
		return tel;
	}

	public void setTel(Integer tel) {
		this.tel = tel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getQtdAnimal() {
		return qtdAnimal;
	}

	public void setQtdAnimal(Integer qtdAnimal) {
		this.qtdAnimal = qtdAnimal;
	}

	public void Cadastrar(String nome) {
		setNome(nome);
		System.out.println(this.nome + " cadastrado com sucesso");
	}

	public void Atualizar(Petshop petshop) {
		setNome(petshop.nome);
		setCnpj(petshop.cnpj);
		setTel(petshop.tel);
		setEndereco(petshop.endereco);
	}

}
