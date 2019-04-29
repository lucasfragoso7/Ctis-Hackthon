package br.com.ctis.hackathon.endpoint.impl;

import javax.ejb.EJB;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.ctis.hackathon.dto.MensagemRetornoDTO;
import br.com.ctis.hackathon.dto.PessoaDTO;
import br.com.ctis.hackathon.dto.PessoaPutDTO;
import br.com.ctis.hackathon.endpoint.PessoaEndPoint;
import br.com.ctis.hackathon.service.PessoaService;

public class PessoaEndPointImpl implements PessoaEndPoint {

	@EJB
	private PessoaService pessoaService;
	
	@Override
	public Response listar() {
		return Response.status(Status.OK).entity(pessoaService.listarTodos()).build();
	}

	@Override
	public Response cadastrar(PessoaDTO pessoaDTO) {
		pessoaService.cadastrar(pessoaDTO);
		return Response.status(Status.CREATED).entity(new MensagemRetornoDTO("Pessoa cadastrado com sucesso!")).build();
	}
	@Override
	public Response atualizar(PessoaPutDTO pessoaPutDTO) {
		pessoaService.atualizar(pessoaPutDTO);
		return Response.status(Status.CREATED).entity(new MensagemRetornoDTO("Pessoa atualizada com sucesso!")).build();
	}

	@Override
	public Response buscarPessoaPorId(Long id) {
		return Response.status(Status.OK).entity(pessoaService.buscarPessoaPorId(id)).build();
	}
	@Override
	public Response deletarPessoa(Long id) {
		pessoaService.excluir(id);
		return Response.status(Status.OK).entity(new MensagemRetornoDTO("Pessoa excluida com sucesso!")).build();
	}
	

}
