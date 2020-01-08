package com.ecommerce.socio;

public class Socio {
	
	private String name;
	
	private Integer cpf;
	
	private Integer rg;
	
	private String dataNasc;
	
	private String endereco;
	
	public Socio() {
		
	}
	
	public Socio(String name, Integer cpf, Integer rg, String dataNasc, String endereco) {
		this.name = name;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNasc = dataNasc;
		this.endereco = endereco;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Integer getRg() {
		return rg;
	}

	public void setRg(Integer rg) {
		this.rg = rg;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
	public boolean Cadastrar() {
		
		return true;
	}
	
	public boolean ConfirmarCadastro(Socio socio) {
		
		return  true;
	}
	
	public boolean ValidarSocio() {
		return true;
	}
	
	public void Alterar(Socio socio) {
		
	}
	
	
	
	
	
	
}
