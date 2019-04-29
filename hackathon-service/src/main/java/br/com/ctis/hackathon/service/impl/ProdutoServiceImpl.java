package br.com.ctis.hackathon.service.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import br.com.ctis.hackathon.converter.Converter;
import br.com.ctis.hackathon.dto.ProdutoDTO;
import br.com.ctis.hackathon.dto.ProdutoPutDTO;
import br.com.ctis.hackathon.enumeration.MensagemEnum;
import br.com.ctis.hackathon.exception.DAOException;
import br.com.ctis.hackathon.exception.NegocioException;
import br.com.ctis.hackathon.exception.RegistroNaoEncontradoException;
import br.com.ctis.hackathon.persistence.dao.ProdutoDAO;
import br.com.ctis.hackathon.persistence.model.Produto;
import br.com.ctis.hackathon.service.ProdutoService;
import br.com.ctis.hackathon.util.MensagemUtil;
@Stateless
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class ProdutoServiceImpl extends GenericServiceImpl<Long, Produto> implements ProdutoService {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5086080116482602823L;
	/**
	 * 
	 */

	@EJB
	private ProdutoDAO produtoDAO;

	@Override
	public List<Produto> listarTodos() {

		try {
			return produtoDAO.listarTodos();
		} catch (DAOException e) {
			throw new NegocioException(MensagemUtil.getMessage(MensagemEnum.MSG001));
		}

	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public void cadastrar(ProdutoDTO produtoDTO) {

		produtoDAO.gravar(Converter.getInstance().converter(produtoDTO, Produto.class));
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public void atualizar(ProdutoPutDTO produtoPutDTO) {

		produtoDAO.gravar(Converter.getInstance().converter(produtoPutDTO, Produto.class));
	}

	@Override
	public Produto buscarProdutoPorId(Long id) {

		try {
			return produtoDAO.buscarProdutoPorId(id);
		} catch (RegistroNaoEncontradoException e) {
			throw new NegocioException("Produto com Identificador " + id + " não encontrado");
		} catch (DAOException e) {
			throw new NegocioException(MensagemUtil.getMessage(MensagemEnum.MSG001));
		}

	}

}
