
package br.com.alexandrecamposcastro.dao;

import br.com.alexandrecamposcastro.dao.generic.IGenericDAO;
import br.com.alexandrecamposcastro.domain.Venda;
import br.com.alexandrecamposcastro.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
