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

import br.com.ctis.hackathon.dto.EmpresaDTO;
import br.com.ctis.hackathon.dto.EmpresaPutDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
/**
 * Endpoint com intuito de representar o modelo Empresa na hora das requisições rest
 *  
 * @author andre.fragoso95@gmail.com
 *
 */
@Path("empresas")
@Tag(name = "Empresa")
public interface EmpresaEndPoint {

	@GET
	@Produces("application/json")
	@Operation(description = "Lista todas as Empresas que existe no sistema", summary = "Listar Empresas", responses = {
			@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json")),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not found"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error") })
	Response listar();

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	@Operation(description = "Recurso para cadastrar uma nova Empresa no sistema", summary = "Adicionar uma nova Empresa", responses = {
			@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json")),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not found"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error") })
	Response cadastrar(
			@RequestBody(description = "Objeto Empresa que será adicionado", required = true, content = @Content(schema = @Schema(implementation = EmpresaDTO.class))) @Valid EmpresaDTO empresaDTO);


	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	@Operation(description = "Recurso para atualizar uma nova Empresa no sistema", summary = "Atualizar uma Empresa", responses = {
			@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json")),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not found"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error") })
	Response atualizar(
			@RequestBody(description = "Objeto Pessoa que será adicionado", required = true, content = @Content(schema = @Schema(implementation = EmpresaPutDTO.class))) @Valid EmpresaPutDTO empresaPutDTO);

	@GET
	@Path("{id}")
	@Produces("application/json")
	@Operation(description = "Recurso para mostrar o Empresa no sistema segundo o Id", summary = "Mostrar Empresa", responses = {
			@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json")),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not found"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error") })
	Response buscarEmpresaPorId(@PathParam(value = "id") Long id);
	
	@DELETE
	@Path("{id}")
	@Produces("application/json")
	@Operation(description = "Recurso para Deletar o Empresa no sistema segundo o Id", summary = "Deletar Empresa", responses = {
			@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json")),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not found"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error") })
		Response deletarEmpresa(@PathParam(value = "id") Long id);
}
