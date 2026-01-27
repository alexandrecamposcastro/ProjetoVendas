
package br.com.alexandrecamposcastro.dao;

import br.com.alexandrecamposcastro.dao.generic.GenericDAO;
import br.com.alexandrecamposcastro.domain.Venda;
import br.com.alexandrecamposcastro.domain.Venda.Status;
import br.com.alexandrecamposcastro.exceptions.TipoChaveNaoEncontradaException;


public class VendaDAO extends GenericDAO<Venda, String> implements IVendaDAO {

	@Override
	public Class<Venda> getTipoClasse() {
		return Venda.class;
	}

	@Override
	public void atualiarDados(Venda entity, Venda entityCadastrado) {
		entityCadastrado.setCodigo(entity.getCodigo());
		entityCadastrado.setStatus(entity.getStatus());
	}

	@Override
	public void excluir(String valor) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {
		venda.setStatus(Status.CONCLUIDA);
		super.alterar(venda);
	}
	
	

}
