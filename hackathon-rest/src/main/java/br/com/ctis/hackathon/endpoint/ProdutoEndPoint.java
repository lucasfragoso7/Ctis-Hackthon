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

import br.com.ctis.hackathon.dto.ProdutoDTO;
import br.com.ctis.hackathon.dto.ProdutoPutDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * Endpoint com intuito de representar o modelo Produto na hora das requisições rest
 *  
 * @author andre.fragoso95@gmail.com
 *
 */
@Path("produtos")
@Tag(name = "produto")
public interface ProdutoEndPoint {

	@GET
	@Produces("application/json")
	@Operation(description = "Lista todos Produtos que existe no sistema", summary = "Listar Produtos", responses = {
			@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json")),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not found"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error") })
	Response listar();

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	@Operation(description = "Recurso para cadastrar um novo Produto no sistema", summary = "Adicionar um novo Produto", responses = {
			@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json")),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not found"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error") })
	Response cadastrar(
			@RequestBody(description = "Objeto Produto que será adicionado", required = true, content = @Content(schema = @Schema(implementation = ProdutoDTO.class))) @Valid ProdutoDTO produtoDTO);


	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	@Operation(description = "Recurso para atualizar uma nova Pessoa no sistema", summary = "Atualizar um Produto", responses = {
			@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json")),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not found"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error") })
	Response atualizar(
			@RequestBody(description = "Objeto Pessoa que será adicionado", required = true, content = @Content(schema = @Schema(implementation = ProdutoPutDTO.class))) @Valid ProdutoPutDTO produtoDTO);

	@GET
	@Path("{id}")
	@Produces("application/json")
	@Operation(description = "Recurso para mostrar o Produto no sistema segundo o Id", summary = "Mostrar Produto", responses = {
			@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json")),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not found"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error") })
	Response buscarProdutoPorId(@PathParam(value = "id") Long id);
	
	@DELETE
	@Path("{id}")
	@Produces("application/json")
	@Operation(description = "Recurso para Deletar o Produto no sistema segundo o Id", summary = "Deletar Pruduto", responses = {
			@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json")),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not found"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error") })
		Response deletarProduto(@PathParam(value = "id") Long id);

}

