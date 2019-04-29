package br.com.ctis.hackathon.dto;

import java.util.ArrayList;

import br.com.ctis.hackathon.enumeration.StatusEnum;

public class PessoaDTO extends BaseDTO {

	private static final long serialVersionUID = 4538327150278203065L;


	

	private EnderecoDTO endereco;
	
	
	private String nome;
	
	

	private String sobrenome;
	

	private String email;
	
	
	
	private String cpf;
	
	
	
	private ArrayList<TelefoneDTO> telefones;
	
	
	private StatusEnum status;

	/**
	 * @return the endereco
	 */
	public EnderecoDTO getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the sobrenome
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * @param sobrenome the sobrenome to set
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the telefones
	 */
	public ArrayList<TelefoneDTO> getTelefones() {
		return telefones;
	}

	/**
	 * @param telefones the telefones to set
	 */
	public void setTelefones(ArrayList<TelefoneDTO> telefones) {
		this.telefones = telefones;
	}

	/**
	 * @return the status
	 */
	public StatusEnum getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(StatusEnum status) {
		this.status = status;
	}
	
}

