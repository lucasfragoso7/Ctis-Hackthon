package br.com.ctis.hackathon.dto;

import java.util.ArrayList;

import br.com.ctis.hackathon.enumeration.StatusEnum;

public class EmpresaPutDTO extends BaseDTO {

	private static final long serialVersionUID = 4538327150278203065L;
		private Long id;
	
	
	private EnderecoPutDTO endereco;
	
	
	private String razaoSocial;
	
	
	private String nomeFantasia;
	
	
	private String email;
	
	
	private String cnpj;
	
	
	private ArrayList<TelefonePutDTO> telefones;
	
	
	
	private StatusEnum status;


	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * @return the endereco
	 */
	public EnderecoPutDTO getEndereco() {
		return endereco;
	}


	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(EnderecoPutDTO endereco) {
		this.endereco = endereco;
	}


	/**
	 * @return the razaoSocial
	 */
	public String getRazaoSocial() {
		return razaoSocial;
	}


	/**
	 * @param razaoSocial the razaoSocial to set
	 */
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}


	/**
	 * @return the nomeFantasia
	 */
	public String getNomeFantasia() {
		return nomeFantasia;
	}


	/**
	 * @param nomeFantasia the nomeFantasia to set
	 */
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
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
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}


	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	/**
	 * @return the telefones
	 */
	public ArrayList<TelefonePutDTO> getTelefones() {
		return telefones;
	}


	/**
	 * @param telefones the telefones to set
	 */
	public void setTelefones(ArrayList<TelefonePutDTO> telefones) {
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

