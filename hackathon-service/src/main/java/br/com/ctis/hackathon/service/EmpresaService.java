package br.com.ctis.hackathon.service;

import java.util.List;

import javax.ejb.Local;

import br.com.ctis.hackathon.dto.EmpresaDTO;
import br.com.ctis.hackathon.dto.EmpresaPutDTO;
import br.com.ctis.hackathon.persistence.model.Empresa;
@Local
public interface EmpresaService extends GenericService<Long, Empresa> {
	/**
	 * Listar todos os Empresas cadastrados no sistema
	 * 
	 * @return {@link List<Empresa>} - Lista com Empresas cadastrados
	 */
	List<Empresa> listarTodos();

	/**
	 * Cadastrar um novo Empresa no sistema
	 * 
	 * @param empresaPutDTO - Parâmetro de entrada para cadastro do Empresa
	 */
	void atualizar(EmpresaPutDTO empresaDTO);
	
	/**
	 * Cadastrar um novo Empresa no sistema
	 * 
	 * @param empresaDTO - Parâmetro de entrada para cadastro do Empresa
	 */
	void cadastrar(EmpresaDTO empresaDTO);
	
	/**
	 * Recuperar Empresa pelo Id
	 * 
	 * @param id - Identificado do Empresa na base de dados
	 * 
	 * @return {@link Empresa} - Representa um Empresa cadastrado no sistema
	 */
	Empresa buscarEmpresaPorId(Long id);
}
