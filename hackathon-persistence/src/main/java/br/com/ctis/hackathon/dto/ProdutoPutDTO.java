package br.com.ctis.hackathon.dto;

import java.util.List;

import br.com.ctis.hackathon.enumeration.StatusEnum;

public class ProdutoPutDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 683875662590999444L;

	private Long id;


	private String nome;


	private Float preco;


	private Integer dataDeCriacao;


	
	private List<String> categorias;

	
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
	 * @return the preco
	 */
	public float getPreco() {
		return preco;
	}

	/**
	 * @param preco the preco to set
	 */
	public void setPreco(float preco) {
		this.preco = preco;
	}

	/**
	 * @return the dataDeCriacao
	 */
	public Integer getDataDeCriacao() {
		return dataDeCriacao;
	}

	/**
	 * @param dataDeCriacao the dataDeCriacao to set
	 */
	public void setDataDeCriacao(Integer dataDeCriacao) {
		this.dataDeCriacao = dataDeCriacao;
	}

	/**
	 * @return the categorias
	 */
	public List<String> getCategorias() {
		return categorias;
	}

	/**
	 * @param categorias the categorias to set
	 */
	public void setCategorias(List<String> categorias) {
		this.categorias = categorias;
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
