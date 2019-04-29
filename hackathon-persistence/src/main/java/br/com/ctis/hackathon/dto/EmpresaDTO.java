package br.com.ctis.hackathon.dto;

import java.util.ArrayList;

import br.com.ctis.hackathon.enumeration.StatusEnum;

public class EmpresaDTO extends BaseDTO {

	private static final long serialVersionUID = 4538327150278203065L;

	
	private EnderecoDTO endereco;
	
	
	private String razoaSocial;
	
	private String nomeFantasia;
	

	private String email;
	

	private String cnpj;
	
	
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
	 * @return the razoaSocial
	 */
	public String getRazoaSocial() {
		return razoaSocial;
	}


	/**
	 * @param razoaSocial the razoaSocial to set
	 */
	public void setRazoaSocial(String razoaSocial) {
		this.razoaSocial = razoaSocial;
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

