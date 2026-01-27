 
package br.com.alexandrecamposcastro.services;

import br.com.alexandrecamposcastro.domain.Cliente;
import br.com.alexandrecamposcastro.exceptions.TipoChaveNaoEncontradaException;
 
public interface IClienteService {

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
