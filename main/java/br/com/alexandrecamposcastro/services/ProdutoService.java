 
package br.com.alexandrecamposcastro.services;

import br.com.alexandrecamposcastro.dao.IProdutoDAO;
import br.com.alexandrecamposcastro.domain.Produto;
import br.com.alexandrecamposcastro.services.generic.GenericService;

 
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
