
/*
  Matéria:SWII5 – ADS 571 - TP02
  FABRICIO CARLOS GUIMARAES CB3014886
  BENILDES FERNANDES DE MENEZES CB3004392
  
 */

package CrudProduto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Produto> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;

	static {

		Produto produto = new Produto();
		produto.setId(chaveSequencial++);
		produto.setNome("ARROZ CAMIL");
		produto.setUnidadeCompra(3);
		produto.setDescricao("Arroz 5 KG integral");
		produto.setQtPrevistoMes(4);
		produto.setPrecoMaxComprado(20.00);
						
		
		Produto produto2 = new Produto();
		produto2.setId(chaveSequencial++);
		produto2.setNome("FEIJAO DE CORDA");
		produto2.setUnidadeCompra(5);
		produto2.setDescricao("Feijão NAMORADO 1 KG");
		produto2.setQtPrevistoMes(7);
		produto2.setPrecoMaxComprado(12.00);
			
		lista.add(produto);
		lista.add(produto2);

	}

	public void adiciona(Produto produto) {
		produto.setId(Banco.chaveSequencial++);
		Banco.lista.add(produto);
	}

	public List<Produto> getProdutos() {

		return Banco.lista;
	}

	public void removeProduto(Integer id) {

		Iterator<Produto> it = lista.iterator();

		while (it.hasNext()) {
			Produto prod = it.next();

			if (prod.getId() == id) {

				it.remove();

			}

		}

	}
	
	public Produto buscaProdutoPelaId(Integer id) {
		
		for(Produto produto : lista) {
			if(produto.getId() == id) {
				return produto;
			}
		}
		
		return null;
		
	}
	
	
}
