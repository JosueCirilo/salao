package com.josue.salao.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="estabelecimento")
public class Estabelecimento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "A razão Social é Obrigatória")
	private String razaoSocial;
	
	@NotBlank(message = "O CNPJ é obrigatório")
	private String cnpj;
	
	@Email(message = "E-mail inválido")
	private String email;
	
	private String telefoneFax;
	
	private String telefoneCelular;
	
	private String telefoneComercial;
	
	@Embedded
	private Endereco endereco;
	
	@OneToOne(mappedBy = "estabelecimento")
	private Fornecedor fornecedor;
	
	@OneToMany(mappedBy = "estabelecimento")
	private ArrayList<Funcionario> funcionarios;
	
	@OneToMany(mappedBy = "estabelecimeto")
	private ArrayList<Agendamento> agendamentos;
	
	@OneToMany(mappedBy = "estabelecimento")
	private ArrayList<Movimentacao> movimentacoes;
	
	@OneToMany(mappedBy = "estabelecimento")
	private ArrayList<Produto> produtos;
	
	@OneToMany(mappedBy = "estabelecimento")
	private ArrayList<ContasaPagar>contasaPagar;
	
	@OneToMany(mappedBy = "estabelecimento")
	private ArrayList<Cliente> clientes;
	
	@OneToMany(mappedBy = "estabelecimento")
	private ArrayList<Servico> servicos;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefoneFax() {
		return telefoneFax;
	}
	public void setTelefoneFax(String telefoneFax) {
		this.telefoneFax = telefoneFax;
	}
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	public String getTelefoneComercial() {
		return telefoneComercial;
	}
	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	public ArrayList<Agendamento> getAgendamentos() {
		return agendamentos;
	}
	public void setAgendamentos(ArrayList<Agendamento> agendamentos) {
		this.agendamentos = agendamentos;
	}
	public ArrayList<Movimentacao> getMovimentacoes() {
		return movimentacoes;
	}
	public void setMovimentacoes(ArrayList<Movimentacao> movimentacoes) {
		this.movimentacoes = movimentacoes;
	}
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	public ArrayList<ContasaPagar> getContasaPagar() {
		return contasaPagar;
	}
	public void setContasaPagar(ArrayList<ContasaPagar> contasaPagar) {
		this.contasaPagar = contasaPagar;
	}
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public ArrayList<Servico> getServicos() {
		return servicos;
	}
	public void setServicos(ArrayList<Servico> servicos) {
		this.servicos = servicos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estabelecimento other = (Estabelecimento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
