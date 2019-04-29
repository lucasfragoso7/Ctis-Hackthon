package br.com.ctis.hackathon.service.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import br.com.ctis.hackathon.converter.Converter;
import br.com.ctis.hackathon.dto.PessoaDTO;
import br.com.ctis.hackathon.dto.PessoaPutDTO;
import br.com.ctis.hackathon.enumeration.MensagemEnum;
import br.com.ctis.hackathon.exception.DAOException;
import br.com.ctis.hackathon.exception.NegocioException;
import br.com.ctis.hackathon.exception.RegistroNaoEncontradoException;
import br.com.ctis.hackathon.persistence.dao.PessoaDAO;
import br.com.ctis.hackathon.persistence.model.Pessoa;
import br.com.ctis.hackathon.service.PessoaService;
import br.com.ctis.hackathon.util.MensagemUtil;
@Stateless
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class PessoaServiceImpl extends GenericServiceImpl<Long, Pessoa> implements PessoaService {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6826007837387020698L;
	@EJB
	private PessoaDAO pessoaDAO;

	@Override
	public List<Pessoa> listarTodos() {

		try {
			return pessoaDAO.listarTodos();
		} catch (DAOException e) {
			throw new NegocioException(MensagemUtil.getMessage(MensagemEnum.MSG001));
		}

	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public void cadastrar(PessoaDTO pessoaDTO) {

		pessoaDAO.gravar(Converter.getInstance().converter(pessoaDTO,Pessoa.class));
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public void atualizar(PessoaPutDTO pessoaPutDTO) {

		pessoaDAO.gravar(Converter.getInstance().converter(pessoaPutDTO,Pessoa.class));
	}


	@Override
	public Pessoa buscarPessoaPorId(Long id) {

		try {
			return pessoaDAO.buscarPessoaPorId(id);
		} catch (RegistroNaoEncontradoException e) {
			throw new NegocioException("Pessoa com Identificador " + id + " não encontrado");
		} catch (DAOException e) {
			throw new NegocioException(MensagemUtil.getMessage(MensagemEnum.MSG001));
		}

	}


}
