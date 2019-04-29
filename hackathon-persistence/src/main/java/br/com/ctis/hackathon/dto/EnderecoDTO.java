package br.com.ctis.hackathon.dto;

public class EnderecoDTO extends BaseDTO {

	private static final long serialVersionUID = 4538327150278203065L;



	private String logradouro;
	
	

	private String numero;
	
	
	
	private String complemento;
	
	
	
	private String bairro;
	
	
	
	private String cidade;
	
	
	
	private String uf;


	/**
	 * @return the logradouro
	 */
	public String getLogradouro() {
		return logradouro;
	}


	/**
	 * @param logradouro the logradouro to set
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
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


	/**
	 * @return the complemento
	 */
	public String getComplemento() {
		return complemento;
	}


	/**
	 * @param complemento the complemento to set
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}


	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}


	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	/**
	 * @return the uf
	 */
	public String getUf() {
		return uf;
	}


	/**
	 * @param uf the uf to set
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}

}

