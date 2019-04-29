package br.com.ctis.hackathon.endpoint;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.com.ctis.hackathon.dto.PessoaDTO;
import br.com.ctis.hackathon.dto.PessoaPutDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * Endpoint com intuito de representar o modelo Pessoa na hora das requisições rest
 * 
 * @author andre.fragoso95@gmail.com
 *
 */
@Path("pessoas")
@Tag(name = "Pessoa")
public interface PessoaEndPoint {

	@GET
	@Produces("application/json")
	@Operation(description = "Lista todas as Pessoas que existe no sistema", summary = "Listar Pessoas", responses = {
			@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json")),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not found"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error") })
	Response listar();

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	@Operation(description = "Recurso para cadastrar uma nova Pessoa no sistema", summary = "Adicionar uma nova Pesssoa", responses = {
			@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json")),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not found"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error") })
	Response cadastrar(
			@RequestBody(description = "Objeto Pessoa que será adicionado", required = true, content = @Content(schema = @Schema(implementation = PessoaDTO.class))) @Valid PessoaDTO pessoaDTO);

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	@Operation(description = "Recurso para atualizar uma nova Pessoa no sistema", summary = "Atualizar uma Pesssoa", responses = {
			@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json")),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not found"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error") })
	Response atualizar(
			@RequestBody(description = "Objeto Pessoa que será adicionado", required = true, content = @Content(schema = @Schema(implementation = PessoaPutDTO.class))) @Valid PessoaPutDTO produtoDTO);

	@GET
	@Path("{id}")
	@Produces("application/json")
	@Operation(description = "Recurso para mostrar o Pessoa no sistema segundo o Id", summary = "Mostrar Pessoa", responses = {
			@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json")),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not found"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error") })
	Response buscarPessoaPorId(@PathParam(value = "id") Long id);

@DELETE
@Path("{id}")
@Produces("application/json")
@Operation(description = "Recurso para Deletar o Pessoa no sistema segundo o Id", summary = "Deletar Pessoa", responses = {
		@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json")),
		@ApiResponse(responseCode = "400", description = "Bad Request"),
		@ApiResponse(responseCode = "404", description = "Not found"),
		@ApiResponse(responseCode = "500", description = "Internal Server Error") })
	Response deletarPessoa(@PathParam(value = "id") Long id);
}
