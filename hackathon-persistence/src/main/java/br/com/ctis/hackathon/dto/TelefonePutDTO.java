package br.com.ctis.hackathon.dto;

public class TelefonePutDTO extends BaseDTO {

	private static final long serialVersionUID = 4538327150278203065L;


	private Long id;
	
	private String numero;


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
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}


	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}


}

